package managesystem.serverSide.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hello2Controller {
    @RequestMapping(value = "/{fname}/{lname}", method = RequestMethod.GET)
    public String hello2(@PathVariable("fname") String firstName,
                        @PathVariable("lname") String lastName) {
        return String.format("{code:\"0\",message:\"\",data:\"Hello!, %s %s\"}", firstName, lastName);
    }
}