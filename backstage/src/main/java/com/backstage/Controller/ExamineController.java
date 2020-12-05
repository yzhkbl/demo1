package com.backstage.Controller;

import com.backstage.Dao.Entity.Borrower;
import com.backstage.Dao.Entity.Business;
import com.backstage.Dao.Entity.Guarantee;
import com.backstage.Dao.Entity.Relation;
import com.backstage.Helper.ResponseDto;
import com.backstage.Service.ExamineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/examine")
public class ExamineController {
    @Autowired
    private ExamineService examineService;

    @RequestMapping("/find")
    public ResponseDto find(String identityId){
        List<Object> find = examineService.find(identityId);
        return ResponseDto.success(find);
    }
}
