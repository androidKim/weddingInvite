package com.midasgo.weddinginvite.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MainController
{     
	/******************************* Define *******************************/
	
	/******************************* Member *******************************/
	    
	/******************************* User Function *******************************/
    //-----------------------------------------------------------------------------
    //
    @RequestMapping(value = "/")
    public String redirect(Model model, HttpServletRequest request, HttpServletResponse response) 
    {	    	
		return "redirect:/main";
    }
    //-----------------------------------------------------------------------------
    //
    @RequestMapping(value = "/main")
    public ModelAndView main(Model model, HttpServletRequest request, HttpServletResponse response) 
    {	    	
    	String funYn = ""; 
    	funYn = request.getParameter("funYn");
    	if(funYn == null)
    		funYn = "N";
    	
    	ModelAndView mav = new ModelAndView();
    	mav.addObject("funYn", funYn);
		mav.setViewName("main");
		return mav;
    } 
    //-----------------------------------------------------------------------------
    //
    @RequestMapping(value = "/photos")
    public ModelAndView photos(Model model, HttpServletRequest request, HttpServletResponse response) 
    {	    	
    	ModelAndView mav = new ModelAndView();
		mav.setViewName("photos");
		return mav;
    }
}