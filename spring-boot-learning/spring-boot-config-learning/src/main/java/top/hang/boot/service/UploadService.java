package top.hang.boot.service;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.hang.boot.config.OssConfig;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/16 16:08
 */
@Service
public class UploadService {
    @Autowired
    private OssConfig ossConfig;

    public String upload(MultipartFile file) {
        String endpoint = ossConfig.getEndpoint();
        String bucket = ossConfig.getBucket();
        String dir = ossConfig.getDir();
        String host = ossConfig.getHost();
        String accessKeyId = ossConfig.getAk();
        String accessKeySecret = ossConfig.getSecret();
        OSS oss = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        String path = dir + file.getOriginalFilename();
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        oss.putObject(bucket, path, inputStream);
        oss.shutdown();
        return host + path;
    }

}
