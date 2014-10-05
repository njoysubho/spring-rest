package org.example.rest.controller;

import org.example.rest.model.Student;
import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/user")
public class StudentController {
	@RequestMapping(value="/create/{id}",produces="application/json",method=RequestMethod.GET)
	public @ResponseBody Student create(@PathVariable int id){
		
		Student s=new Student();
		s.setStudentId(id);
		s.setStudentName("sabyasachi");
		return s ;
		
	}

}
