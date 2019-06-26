package com.valtechmobility.meetingpoint.backend.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/user/")
@Slf4j
public class V1Controller {

    @GetMapping
    public String helloUser() {
        return "Hello user!";
    }
}
