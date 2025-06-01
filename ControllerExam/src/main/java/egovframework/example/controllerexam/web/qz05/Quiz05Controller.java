/**
 * 
 */
package egovframework.example.controllerexam.web.qz05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simple-coding
 *
 */
@Controller
public class Quiz05Controller {
	@GetMapping("/qz05/quiz01.do")
    public String example01() {
        return "qz05/quiz01";
    }
}
