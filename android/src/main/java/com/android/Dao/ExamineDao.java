package com.android.Dao;

import com.android.Dao.Entity.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExamineDao {
    /**借款人信息添加*/
    int insertBorrower(Borrower q);
    /**关联人信息添加*/
    int insertRelation(Relation q);
    /**担保人信息添加*/
    int insertGuarantee(Guarantee q);
    /**业务信息添加*/
    int insertBusiness(Business q);

    int updateBorrower(Borrower q);
    int updateRelation(Relation q);
    int updateGuarantee(Guarantee q);
    int updateBusiness(Business q);
    int updateStart(StartPage q);

    int updateOne(Boolean orderState);
    int updateTwo(Boolean orderState);
    int updateThree(Boolean orderState);
    int updateFour(Boolean orderState);

    /**借款人信息查询*/
    Borrower findByBorrower(String id);
    /**关联人信息查询*/
    Relation findByRelation(String id);
    /**担保人信息查询*/
    Guarantee findByGuarantee(String id);
    /**业务信息查询*/
    Business findByBusiness(String id);

    int insertStart(StartPage q);

    StartPage findByStart(String id);

}
