package br.pucrs.engsoft2.banco.controllers;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class StudentDeleteController {

//	@RequestMapping(method = RequestMethod.DELETE, value="/delete/student/{regdNum}")
//
//	@ResponseBody
	@DeleteMapping("/delete/student/{regdNum}")
	public String deleteStudentRecord(@PathVariable("regdNum") String regdNum) {
		System.out.println("In deleteStudentRecord");   
		// return StudentRegistration.getInstance().deleteStudent(regdNum);
		return "";
	}

}
