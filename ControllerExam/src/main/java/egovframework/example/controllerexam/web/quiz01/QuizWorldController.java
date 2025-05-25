/**
 * 
 */
package egovframework.example.controllerexam.web.quiz01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author simple-coding
 *
 */
@Controller
public class QuizWorldController {
	@RequestMapping(value = "/quiz01/hello.do", method = RequestMethod.GET)
	public String Quiz() {
		return "quiz01/hello";
	}
}
