package com.ibm.cio.esw.yhy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.cio.esw.yhy.domain.DemoObj;

@Controller
public class AdviceController {
	@RequestMapping("/advice")
	public String getSometthing(@ModelAttribute("msg") String msg,DemoObj obj) {
		throw new IllegalArgumentException("非常抱歉，参数有误"+msg);
	}

}
