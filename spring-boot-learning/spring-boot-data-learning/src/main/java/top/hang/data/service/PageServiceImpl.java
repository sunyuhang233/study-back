package top.hang.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import top.hang.data.entity.Discuss;
import top.hang.data.repository.DiscussRepository;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/20 15:19
 */
@Service
public class PageServiceImpl implements PageService{
    @Autowired
    private DiscussRepository discussRepository;
    @Override
    public List<Discuss> page(Integer pageNum, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        return discussRepository.getDiscussByPage(pageable);
    }
}
