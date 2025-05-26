/**
 * 
 */
package egovframework.example.controllerexam.web.qz03;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author simple-coding
 *
 */
@Controller
public class Quiz03Controller {

//	퀴즈 2
	@GetMapping("/qz03/quiz01.do")
	public String quiz01(Model model, @RequestParam(defaultValue = "0") int dno,
			@RequestParam(defaultValue = "") String dname, @RequestParam(defaultValue = "") String loc) {
		model.addAttribute("dno", dno);
		model.addAttribute("dname", dname);
		model.addAttribute("loc", loc);
		return "qz03/quiz01";
	}

//	퀴즈 4
	@GetMapping("/qz03/quiz02.do")
	public String quiz02(Model model, @RequestParam(defaultValue = "") String eno,
			@RequestParam(defaultValue = "") String ename, @RequestParam(defaultValue = "") String job,
			@RequestParam(defaultValue = "") String hiredate) {
		List<String> list = new ArrayList<>();
		list.add(eno);
		list.add(ename);
		list.add(job);
		list.add(hiredate);

		model.addAttribute("list", list);

		return "qz03/quiz02";
	}

//	퀴즈 6
	@GetMapping("/qz03/quiz03.do")
	public String quiz03(Model model, @RequestParam(defaultValue = "") String eno,
			@RequestParam(defaultValue = "") String ename, @RequestParam(defaultValue = "") String job,
			@RequestParam(defaultValue = "") String hiredate) {
		List<String> list = new ArrayList<>();
		list.add(eno);
		list.add(ename);
		list.add(job);
		list.add(hiredate);

		model.addAttribute("list", list);

		return "qz03/quiz03";
	}
}
