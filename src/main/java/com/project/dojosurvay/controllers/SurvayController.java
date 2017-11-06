package com.project.dojosurvay.controllers;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.dojosurvay.models.Student;

@Controller
public class SurvayController{
	//Member variables go here

	public SurvayController(){

	}
	
	@RequestMapping("")
	public String index(HttpSession session, Model model){
		if (session.getAttribute("student") == null){
			return "index";
		}
		model.addAttribute("student", ((Student) session.getAttribute("student")));
		return "index";
	}
	@PostMapping("/create")
	public String create(
		@RequestParam(value="name") String name,
		@RequestParam(value="location") String location,
		@RequestParam(value="favLang") String favLang,
		@RequestParam(value="comment") String comment,
		HttpSession session, 
		Model model){
			session.setAttribute("student", new Student(name, location, favLang, comment));
		return "redirect:/";
	}
}
