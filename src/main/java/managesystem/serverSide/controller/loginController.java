package managesystem.serverSide.controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/login")
public class loginController {

    private static Cookie cookie;

    @RequestMapping(value = "/verifyCount", method = RequestMethod.POST)
    public String verifyCount(HttpServletResponse response,
                              @RequestParam(value = "username", required =true) String username,
                              @RequestParam(value = "password", required = true) String password) {
        if (username.equals("ycc") && password.equals("1111")) {
            cookie = new Cookie("login", "true");
            return "登录成功";
        } else {
            cookie = new Cookie("login", "false");
            return "登录失败";
        }
    }
}
