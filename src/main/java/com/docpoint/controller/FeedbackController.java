package com.docpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FeedbackController {
	
	@RequestMapping("/displayFeedback")
	public ModelAndView displayFeedback(Model model)
	{
		ModelAndView modelAndView=new ModelAndView("feedback.html");
		return modelAndView;
	}

}
