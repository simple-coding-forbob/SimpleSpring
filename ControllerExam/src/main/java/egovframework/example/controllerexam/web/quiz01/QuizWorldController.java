/**
 * 
 */
package egovframework.example.controllerexam.web.quiz01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author simple-coding
 *
 */
@Controller
public class QuizWorldController {
	@RequestMapping(value = "/quiz01/hello.do", method = RequestMethod.GET)
	public String quiz() {
		return "/quiz01/hello";
	}
	
	@GetMapping("/quiz01/quiz01.do")
	public String example01() {
		return "/quiz01/quiz01";
	}
}
