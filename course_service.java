package com.example.rest_sqldemo;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class course_service {
	@Autowired
	course_repo repo;
	public String upsert(course Course) {
		repo.save(Course);
		return "Inserted successfully";
	}
	public course getbyid(Integer cid) {
		Optional<course> cs=repo.findById(cid);
		if(cs.isPresent()) {
			return cs.get();
		}
		else {
			return null;
		}
	}
	public List<course> getallcourses() {
		return repo.findAll();
	}
	public String deletebyid(Integer cid) {
		if(repo.existsById(cid)) {
			repo.deleteById(cid);
			return "delete success";
		}
		else {
			return "no record found";
		}
	}
}
