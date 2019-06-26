package com.valtechmobility.meetingpoint.backend.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/user/")
public class UserController {

    @GetMapping
    public String helloUser() {
        return "Hello user!";
    }
}
