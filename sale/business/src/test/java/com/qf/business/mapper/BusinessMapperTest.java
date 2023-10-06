package com.qf.business.mapper;

import com.qf.business.common.dto.BusinessDto;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class BusinessMapperTest {
    @Autowired
    private BusinessMapper businessMapper;

    @Test
    void selectBusinessByPage() {
        log.info(businessMapper.selectBusinessByPage(new BusinessDto())+"");
    }
}