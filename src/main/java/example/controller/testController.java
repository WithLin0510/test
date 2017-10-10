package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WithLin on 2017/10/10.
 */
@Controller
@RequestMapping("/home")
public class testController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
