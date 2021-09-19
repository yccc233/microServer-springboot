package managesystem.serverSide.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("greeting")
public class helloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "ycc") String name) {
        return String.format("hello! %s!", name);
    }
}
