package top.hang.file.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.hang.file.config.MinIoConfig;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/4/10 13:58
 */
@RestController
public class FileUploadController {
    DateFormat df = new SimpleDateFormat("yyyyMMdd");
    @Value("${web.upload-path}")
    private String uploadPath;

    @Value("${minio.endpoint}")
    private String endpoint;

    @Resource
    private MinIoConfig minIoConfig;


    //    本地上传
    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request) throws IOException {
        // 创建子目录 实现了按日期存储
        String format = df.format(new Date());
        // 创建文件夹 需要拼接 传过来的文件夹 + \\ + 子目录
        File folder = new File(uploadPath + "\\" + format);
        // 判断是否为目录
        if (!folder.isDirectory()) {
            folder.mkdir();
        }
        // 获取文件名
        String originalFilename = file.getOriginalFilename();
        String newFilename = null;
        // 对每次上传的文件进行重命名 防止文件名重复
        if (originalFilename != null) {
            newFilename = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
        }

        // 上传文件
        assert newFilename != null;
        file.transferTo(new File(folder, newFilename));

        // 返回上传成功的路径
        // request.getScheme() 获取协议
        // request.getServerName() 获取域名
        // request.getServerPort() 获取端口号
        // 完成文件名 : http://localhost:8080/20230410/7bca146f-2296-4be9-b463-ba616ea6956b.jpg
        return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/" + format + "/" + newFilename;
    }


    @PostMapping("/upload2")
    public String upload2(MultipartFile file) {
        // 获取文件名
        String originalFilename = file.getOriginalFilename();
        String newFilename = null;
        // 对每次上传的文件进行重命名 防止文件名重复
        if (originalFilename != null) {
            newFilename = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
        }
        try {
            minIoConfig.makeBucket("test");
            minIoConfig.putObject("test", newFilename, file.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "http://106.14.246.27:9000" + "/" + "test" + "/" + newFilename;
    }

}
