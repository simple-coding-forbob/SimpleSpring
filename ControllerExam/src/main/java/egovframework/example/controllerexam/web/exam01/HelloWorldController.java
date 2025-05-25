/**
 * 
 */
package egovframework.example.controllerexam.web.exam01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author simple-coding
 *
 */
@Controller
public class HelloWorldController {
	@RequestMapping(value = "/exam01/hello.do", method = RequestMethod.GET)
	public String Hello() {
		return "exam01/hello";
	}
}