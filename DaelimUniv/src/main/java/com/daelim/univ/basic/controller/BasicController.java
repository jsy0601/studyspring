package com.daelim.univ.basic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 기본
 * @author 정서연
 *
 */
@Controller
public class BasicController {

	private static final Logger logger = 
			LoggerFactory.getLogger(BasicController.class);
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String basicHome(Model model) {
		
		logger.info("BasicController, basicHome.");
		
		return "home";
	}
	
	@RequestMapping(value = "/basic/basic0101", method = RequestMethod.GET)
	public String basic0101() {
		
		logger.info("basic0101");
		
		return "basic/basic0102";
	}
}
