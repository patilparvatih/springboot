package com.example.rest_sqldemo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class course_controller {
	@Autowired
	course_service service;
	
	@PostMapping("/course")
	public ResponseEntity<String> addcousre(@RequestBody course Course){
		String status=service.upsert(Course);
		return new ResponseEntity<String>(status,HttpStatus.CREATED);
	}
	
	@GetMapping("/course/{cid}")
	public ResponseEntity<course> getCourse(@PathVariable Integer cid){
		course crs=service.getbyid(cid);
		return new ResponseEntity<course>(crs,HttpStatus.OK);
	}
	@GetMapping("/courses")
	public ResponseEntity<List<course>> getcourses(){
		List<course> allcourses=service.getallcourses();
		return new ResponseEntity<List<course>>(allcourses,HttpStatus.OK);
	}
	@PutMapping("/course")
	public ResponseEntity<String> updatecourse(@RequestBody course Course){
		String status=service.upsert(Course);
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}
	@DeleteMapping("/course/{cid}")
	public ResponseEntity<String> deletecourse(@PathVariable Integer cid){
		String status=service.deletebyid(cid);
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}
}
