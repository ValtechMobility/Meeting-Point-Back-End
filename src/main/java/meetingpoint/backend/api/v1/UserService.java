package meetingpoint.backend.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user/")
public class UserService {

    @GetMapping
    public String helloUser() {
        return "Hello User!";
    }
}
