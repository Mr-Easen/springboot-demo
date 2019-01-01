package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.User;
import com.example.springbootdemo.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private UserService userService;

    @RequestMapping("hello")
    public String say(){
        return "HelloWorld";
    }

    @RequestMapping("getUser")
    public User getUser(String id){
        return userService.getUserById(id);

    }

    @RequestMapping("delUser")
    public String delUser(HttpServletRequest request) {
        String id = request.getParameter("id");
        int result = userService.delUserById(id);
        JSONObject json = new JSONObject();
        json.put("message","error");
        if(0 < result){
            json.put("message","success");
        }
        return json.toString();
    }

    @RequestMapping("adddUser")
    public String addUser(User user) {
        int result = userService.addUser(user);
        JSONObject json = new JSONObject();
        json.put("message","error");
        if(0 < result){
            json.put("message","success");
        }
        return json.toString();
    }

}
