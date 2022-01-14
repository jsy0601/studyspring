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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.daelim.univ.member.domain.Member;

@Controller
public class MemberController {

	private static final Logger logger = 
			LoggerFactory.getLogger(MemberController.class);
	
	@GetMapping("/member/read")
	public String readForm(Model model) {
		logger.info("MemberController, readForm.");
		
		List<String> resultList1 = new ArrayList<String>();
		
		resultList1.add("한화");
		resultList1.add("한화시스템");
		resultList1.add("한화솔루션");
		resultList1.add("한화에어로스페이스");
		resultList1.add("한화호텔앤리조트");
		resultList1.add("한화건설");
		
		model.addAttribute("company", resultList1);
		
		return "member/read";
	}
	
	@GetMapping("/member/registerForm")
	public String registerForm() {
		logger.info("registerForm.");
		
		return "member/registerForm";
	}
	
	@PostMapping("/member/register")
	public String getRegister(Member member) {
		logger.info("MemberController, getRegister.");
		
		if (member != null) {
			System.out.println("member : " + member.toString());
		}
		
		return "member/success";
	}
	
	
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
	
	@ResponseBody
	@RequestMapping(value = "/member/home0504", method = RequestMethod.GET)
	public ResponseEntity<String> home0504() {
		logger.info("home0504.");
		
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(value = "/member/home0505", method = RequestMethod.GET)
	public ResponseEntity<Member> home0505() {
		logger.info("home0505.");
		
		Member member = new Member();
		
		return new ResponseEntity<Member>(member, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(value = "/member/home0506", method = RequestMethod.GET)
	public ResponseEntity<List<Member>> home0506() {
		logger.info("home0506.");
		
		List<Member> resultList = new ArrayList<Member>();
		
		Member member = new Member();
		resultList.add(member);
		
		member = new Member();
		resultList.add(member);
		
		member = new Member();
		resultList.add(member);
		
		return new ResponseEntity<List<Member>>(resultList, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(value = "/member/home0507", method = RequestMethod.GET)
	public ResponseEntity<HashMap<String, Object>> home0507() {
		logger.info("home0507.");
		
		HashMap<String, Object> resultMap = new HashMap<String,Object>();
		
		resultMap.put("이름", "홍길동");
		resultMap.put("재산", "1000000000000");
		resultMap.put("대출", "100000");
		
		return new ResponseEntity<HashMap<String,Object>>(resultMap, HttpStatus.OK);
	}
}
