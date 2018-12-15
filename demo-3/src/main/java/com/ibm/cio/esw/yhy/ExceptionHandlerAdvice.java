package com.ibm.cio.esw.yhy;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerAdvice {
	@ExceptionHandler(value =Exception.class)
	public ModelAndView exception(Exception exception,WebRequest request) {
		ModelAndView modelAndView = new ModelAndView("error");
		modelAndView.addObject("errorMessage",exception.getMessage());
		return modelAndView;
		
	}
	@ModelAttribute
	public void addAttribute(Model model) {
		model.addAttribute("msg", "extra message test");
	}
	@InitBinder
	public void initBinder (WebDataBinder webDataBinder) {
		webDataBinder.setDisallowedFields("id");
	}

}
