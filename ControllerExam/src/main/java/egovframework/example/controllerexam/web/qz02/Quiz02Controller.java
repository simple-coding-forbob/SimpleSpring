/**
 * 
 */
package egovframework.example.controllerexam.web.qz02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author simple-coding
 *
 */
@Controller
public class Quiz02Controller {
//	퀴즈 2
    @GetMapping("/qz02/quiz01.do")
    public String quiz01(Model model,
                             @RequestParam(defaultValue = "") String dname) {
        model.addAttribute("dname", dname);
        return "qz02/quiz01";
    }
    
//	퀴즈 3
    @GetMapping("/qz02/quiz02.do")
    public String quiz01(Model model,
                             @RequestParam(defaultValue = "0") int dno) {
        model.addAttribute("dno", dno);
        return "qz02/quiz02";
    }
}
