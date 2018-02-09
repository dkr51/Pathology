package com.jpatho.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import com.jpatho.model.Appoinment;
import com.jpatho.service.IAppoinmentService;

@Controller
public class AppoinmentController {
	
	@Autowired
	private IAppoinmentService service;
	
	@RequestMapping(value="/insertAppo",method=RequestMethod.POST)
	public String saveAppoinment(@ModelAttribute("appoinment")Appoinment appo, ModelMap map){
		int pmobile=service.saveAppoinment(appo);
		map.addAttribute("msg","Saved with Id :"+pmobile);
		return "Appoinment.html";
	}
		
	
	
	
}
