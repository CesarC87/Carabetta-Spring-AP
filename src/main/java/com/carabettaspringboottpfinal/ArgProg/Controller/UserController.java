/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carabettaspringboottpfinal.ArgProg.Controller;

import com.carabettaspringboottpfinal.ArgProg.Models.User;
import com.carabettaspringboottpfinal.ArgProg.Service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    
    @Autowired
    private IUserService userServ;
    
    @CrossOrigin(origins = "*")
    @GetMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUser() {
        return userServ.getUser();
    }
    
    @PostMapping("/user")
    public void postUser(@RequestBody User us){
        userServ.postUser(us);
    }    
    @GetMapping
    public String getData(){
        return "Hello world";
    }
}
