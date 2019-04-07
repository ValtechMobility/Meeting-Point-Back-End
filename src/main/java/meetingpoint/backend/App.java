package meetingpoint.backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class App {

    public static void main(final String[] args) {
        try (final ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class, args)) {
            log.info("Application Successfully Starts Up!");
        }
    }
}
