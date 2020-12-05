package com.backstage.Service.Ipml;

import com.backstage.Dao.Entity.Borrower;
import com.backstage.Dao.Entity.Business;
import com.backstage.Dao.Entity.Guarantee;
import com.backstage.Dao.Entity.Relation;
import com.backstage.Dao.ExamineDao;
import com.backstage.Service.ExamineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExamineServiceImpl implements ExamineService {

    @Autowired
    private ExamineDao examineDao;

    @Override
    public Borrower findByBorrower(String id) {
        Borrower borrower = examineDao.findByBorrower(id);
        return borrower;
    }

    @Override
    public Relation findByRelation(String id) {
        Relation relation = examineDao.findByRelation(id);
        return relation;
    }

    @Override
    public Guarantee findByGuarantee(String id) {
        Guarantee guarantee = examineDao.findByGuarantee(id);
        return guarantee;
    }

    @Override
    public Business findByBusiness(String id) {
        Business business = examineDao.findByBusiness(id);
        return business;
    }

    @Override
    public List<Object> find(String id){
        Map<String,Object>map = new HashMap<>();
        map.put("business",findByBusiness(id));
        map.put("borrower",findByBorrower(id));
        map.put("relation",findByRelation(id));
        map.put("guarantee",findByGuarantee(id));
        List<Object> list = new ArrayList<>();
        list.add(map);
        if(findByBusiness(id).getOrderState()==true) {
            return list;
        }else {
            List<Object>find = new ArrayList<>();
            return find;
        }
    }
}
