package com.javatpoint.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javatpoint.Beans.AddParty;
import com.javatpoint.DAO.AddPartyDAO;

@Controller
public class AdminActionsController {
	@RequestMapping(value = "/addParty")
	public ModelAndView addParty(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("addParty") AddParty addParty) {
		System.out.println(addParty.toString());
		AddPartyDAO addPartyDAO = new AddPartyDAO();
		String result = addPartyDAO.addPartyAndCandidate(addParty);
		return new ModelAndView("admin", "message", result);
	}
}
