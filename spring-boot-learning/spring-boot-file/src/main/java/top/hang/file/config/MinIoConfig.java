package top.hang.file.config;

import io.minio.*;
import io.minio.errors.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/4/10 15:11
 */
@Configuration
public class MinIoConfig {
    // minio上传
    @Value("${minio.endpoint}")
    private String endpoint;
    @Value("${minio.accessKey}")
    private String accessKey;
    @Value("${minio.secretKey}")
    private String secretKey;
    private MinioClient instance;

    @PostConstruct
    public void init() {
        instance = MinioClient.builder()
                .endpoint(endpoint)
                .credentials(accessKey, secretKey)
                .build();
    }

    /***
     * @description bucket是否存在
     * @param bucketName  bucket名称
     * @return boolean
     */
    public boolean bucketExists(String bucketName) throws Exception {
        return instance.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());

    }

    /***
     * @description 创建bucket
     * @param bucketName  bucket名称
     * @return void
     */
    public void makeBucket(String bucketName) throws Exception {
        boolean flat = bucketExists(bucketName);
        if (!flat) {
            instance.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
        }
    }

    /***
     * @description 上传文件
     * @param bucketName  bucket名称
     * @param objectName  文件名称
     * @param filename  文件路径
     * @return 响应结果
     */
    public ObjectWriteResponse uploadObject(String bucketName, String objectName, String filename) throws Exception {
        return instance.uploadObject(
                UploadObjectArgs.builder()
                        .bucket(bucketName)
                        .object(objectName)
                        .filename(filename)
                        .build());
    }

    /***
     * @description 上传文件
     * @param bucketName  bucket名称
     * @param objectName  文件名称
     * @param inputStream  文件流
     * @return 响应结果
     */
    public ObjectWriteResponse putObject(String bucketName, String objectName, InputStream inputStream) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        return instance.putObject(PutObjectArgs.builder()
                .bucket(bucketName)
                .object(objectName)
                .stream(inputStream, -1, 10485760)
                .build());
    }

    /***
     * @description 删除文件
     * @param bucketName 存储桶名称
     * @param objectName 文件名称
     * @return
     */
    public void removeObject(String bucketName, String objectName) throws Exception {
        instance.removeObject(RemoveObjectArgs.builder().bucket(bucketName).object(objectName).build());
    }

}
