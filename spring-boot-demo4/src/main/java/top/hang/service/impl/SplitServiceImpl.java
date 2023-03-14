package top.hang.service.impl;

import org.springframework.util.StringUtils;
import top.hang.service.ISplitService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitServiceImpl implements ISplitService {
    @SuppressWarnings("all")
    @Override
    public List<String> split(String value) {
        return Stream.of(StringUtils.split(value, ",")).collect(Collectors.toList());
    }
}