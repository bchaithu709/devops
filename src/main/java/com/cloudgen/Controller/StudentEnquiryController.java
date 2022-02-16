package com.cloudgen.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentEnquiryController {
	
	
	@RequestMapping("/hello")
	public String sef() {
		System.out.println("hello");
		return "student_enquiry_form";
		
	}
	
	
	@RequestMapping("/hi")
	public String fes() {
		System.out.println("hello");
		return "home";
		
	}


}