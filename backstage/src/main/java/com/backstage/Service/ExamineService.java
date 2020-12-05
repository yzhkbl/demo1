package com.backstage.Service;

import com.backstage.Dao.Entity.Borrower;
import com.backstage.Dao.Entity.Business;
import com.backstage.Dao.Entity.Guarantee;
import com.backstage.Dao.Entity.Relation;

import java.util.List;
import java.util.Map;

public interface ExamineService {
    //int addByBorrower(Borrower q);
    //int addByRelation(Relation q);
    //int addByGuarantee(Guarantee q);
    //int addByBusiness(Business q);
    Borrower findByBorrower(String id);
    Relation findByRelation(String id);
    Guarantee findByGuarantee(String id);
    Business findByBusiness(String id);
    List<Object> find(String id);

}
