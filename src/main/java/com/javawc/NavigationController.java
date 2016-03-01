package com.javawc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sunny on 2016/2/20.
 */
@Controller
@RequestMapping("/")
public class NavigationController {
    @RequestMapping("/index")
    public String indexPage(){
        return "index";
    }
}
