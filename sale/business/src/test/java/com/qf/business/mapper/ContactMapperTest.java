package com.qf.business.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class ContactMapperTest {
    @Resource
    private ContactMapper contactMapper;

    @Test
    void list() {
        log.info(contactMapper.list()+"");

    }
}