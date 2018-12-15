package com.ibm.cio.esw.yhy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
@RequestMapping("/hello")
public ModelAndView hello(String name) {
	
	ModelAndView modleAndView = new ModelAndView("welcome");
	modleAndView.addObject("message", "hello 9999"+name);
	return modleAndView;
}
}
