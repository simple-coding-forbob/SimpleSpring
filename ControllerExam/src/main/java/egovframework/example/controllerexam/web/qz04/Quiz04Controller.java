/**
 * 
 */
package egovframework.example.controllerexam.web.qz04;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.controllerexam.service.DeptVO;

/**
 * @author simple-coding
 *
 */
@Controller
public class Quiz04Controller {
    
	// 퀴즈 2
    @GetMapping("/qz04/quiz01.do")
    public String quiz01(
            @ModelAttribute DeptVO deptVO
    ) {
        return "qz04/quiz01";
    }
}
