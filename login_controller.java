package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.login.beans.login_bean;
import com.login.dao.login_dao;

@Controller
public class login_controller {
	login_dao dao;
	
	@RequestMapping(value="/login")    
    public ModelAndView showform(Model m){    
        m.addAttribute("command", new login_bean());  
        return new ModelAndView("login_form");
	}
	@RequestMapping(value="/pass",method = RequestMethod.GET)    
    public String successful(Model m){    
        return "redirect:/login_successful";
	}
	@RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("emp") login_bean login){    
        int lo=dao.save(login);    
        if(lo==0) {
	    	return "redirect:/login";
	    }
	    else return "redirect:/pass";  
    }  
	

}
