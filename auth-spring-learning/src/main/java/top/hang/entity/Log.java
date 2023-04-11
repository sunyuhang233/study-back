package top.hang.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/4/3 16:16
 */
@Entity
@Table(name = "log", schema = "auth", catalog = "")
public class Log implements Serializable {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "ip")
    private String ip;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "method")
    private String method;
    @Basic
    @Column(name = "classname")
    private String classname;
    @Basic
    @Column(name = "mylog")
    private String mylog;

    public Log() {

    }

    public Log(String ip, String url, String method, String classname, String mylog) {
        this.ip = ip;
        this.url = url;
        this.method = method;
        this.classname = classname;
        this.mylog = mylog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getMylog() {
        return mylog;
    }

    public  void setMyLog(String mylog) {
        this.mylog = mylog;
    }
    public String getMyLog() {
        return this.mylog;
    }

    public void setMylog(String mylog) {
        this.mylog = mylog;
    }

    public Log(int id, String ip, String url, String method, String classname, String mylog) {
        this.id = id;
        this.ip = ip;
        this.url = url;
        this.method = method;
        this.classname = classname;
        this.mylog = mylog;
    }


}
