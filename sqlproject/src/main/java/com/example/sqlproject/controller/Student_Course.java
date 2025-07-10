package com.example.sqlproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.sqlproject.Entity.Course;
import com.example.sqlproject.Service.CourseService;

@RestController
@RequestMapping("/crs_detail")
public class Student_Course {

	@Autowired
	CourseService crsSer;

	@GetMapping("/ListAll")
	public List<Course> List() {
		return crsSer.ListAll();
	}

	@GetMapping("/FindById")
	public ResponseEntity<Object> FindId(@RequestParam int id) {
		return new ResponseEntity<Object>(crsSer.FindbyId(id), HttpStatus.OK);
	}

	@GetMapping("/FindByName")
	public ResponseEntity<Object> FindName(@RequestParam String name){
		return new ResponseEntity<Object>(crsSer.findByName(name),HttpStatus.OK);
	}
	
	@PostMapping("/CreateStudent")
	public String Createuser(@RequestBody Course crs) {
		return crsSer.CreateUser(crs);
	}
	
	@PutMapping("/UpdateStudent")
	public ResponseEntity<Object> Updateuser(@RequestBody Course cr){
		return new ResponseEntity<Object>(crsSer.UpdateUser(cr),HttpStatus.OK);
	}
	
	@DeleteMapping("DeleteUser")
	public ResponseEntity<Object> Deleteuser(@RequestParam int dlid){
		return new ResponseEntity<Object>(crsSer.DeleteUser(dlid),HttpStatus.OK);
		
	}
}
