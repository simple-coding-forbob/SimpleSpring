/**
 * 
 */
package egovframework.example.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author simple-coding
 * 메인화면: 첫페이지
 */
@Controller
public class HomeController {
	@GetMapping("/home.do")
	public String home() {
		return "home";
	}
}
