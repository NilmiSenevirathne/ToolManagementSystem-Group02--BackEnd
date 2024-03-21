package com.BMKCompany.ToolManagementSystem.controller;


import com.BMKCompany.ToolManagementSystem.model.User;
import com.BMKCompany.ToolManagementSystem.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/authentication")
public class LoginController {


    @Autowired
    private LoginRepo loginRepo;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        User user = loginRepo.findByUsernameAndPassword(username, password);

        if (user != null) {
            return ResponseEntity.ok(user.getRole().toString());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");

        }

    }

    @GetMapping("/viewallstudent")
    @ResponseBody
    public ResponseEntity<List<User>> listStudent() {
        Iterable<User> studentList = loginRepo.findAll();
        return ResponseEntity.ok((List<User>) studentList);
    }
}
