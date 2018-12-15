package com.ibm.cio.esw.yhy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ibm.cio.esw.lms.imsservice.Sender;
@Controller
public class IMSController {
@RequestMapping("/imsservice")
public ModelAndView hello(String url,String transactionID, String requestbody) {
//	System.out.println(transactionID);
//	System.out.println(url);
//	System.out.println(requestbody);

	String responsebody="";
	long startTime = System.currentTimeMillis();
	responsebody=Sender.getMessageFromIMS(url, transactionID, requestbody);
	long endTime = System.currentTimeMillis();
	System.out.println("本次请求处理时间为:" + new Long(endTime - startTime)+"ms");
	String processTime = new Long(endTime - startTime)+"ms";
//	System.out.println("-------------------------------------------------");
//	System.out.println(responsebody);
	ModelAndView modleAndView = new ModelAndView("IMSservice");
	modleAndView.addObject("requestbody", requestbody);
	modleAndView.addObject("transactionID", transactionID);
	modleAndView.addObject("responsebody",responsebody);
	modleAndView.addObject("processTime",processTime);
	return modleAndView;
}
}
