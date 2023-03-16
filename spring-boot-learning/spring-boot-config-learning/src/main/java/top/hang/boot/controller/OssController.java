package top.hang.boot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.hang.boot.service.UploadService;

import java.io.IOException;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/16 16:12
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OssController {
    private final UploadService uploadService;
    @PostMapping("/upload")
    public String upload(MultipartFile file){
        return uploadService.upload(file);
    }
}
