package home.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api")
public class HelloWorld {


    @GetMapping("/visits")
    public Iterable<String> getVisits() {
        return Collections.singletonList("Hello");
    }
}