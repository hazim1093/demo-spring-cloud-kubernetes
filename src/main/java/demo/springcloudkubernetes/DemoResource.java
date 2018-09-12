package demo.springcloudkubernetes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoResource {
    @Autowired
    private GreetingConfig greetingConfig;

    @GetMapping
    public String getGreetingMessage(){
        return "Greeting Message: " + greetingConfig.getMessage();
    }
}
