package top.hang.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/4/4 15:27
 */

@RestController
@RequestMapping("/erweima")
public class ErWeiMa {
    @GetMapping("/get")
    public void getErWeiMa(HttpServletRequest request, HttpServletResponse response) throws IOException {
        QrConfig config = new QrConfig(300, 300);
        config.setMargin((int) (Math.random() * 100));
        String timeMillis = String.valueOf(System.currentTimeMillis());
        // 1.生成二维码到文件
        File file = QrCodeUtil.generate(timeMillis, config, FileUtil.file("D:\\test.png"));
        // 2.设置响应类型
        response.setContentType("image/png");
        // 3.输出二维码图片流
        response.getOutputStream().write(FileUtil.readBytes(file));
        response.getOutputStream().flush();
        response.getOutputStream().close();

    }
}
