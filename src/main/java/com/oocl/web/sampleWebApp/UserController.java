package com.oocl.web.sampleWebApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述 : TODO
 *
 * @Author : 王辉
 * @Email : wanghui16@zybank.com.cn
 * @Date : 2019-08-28 16:49
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<String> postUsers(){

        return ResponseEntity.status(HttpStatus.CREATED).body("success");
    }

    @GetMapping
    public ResponseEntity<String> getUsers(){
        return ResponseEntity.ok("success");
    }
}
