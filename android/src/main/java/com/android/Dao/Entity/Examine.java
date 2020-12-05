package com.android.Dao.Entity;

import lombok.Data;

@Data
public class Examine {
    /**主键id*/
    private Integer id;
    /**销售团队*/
    private String team;
    /**车辆信息*/
    private String carInformation;
    /**意向价格*/
    private String intentionPrice;
    /**意向贷款金额*/
    private String intentionGold;
    /**意向贷款期限*/
    private String intentionTime;
    /**征信授权*/
    private String creditPower;
    /**借款人姓名*/
    private String borrowerName;
    /**借款人身份证号*/
    private String borrowerNumber;
    /**借款人银行卡号*/
    private String borrowerCard;
    /**借款人手机号*/
    private String borrowerPhone;
    /**借款人征信授权书*/
    private String borrowerBook;
    /**借款人授权书签字照*/
    private String borrowerPicture;
    /**借款人手持授权书+身份证照片*/
    private String borrowerPhoto;
    /**关联人姓名*/
    private String relationName;
    /**关联人身份证号*/
    private String relationNumber;
    /**关联人银行卡号*/
    private String relationCard;
    /**关联人手机号*/
    private String relationPhone;
    /**关联人征信授权书*/
    private String relationBook;
    /**关联人授权书签字照*/
    private String relationPicture;
    /**关联人手持身份证+授权书*/
    private String relationPhoto;
    /**关联人与借款人关系*/
    private String relationShip;
    /**业务角色*/
    private String businessRole;
    /**担保人姓名*/
    private String guaranteeName;
    /**担保人身份证号*/
    private String guaranteeNumber;
    /**担保人银行卡号*/
    private String guaranteeCard;
    /**担保人手机号*/
    private String guaranteePhone;
    /**担保人与借款人关系*/
    private String guaranteeShip;
    /**担保人征信授权书*/
    private String guaranteeBook;
    /**担保人授权书签字照*/
    private String guaranteePicture;
    /**担保人手持授权书+身份证*/
    private String guaranteePhoto;
}
