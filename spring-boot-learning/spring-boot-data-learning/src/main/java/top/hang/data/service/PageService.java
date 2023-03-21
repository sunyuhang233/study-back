package top.hang.data.service;

import org.springframework.stereotype.Service;
import top.hang.data.entity.Discuss;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/20 15:17
 */
public interface PageService {
    List<Discuss> page(Integer pageNum, Integer pageSize);
}
