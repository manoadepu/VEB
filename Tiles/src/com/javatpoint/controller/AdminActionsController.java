package com.javatpoint.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javatpoint.Beans.AddParty;
import com.javatpoint.DAO.AddPartyDAO;
import com.javatpoint.DAO.LockResultsDAO;
import com.javatpoint.DAO.ShowResultsDAO;
import com.javatpoint.DAO.StartElectionsDAO;
import com.javatpoint.DAO.StopElectionsDAO;

@Controller
public class AdminActionsController {
	@RequestMapping(value = "/addParty", method=RequestMethod.POST)
	public ModelAndView addParty(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("addParty") AddParty addParty) {
		System.out.println(addParty.toString());
		AddPartyDAO addPartyDAO = new AddPartyDAO();
		String result = addPartyDAO.addPartyAndCandidate(addParty);
		return new ModelAndView(result, "message", "Success!");
	}
	
	@RequestMapping(value = "/startElection", method=RequestMethod.POST)
	public String startElection(HttpServletRequest request, HttpServletResponse response) {
		String result="";
		StartElectionsDAO StartElections = new StartElectionsDAO();
		result = StartElections.startElectionProcess();
		return result;
	}
	
	@RequestMapping(value = "/stopElection", method=RequestMethod.POST)
	public String stopElection(HttpServletRequest request, HttpServletResponse response) {
		String result="";
		StopElectionsDAO stopElectionsDAO = new StopElectionsDAO();
		result = stopElectionsDAO.stopElectionProcess();
		return result;
	}
	
	@RequestMapping(value = "/showResults", method=RequestMethod.POST)
	public String showResults(HttpServletRequest request, HttpServletResponse response) {
		String result="";
		ShowResultsDAO showResultsDAO = new ShowResultsDAO();
		result = showResultsDAO.stopElectionProcess();
		return result;
	}
	
	@RequestMapping(value = "/lockResults", method=RequestMethod.POST)
	public String lockResults(HttpServletRequest request, HttpServletResponse response) {
		String result="";
		LockResultsDAO lockResultsDAO = new LockResultsDAO();
		result = lockResultsDAO.lockResults();
		return result;
	}
}
