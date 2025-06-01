/**
 * 
 */
package egovframework.example.controllerexam.web.qz05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simple-coding
 * 
 */
@RestController
public class Quiz05AjaxController {
	@GetMapping(value="/qz05/ajax01.do", produces = "application/text; charset=UTF-8;")
	public String quiz01() {
		return "안녕 Ajax";
	}
}
