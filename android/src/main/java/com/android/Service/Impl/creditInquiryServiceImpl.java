package com.android.Service.Impl;

import com.android.Service.ExamineService;
import org.springframework.beans.factory.annotation.Autowired;

public class creditInquiryServiceImpl {
    @Autowired
    private ExamineService examineService;

    private String assurerNo;
    private String bankCode;
    private String platNo;
    private String busiCode = "1001";
    private String productType;
    private String orderNo;
    private String bankType;
}
