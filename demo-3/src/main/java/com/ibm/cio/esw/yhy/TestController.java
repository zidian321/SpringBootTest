package com.ibm.cio.esw.yhy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
@RequestMapping("/hello")
public ModelAndView hello(String url,String transactionID, String requestbody) {
	System.out.println(transactionID);
	System.out.println(url);
	System.out.println(requestbody);
	ModelAndView modleAndView = new ModelAndView("IMSservice");
	modleAndView.addObject("requestbody", requestbody);
	modleAndView.addObject("transactionID", transactionID);
	return modleAndView;
}
}
