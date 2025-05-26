package egovframework.example.controllerexam.web.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
	
//	따라하기 예제 1
    @GetMapping("/ex02/example01.do")
    public String example01(Model model,
                            @RequestParam(defaultValue = "") String name) {
        model.addAttribute("greeting", name);
        return "ex02/example01";
    }
}
