package com.valtechmobility.meetingpoint.backend.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/user")
public class UserV1Controller {

    @GetMapping
    public String getListOfUsers() {
        return "Hello user!";
    }

    @GetMapping("{username}")
    public String getUserInformation(@PathVariable final String username,
                                     @RequestParam(required = false) final List<String> filter) {
        return "Hello " + username + '!';
    }
}
