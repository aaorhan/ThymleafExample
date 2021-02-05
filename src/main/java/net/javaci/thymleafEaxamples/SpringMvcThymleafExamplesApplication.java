package net.javaci.thymleafEaxamples;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringMvcThymleafExamplesApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(SpringMvcThymleafExamplesApplication.class, args);
        } catch (Throwable e) {
            if (e.getClass().getName().contains("SilentExitException")) {
                // skipping for spring known bug
                // https://github.com/spring-projects/spring-boot/issues/3100
                //	log.debug("Spring is restarting the main thread - See spring-boot-devtools");
            } else {
                throw e;
            }
        }
    }

}