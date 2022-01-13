package com.daelim.univ.member.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.daelim.univ.member.domain.Member;

@Controller
public class MemberController {

	private static final Logger logger = 
			LoggerFactory.getLogger(MemberController.class);
	
	@ResponseBody
	@RequestMapping(value = "/member/home0301", method = RequestMethod.GET)
	public Member home0301() {
		logger.info("MemberController, home0301.");
		
		Member member = new Member();
		
		return member;
	}
	
	@ResponseBody
	@RequestMapping(value = "/member/home0501", method = RequestMethod.GET)
	public List<HashMap<String, Object>> home0501() {
		logger.info("MemberController, home0501.");
		
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("procedureRequestNo", "202201130001");
		paramMap.put("itemCd", "1101");
		paramMap.put("itemNm", "돼지고기");
		paramMap.put("itemCd", "1000");
		paramMap.put("itemNm", "kg");
		paramMap.put("price", "1000");
		list.add(paramMap);
		
		paramMap.put("procedureRequestNo", "202201130002");
		paramMap.put("itemCd", "1105");
		paramMap.put("itemNm", "소고기");
		paramMap.put("itemCd", "1001");
		paramMap.put("itemNm", "g");
		paramMap.put("price", "2000");;
		list.add(paramMap);
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping(value = "/member/home0502", method = RequestMethod.GET)
	public Map<String, Object> home0502() {
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("ship0001", "01");
		paramMap.put("spec0005", "03");
		paramMap.put("planet0003", "01");
		paramMap.put("engine0007", "02");
		
		return paramMap;
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/member/home0503", method = RequestMethod.GET)
	public ResponseEntity<String> home0503() {
		
		String resultStr = String.valueOf("Easy day is yesterday.");
		
		return new ResponseEntity<String>(resultStr, HttpStatus.OK);
		
	}
}
