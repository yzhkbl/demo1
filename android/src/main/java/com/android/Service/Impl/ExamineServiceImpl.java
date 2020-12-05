package com.android.Service.Impl;

import com.android.Dao.Entity.*;
import com.android.Dao.ExamineDao;
import com.android.Dto.ExamineDto;
import com.android.Service.ExamineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class ExamineServiceImpl implements ExamineService {
    @Autowired
    private ExamineDao examineDao;


    @Override
    public int addByBorrower(Borrower q) {
        Borrower borrower = new Borrower();
        borrower.setUserName(q.getUserName());
        borrower.setIdCard(q.getIdCard());
        borrower.setBankCardNo(q.getBankCardNo());
        borrower.setPhoneNumber(q.getPhoneNumber());
        borrower.setIssueAuthority(q.getIssueAuthority());
        borrower.setStartDate(q.getStartDate());
        borrower.setEndDate(q.getEndDate());
        borrower.setFamilyAddress(q.getFamilyAddress());
        borrower.setObverseId(q.getObverseId());
        borrower.setObverseCode(q.getObverseCode());
        borrower.setObverseAddress(q.getObverseAddress());
        borrower.setObverseName(q.getObverseName());
        borrower.setBackId(q.getBackId());
        borrower.setBackCode(q.getBackCode());
        borrower.setBackAddress(q.getBackAddress());
        borrower.setBackName(q.getBackName());
        borrower.setPowerId(q.getPowerId());
        borrower.setPowerCode(q.getPowerCode());
        borrower.setPowerAddress(q.getPowerAddress());
        borrower.setPowerName(q.getPowerName());
        borrower.setCreditPower(q.getCreditPower());
        borrower.setIdentityId(q.getIdentityId());
        borrower.setOrderState(q.getOrderState());
        if(findByBorrower(q.getIdentityId())!=null&&q.getOrderState()==false){
            int count = examineDao.updateBorrower(borrower);
            return count;
        } else {
            int count = examineDao.insertBorrower(borrower);
            return count;

        }
    }

    @Override
    public int addByRelation(Relation q) {
        Relation relation = new Relation();
        relation.setUserName(q.getUserName());
        relation.setIdCard(q.getIdCard());
        relation.setBankCardNo(q.getBankCardNo());
        relation.setPhoneNumber(q.getPhoneNumber());
        relation.setIssueAuthority(q.getIssueAuthority());
        relation.setStartDate(q.getStartDate());
        relation.setEndDate(q.getEndDate());
        relation.setFamilyAddress(q.getFamilyAddress());
        relation.setCompany(q.getCompany());
        relation.setCompanyAddress(q.getCompanyAddress());
        relation.setYearIncome(q.getYearIncome());
        relation.setObverseId(q.getObverseId());
        relation.setObverseCode(q.getObverseCode());
        relation.setObverseAddress(q.getObverseAddress());
        relation.setObverseName(q.getObverseName());
        relation.setBackId(q.getBackId());
        relation.setBackCode(q.getBackCode());
        relation.setBackAddress(q.getBackAddress());
        relation.setBackName(q.getBackName());
        relation.setPowerId(q.getPowerId());
        relation.setPowerCode(q.getPowerCode());
        relation.setPowerAddress(q.getPowerAddress());
        relation.setPowerName(q.getPowerName());
        relation.setCreditPower(q.getCreditPower());
        relation.setPeopleShip(q.getPeopleShip());
        relation.setIdentityId(q.getIdentityId());
        relation.setBusinessRole(q.getBusinessRole());
        relation.setOrderState(q.getOrderState());
        if(findByRelation(q.getIdentityId())!=null&&q.getOrderState()==false){
            int count = examineDao.updateRelation(relation);
            return count;
        } else {
            int count = examineDao.insertRelation(relation);
            return count;

        }
    }

    @Override
    public int addByGuarantee(Guarantee q) {
        Guarantee guarantee = new Guarantee();
        guarantee.setUserName(q.getUserName());
        guarantee.setIdCard(q.getIdCard());
        guarantee.setBankCardNo(q.getBankCardNo());
        guarantee.setPhoneNumber(q.getPhoneNumber());
        guarantee.setIssueAuthority(q.getIssueAuthority());
        guarantee.setStartDate(q.getStartDate());
        guarantee.setEndDate(q.getEndDate());
        guarantee.setFamilyAddress(q.getFamilyAddress());
        guarantee.setCompany(q.getCompany());
        guarantee.setCompanyAddress(q.getCompanyAddress());
        guarantee.setYearIncome(q.getYearIncome());
        guarantee.setObverseId(q.getObverseId());
        guarantee.setObverseCode(q.getObverseCode());
        guarantee.setObverseAddress(q.getObverseAddress());
        guarantee.setObverseName(q.getObverseName());
        guarantee.setBackId(q.getBackId());
        guarantee.setBackCode(q.getBackCode());
        guarantee.setBackAddress(q.getBackAddress());
        guarantee.setBackName(q.getBackName());
        guarantee.setPowerId(q.getPowerId());
        guarantee.setPowerCode(q.getPowerCode());
        guarantee.setPowerAddress(q.getPowerAddress());
        guarantee.setPowerName(q.getPowerName());
        guarantee.setCreditPower(q.getCreditPower());
        guarantee.setPeopleShip(q.getPeopleShip());
        guarantee.setIdentityId(q.getIdentityId());
        guarantee.setOrderState(q.getOrderState());
        if(findByGuarantee(q.getIdentityId())!=null&&q.getOrderState()==false){
            int count = examineDao.updateGuarantee(guarantee);
            return count;
        } else {
            int count = examineDao.insertGuarantee(guarantee);
            return count;

        }
    }

    @Override
    public int addByBusiness(Business q) {
        Business business = new Business();
        business.setId(q.getId());
        business.setTeam(q.getTeam());
        business.setCarInformation(q.getCarInformation());
        business.setIntentionPrice(q.getIntentionPrice());
        business.setLoanMoney(q.getLoanMoney());
        business.setRepayPeriod(q.getRepayPeriod());
        business.setCarType(q.getCarType());
        business.setIdentityId(q.getIdentityId());
        business.setOrderState(q.getOrderState());

        if(findByBusiness(q.getIdentityId())!=null&&q.getOrderState()==false){
            int count = examineDao.updateBusiness(business);
            return count;
        } else {
            int count = examineDao.insertBusiness(business);
            return count;

        }
    }



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
    public Map<String,Object> find(String id){
        Map<String,Object>map = new HashMap<>();
        map.put("business",findByBusiness(id));
        map.put("borrower",findByBorrower(id));
        map.put("relation",findByRelation(id));
        map.put("guarantee",findByGuarantee(id));
        map.put("start",findByStart(id));
        System.out.println(map);
        return map;
    }

    @Override
    public int addByStart(StartPage q) {
        StartPage startPage = new StartPage();
        startPage.setId(q.getId());
        startPage.setFundSide(q.getFundSide());
        startPage.setBusinessPlace(q.getBusinessPlace());
        startPage.setOrderState(q.getOrderState());
        startPage.setIdentityId(q.getIdentityId());
        examineDao.updateOne(true);
        examineDao.updateTwo(true);
        examineDao.updateThree(true);
        examineDao.updateFour(true);
        if(findByStart(q.getIdentityId())!=null&&q.getOrderState()==false){
            int count = examineDao.insertStart(startPage);

            return count;
        } else {
            return 0;
        }
    }

    @Override
    public StartPage findByStart(String id) {
        StartPage startPage = examineDao.findByStart(id);
        return startPage;
    }


}
