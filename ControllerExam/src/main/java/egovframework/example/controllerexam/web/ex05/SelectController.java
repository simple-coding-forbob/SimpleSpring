/**
 * 
 */
package egovframework.example.controllerexam.web.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simple-coding
 * 
 */
@RestController
public class SelectController {
    @GetMapping("/api/select.do")
    public String example01() {
        return "Hello Ajax";
    }
}
