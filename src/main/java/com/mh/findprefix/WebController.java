package com.mh.findprefix;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Michael Hollander
 * @date September 8, 2018
 */
@Controller
public class WebController {
        
    @GetMapping( {"", "index", "index.html"} )
    public String index() {
        return "index.html";
    }
}
