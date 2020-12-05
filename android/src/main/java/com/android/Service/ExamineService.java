package com.android.Service;

import com.android.Dao.Entity.*;
import com.android.Dto.ExamineDto;

import java.util.Map;

public interface ExamineService {
    int addByBorrower(Borrower q);
    int addByRelation(Relation q);
    int addByGuarantee(Guarantee q);
    int addByBusiness(Business q);
    Borrower findByBorrower(String id);
    Relation findByRelation(String id);
    Guarantee findByGuarantee(String id);
    Business findByBusiness(String id);
    Map<String,Object>find(String id);
    int addByStart(StartPage q);
    StartPage findByStart(String id);
}
