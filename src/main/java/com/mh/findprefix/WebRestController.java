package com.mh.findprefix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Michael Hollander
 * @date September 8, 2018
 */
@RestController
public class WebRestController {
    
    @GetMapping("/result")
    public Words words(@RequestParam(value="search", defaultValue="VOIDED") String word) {
        FindPrefix fp = new FindPrefix();
        return new Words(word, fp.doLogic(word));
    }
}
