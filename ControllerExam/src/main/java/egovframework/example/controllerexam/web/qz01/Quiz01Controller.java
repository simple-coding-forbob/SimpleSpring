/**
 * 
 */
package egovframework.example.controllerexam.web.qz01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author simple-coding
 *
 */
@Controller
public class Quiz01Controller {
//	퀴즈: 2
	@GetMapping("/qz01/quiz01.do")
	public String quiz01() {
		return "qz01/quiz01";
	}
	
//	퀴즈: 4
	@GetMapping("/qz01/quiz02.do")
	public String quiz02(Model model) {
		model.addAttribute("quiz", "안녕 페이지");
		return "qz01/quiz02";
	}
	
//	퀴즈: 6
	@GetMapping("/qz01/quiz03.do")
	public String quiz03(Model model) {
		model.addAttribute("quiz", "안녕 페이지");
		model.addAttribute("quiz2", "안녕 페이지2");
		model.addAttribute("quiz3", "안녕 페이지3");
		return "qz01/quiz03";
	}
	
//	퀴즈 8
	@GetMapping("/qz01/quiz04.do")
	public String quiz04(Model model) {
		
		String str = "hello";
		long num = 10;
		double value = 10.5;
		
		model.addAttribute("str", str);
		model.addAttribute("num", num);
		model.addAttribute("value", value);
		return "qz01/quiz04";
	}
}
