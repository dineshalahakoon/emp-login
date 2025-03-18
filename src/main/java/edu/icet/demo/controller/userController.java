package edu.icet.demo.controller;

import edu.icet.demo.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@Slf4j
public class userController {
    @PostMapping("/auth/login")
    public boolean login(@RequestBody User user){
//        log.info(user.getUserName());
        return false;
    }

    @PostMapping("/regiter")
    public String register(@RequestBody User user){
        return "register user";
    }



}
