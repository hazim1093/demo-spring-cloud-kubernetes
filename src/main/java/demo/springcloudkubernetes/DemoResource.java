package demo.springcloudkubernetes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoResource {

    // Defaults to empty if property not found
    @Value("${greeting.message:}")
    private String greetingMessage;

    @GetMapping
    public String getGreetingMessage(){
        return "Greeting Message: " + greetingMessage;
    }
}
