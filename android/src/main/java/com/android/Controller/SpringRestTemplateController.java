package com.android.Controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;

@RestController
public class SpringRestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value = "/testPostApi")
    public Object testPost() {
        String url = "http://192.168.1.195:8080/getJson";
        JSONObject postData = new JSONObject();
        postData.put("descp", "request for post");
        postData.put("assurerNo","");
        postData.put("bankCode","");
        postData.put("platNo","");
        postData.put("productType","");
        postData.put("cooperateAgencyCode","");
        JSONObject json = restTemplate.postForEntity(url, postData, JSONObject.class).getBody();
        return json;
    }

}
