package top.hang.service.impl;

import org.springframework.stereotype.Service;
import top.hang.common.MyCustoms;
import top.hang.exception.CustomException;
import top.hang.service.ArticleService;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/28 14:25
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public void systemError(Integer id) {
        throw new CustomException(MyCustoms.SYSTEM_ERROR, MyCustoms.SYSTEM_ERROR_MSG);
    }

    @Override
    public void businessError(Integer id) {
        throw new CustomException(MyCustoms.SYSTEM_ERROR, MyCustoms.BUSINESS_ERROR_MSG);
    }
}
