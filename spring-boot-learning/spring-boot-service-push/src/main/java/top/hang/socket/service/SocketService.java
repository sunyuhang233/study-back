package top.hang.socket.service;

import jakarta.websocket.*;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Ahang
 * @version 1.0
 * @description Socket服务类 SpringBoot服务端 WebSocket 服务类
 * @date 2023/4/17 15:41
 */
@Component
@Slf4j
@ServerEndpoint(value = "/socket/{id}")
public class SocketService {

    /**
     * 用来存放每个客户端对应的MyWebSocket对象。
     * ConcurrentMap是线程安全的，key是sessionId，value是MyWebSocket对象
     */
    public static final Map<Integer, SocketService> map = new ConcurrentHashMap<>();
    /**
     * 连接数
     */
    private static int onlineCount = 0;
    /**
     * 与某个客户端的连接会话，需要通过它来给客户端发送数据
     */
    private Session session;

    private Integer id;

    /**
     * 在线人数加1 加锁 防止并发 线程安全
     */

    public static synchronized void addOnlineCount() {
        SocketService.onlineCount++;
    }

    /**
     * 在线人数减1 加锁 防止并发 线程安全
     */
    public static synchronized void subOnlineCount() {
        SocketService.onlineCount--;
    }

    /**
     * 获取在线人数
     */
    public static synchronized int getOnlineCount() {
        return SocketService.onlineCount;
    }

    /**
     * 群发消息
     *
     * @param msg 消息内容
     */
    public static void broadcastMsg(String msg) {
        for (SocketService socketService : map.values()) {
            socketService.sendMessage(msg);
        }

    }

    /**
     * 发送消息 给指定用户
     *
     * @param id  用户id
     * @param msg 消息内容
     */
    public static void send(Integer id, String msg) {
        SocketService socketService = map.get(id);
        if (socketService != null) {
            socketService.sendMessage(msg);
        } else {
            log.info("用户不在线！");
        }
    }


    /**
     * 获取session
     */
    public Session getSession() {
        return session;
    }

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("id") Integer id) {
        log.info("连接成功！");
        this.session = session;
        this.id = id;
        map.put(id, this);
        // 在线数加1
        addOnlineCount();
        log.info("有新连接加入！当前在线人数为" + getOnlineCount());
        sendMessage("----连接成功！----");
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        log.info("有一连接关闭！");
        // 从map中删除
        map.remove(this.id);
        // 在线数减1
        subOnlineCount();
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(Session session, String message) {
        log.info("收到客户端消息：" + message);
//        sendMessage("----收到客户端消息：" + message + "----");
        broadcastMsg("----收到客户端消息：" + message + "----");
    }

    /**
     * 发生错误时调用
     *
     * @param error 错误信息
     */
    @OnError
    public void onError(Throwable error) {
        log.error(error.getMessage());
        error.printStackTrace();
    }

    private void sendMessage(String msg) {
        getSession().getAsyncRemote().sendText(msg);
        log.info("发送消息给客户端：" + msg);
    }


}
