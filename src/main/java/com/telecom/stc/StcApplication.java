package com.telecom.stc;

import com.telecom.stc.model.GetUserRequest;

import com.telecom.stc.model.GetUserResponse;
import com.telecom.stc.service.UsersClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StcApplication {

    @Autowired
   UsersClient client;

    @PostMapping("/post")
    public GetUserResponse stub(@RequestBody GetUserRequest request){
       return  client.getUsers(request);

    }

    public static void main(String[] args) {
        SpringApplication.run(StcApplication.class, args);
    }

}
