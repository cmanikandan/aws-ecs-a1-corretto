package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        String str = "Hello Docker World. I'm running inside Amazon ECS and the Java Runtime version is " + System.getProperty("java.runtime.version") + " from "+ System.getProperty("java.vm.name") + " and my Java home is " + System.getProperty("java.home") + "\n";
        str = str.concat("Operating System details: ").concat(System.getProperty("os.arch")).concat(" ").concat(System.getProperty("os.name")).concat(" ").concat(System.getProperty("os.version")).concat("\n");
        str = str.concat("Note: This is for demonstration purposes ONLY !! \n");
        return str;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
