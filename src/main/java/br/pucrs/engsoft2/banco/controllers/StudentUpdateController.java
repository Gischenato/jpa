package br.pucrs.engsoft2.banco.controllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Student;
// import br.pucrs.engsoft2.banco.beans.StudentRegistration;

@RestController
public class StudentUpdateController {
	@PutMapping("/update/student")
	public String updateStudentRecord(@RequestBody Student stdn) {
		System.out.println("In updateStudentRecord");   
		// return StudentRegistration.getInstance().upDateStudent(stdn);
		return "";
	}

}
