package com.android;

import com.android.Dao.ExamineDao;
import com.android.Dto.ExamineDto;
import com.android.Service.ExamineService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class ExamineTest {
    @Autowired
    private ExamineService examineService;
    @Autowired
    private ExamineDao examineDao;

    @Test
    public void find()throws Exception{
        String a = "1111";
        System.out.println(examineService.find(a));
    }
}
