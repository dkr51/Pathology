package com.jpatho.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import com.jpatho.model.GetInTouch;
import com.jpatho.service.IGetInTouchService;

@Controller
public class GetInTouchController {
	@Autowired
	private IGetInTouchService service;
	
	
	@RequestMapping("/getinReg")
	public String showRegPage(){
		return "Index";
	}

	@RequestMapping(value="/insertGetin",method=RequestMethod.POST)
	public String saveGetInTouch(@ModelAttribute("getInTouch")GetInTouch getin, ModelMap map){
		int mobile=service.saveGetInTouch(getin);
		map.addAttribute("msg","Saved with Id :"+mobile);
		return "Index";
	}
}
