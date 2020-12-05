package com.android.Controller;

import com.android.Dao.Entity.*;
import com.android.Dto.ExamineDto;
import com.android.Helper.ResponseDto;
import com.android.Service.ExamineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/examine")
public class ExamineController {
    @Autowired
    private ExamineService examineService;

    @RequestMapping("/add/borrower")
    public ResponseDto addBorrower(Borrower q){
        examineService.addByBorrower(q);
        return ResponseDto.success();
    }

    @RequestMapping("/add/relation")
    public ResponseDto addRelation(Relation q){
        examineService.addByRelation(q);
        return ResponseDto.success();
    }

    @RequestMapping("/add/guarantee")
    public ResponseDto addGuarantee(Guarantee q){
        examineService.addByGuarantee(q);
        return ResponseDto.success();
    }

    @RequestMapping("/add/business")
    public ResponseDto addBusiness(Business q){
        examineService.addByBusiness(q);
        return ResponseDto.success();
    }

    @RequestMapping("/find/borrower")
    public ResponseDto findBorrower(String identityId){
        Borrower borrower = examineService.findByBorrower(identityId);
        return ResponseDto.success(borrower);
    }

    @RequestMapping("/find/relation")
    public ResponseDto findRelation(String identityId){
        Relation relation = examineService.findByRelation(identityId);
        return ResponseDto.success(relation);
    }

    @RequestMapping("/find/guarantee")
    public ResponseDto findGuarantee(String identityId){
        Guarantee guarantee= examineService.findByGuarantee(identityId);
        return ResponseDto.success(guarantee);
    }

    @RequestMapping("/find/business")
    public ResponseDto findBusiness(String identityId){
        Business business = examineService.findByBusiness(identityId);
        return ResponseDto.success(business);
    }

    @RequestMapping("/find")
    public ResponseDto find(String identityId){
        Map<String,Object>find = examineService.find(identityId);
        return ResponseDto.success(find);
    }

    @RequestMapping("/add/start")
    public ResponseDto addByStart(StartPage q){
        examineService.addByStart(q);
        return ResponseDto.success();
    }

    @RequestMapping("/find/start")
    public ResponseDto findByStart(String identityId){
        StartPage startPage = examineService.findByStart(identityId);
        return ResponseDto.success(startPage);
    }
}