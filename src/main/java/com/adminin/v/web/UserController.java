package com.adminin.v.web;

import com.adminin.v.bean.User;
import com.adminin.v.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("api/User")
@RestController
public class UserController {

    @Resource(name="UserService")
    public UserService userService;

    @ApiOperation(value="获取用户列表", notes="获取全部用户")
    @RequestMapping(value="/getUsers" , method= RequestMethod.GET)
    public List<User> getUsers() {
        List<User> users=userService.getUsers();
        return users;
    }
}