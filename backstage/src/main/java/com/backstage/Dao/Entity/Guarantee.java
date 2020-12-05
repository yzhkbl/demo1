package com.backstage.Dao.Entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Guarantee {
    private Integer id;
    /**担保人姓名*/
    private String userName;
    /**担保人身份证号*/
    private String idCard;
    /**担保人银行卡号*/
    private String bankCardNo;
    /**担保人手机号码*/
    private String phoneNumber;
    /**身份证签发机关*/
    private String issueAuthority;
    /**证件有效期起始日*/
    private String startDate;
    /**证件有效期截止日*/
    private String endDate;
    /**住宅地址*/
    private String familyAddress;
    /**单位名称*/
    private String company;
    /**单位地址*/
    private String companyAddress;
    /**个人年收入*/
    private BigDecimal yearIncome;
    /**身份证正面id*/
    private String obverseId;
    /**身份证正面code*/
    private String obverseCode;
    /**身份证正面图下载地址*/
    private String obverseAddress;
    /**身份证正面jpg*/
    private String obverseName;
    /**身份证反面id*/
    private String backId;
    /**身份证反面code*/
    private String backCode;
    /**身份证反面图下载地址*/
    private String backAddress;
    /**身份证反面jpg*/
    private String backName;
    /**授权书id*/
    private String powerId;
    /**授权书code*/
    private String powerCode;
    /**授权书下载地址*/
    private String powerAddress;
    /**授权书jpg*/
    private String powerName;
    /**征信授权*/
    private Integer creditPower;
    /**与借款人的关系*/
    private String peopleShip;
    /**身份唯一识别码*/
    private String identityId;
    private Boolean orderState;
}