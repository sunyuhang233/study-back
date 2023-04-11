package top.hang.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.hang.entity.LogUser;
import top.mapper.LogUserMapper;

@Service
public class LogUserServiceImpl extends ServiceImpl<LogUserMapper, LogUser> implements ILogUserService {
}
