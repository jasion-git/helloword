package com.chainway.queryhbase.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/demo")
public class Demo {

	protected final Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="/demo.json", method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Map<String,Object>demo(HttpServletRequest request, HttpServletResponse response){
		String a=request.getParameter("a");
		String b=request.getParameter("b");
		String c=request.getParameter("c");
		
		log.info("param a:"+a);
		log.info("param b:"+b);
		log.info("param c:"+c);
		
		Map<String,Object>ret=new HashMap<String,Object>();
		ret.put("name", "jasion");
		ret.put("date", new Date());
		return ret;
	}
	
}
