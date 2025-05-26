/**
 * 
 */
package egovframework.example.controllerexam.web.exam01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author simple-coding
 *
 */
@Controller
public class BasicController {
	@RequestMapping(value = "/exam01/hello.do", method = RequestMethod.GET)
	public String hello() {
		return "/exam01/hello";
	}
	
	@GetMapping("/exam01/example01.do")
	public String example01() {
		return "/exam01/example01";
	}
}