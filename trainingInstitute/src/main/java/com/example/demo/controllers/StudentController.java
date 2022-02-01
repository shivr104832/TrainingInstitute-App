package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Student;
import com.example.demo.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private Student cus;
	
	@Autowired
	private StudentRepository repo;

	@RequestMapping(value = "/studentDetails", method = RequestMethod.GET)
	public String initForm(Model model) {

		model.addAttribute("command", cus);
		return "addstudents";
	}
	
	@RequestMapping(value = "/studentDetails", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Student cus,Model model) {
		
		int rowAdded =repo.addStudent(cus);
		model.addAttribute("rowAdded",rowAdded);
		System.out.println(cus);
		return "addstudents";
	}
	@ModelAttribute("groups")
	public String[] branches() {
		
		return new String[] {"Computer Science","Electrical","Electronics","Mechanical","Chemical","Mining","Information Science","Production","Earth Science","Mettalurgy"};
	}
	@ModelAttribute("group")
	public String[] status() {
		
		return new String[] {"Placed","Unplaced"};
	}
	
	@RequestMapping(value = "/studentDetails/all", method = RequestMethod.GET)
	public String findAllStudents(Model model) {
		
		List<Student> list=repo.getAllStudent();
		model.addAttribute("list", list);
		return "showstudents";
	}
	@ModelAttribute("totalBranch")
	public String[] branch(){
		String[] branchList = repo.getTotalBranch();
		return branchList;
	}
	@RequestMapping(value="/studentDetails/SearchBranch", method = RequestMethod.GET)
	public String initBranch(Model model) {
		model.addAttribute("command",cus);
		return "searchBranch";
	}
	@RequestMapping(value="/studentDetails/branch",method=RequestMethod.POST)	
	public String findStudentsByBranch(@ModelAttribute("command") @RequestParam("branch")String selectBranch, Model model)
	{
		List<Student> list = repo.getBranch(selectBranch);
		
		model.addAttribute("list",list);
		return "branchBased";
	}
	
	@ModelAttribute("totalPercentage")
	public String[] percenatge(){
		String[] percenatageList = repo.getTotalPercentage();
		return percenatageList;
	}
	@RequestMapping(value="/studentDetails/SearchPercentage", method = RequestMethod.GET)
	public String initPercenatge(Model model) {
		model.addAttribute("command",cus);
		return "searchPercentage";
	}
	@RequestMapping(value="/studentDetails/percentage",method=RequestMethod.POST)	
	public String findStudentsByPercentage(@ModelAttribute("command") @RequestParam("percentage")String selectPercent, Model model)
	{
		List<Student> list = repo.getPercentage(selectPercent);
		
		model.addAttribute("list",list);
		return "percentageBased";
	}
	@RequestMapping(value="/studentDetails/buySold", method = RequestMethod.GET)
	public String initStatus(Model model) {
		model.addAttribute("command",cus);
		return "buysold";
	}
	@RequestMapping(value="/studentDetails/buySold",method=RequestMethod.POST)	
	public String findStatus(@ModelAttribute("command") @RequestParam("status")String buysold, Model model)
	{
		List<Student> list = repo.getDetailsStatus(buysold);
		
		model.addAttribute("list",list);
		return "getStatusDetails";
	}
}
