/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carabettaspringboottpfinal.ArgProg.Service;

import com.carabettaspringboottpfinal.ArgProg.Models.User;
import com.carabettaspringboottpfinal.ArgProg.Repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<User> getUser() {
        return userRepo.findAll();
    }

    @Override
    public void postUser(User us) {
        userRepo.save(us);
    }
    
}
