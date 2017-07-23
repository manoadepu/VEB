package com.javatpoint.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javatpoint.Beans.AdminLoginBean;
import com.javatpoint.Beans.LoginBean;
import com.javatpoint.Beans.RegisterBean;
import com.javatpoint.DAO.LoginVerificationDAO;
import com.javatpoint.DAO.RegisterDAO;
import com.javatpoint.form.Contact;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		System.out.println("wait!");
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("hello", "message", message);
	}

	@RequestMapping(value = "/loginPage", method = RequestMethod.POST)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("loginBean") LoginBean loginBean) {
		System.out.println(loginBean.getValidationNumber());
		LoginVerificationDAO lvDAO = new LoginVerificationDAO();
		lvDAO.verifyLogin(loginBean);
		return new ModelAndView("contact", "command", new Contact());
	}

	@RequestMapping(value = "/register")
	public ModelAndView registration(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("loginBean") LoginBean loginBean) {
		System.out.println(loginBean.getValidationNumber());
		return new ModelAndView("register", "command", new Contact());
	}

	@RequestMapping("/contact")
	public ModelAndView showContacts() {
		return new ModelAndView("contact", "command", new Contact());
	}

	@RequestMapping(value = "/registerForm")
	@ResponseBody
	public String registrationForm(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("registrationBean") RegisterBean registerBean) {
		System.out.println(registerBean.toString());

		RegisterDAO rdao1 = new RegisterDAO();
		rdao1.registerVoter(registerBean);
		return "validation number is: 123456789";
	}

	@RequestMapping(value = "/admin")
	public ModelAndView adminAccess() {
		String message = "Hello World, Spring MVC @ Javatpoint";
		System.out.println(message);
		return new ModelAndView("admin", "message", message);
	}

	@RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
	public ModelAndView adminActions(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("adminloginBean") AdminLoginBean adminloginBean) {
		System.out.println(adminloginBean.getUsername() + ", " + adminloginBean.getPassword());
		return new ModelAndView("adminActions");
	}
	
}