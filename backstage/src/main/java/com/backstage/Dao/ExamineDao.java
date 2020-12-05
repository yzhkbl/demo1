package com.backstage.Dao;

import com.backstage.Dao.Entity.Borrower;
import com.backstage.Dao.Entity.Business;
import com.backstage.Dao.Entity.Guarantee;
import com.backstage.Dao.Entity.Relation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExamineDao {
    /**
     * 借款人信息添加
     */
   // int insertBorrower(Borrower q);

    /**
     * 关联人信息添加
     */
    //int insertRelation(Relation q);

    /**
     * 担保人信息添加
     */
   // int insertGuarantee(Guarantee q);

    /**
     * 业务信息添加
     */
   // int insertBusiness(Business q);

    /**
     * 借款人信息查询
     */
    Borrower findByBorrower(String id);

    /**
     * 关联人信息查询
     */
    Relation findByRelation(String id);

    /**
     * 担保人信息查询
     */
    Guarantee findByGuarantee(String id);

    /**
     * 业务信息查询
     */
    Business findByBusiness(String id);
}
