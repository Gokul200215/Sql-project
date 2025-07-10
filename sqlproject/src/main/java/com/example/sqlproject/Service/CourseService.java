package com.example.sqlproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.sqlproject.Entity.Course;
import com.example.sqlproject.Repository.CourseRepo;

@Service
public class CourseService {

	@Autowired
	CourseRepo crsRepo;

	public List<Course> ListAll() {
		return crsRepo.findAll();
	}

	public Object FindbyId(int id) {
		HashMap<String, Object> response = new HashMap<>();
		Optional<Course> getid = crsRepo.findById(id);
		if (getid.isPresent()) {
			response.put("data", getid.get());
			return response;
		}
		response.put("data", "Id not found");
		return response;
	}

//	public List<Course> findByName(String name){
//		return crsRepo.findName(name);
//	}

	public Object findByName(String name) {
		HashMap<String, Object> response = new HashMap<>();
		Optional<Course> getname = crsRepo.findName(name);
		if (getname.isPresent()) {
			response.put("data", getname.get());
			return response;
		}
		response.put("data", "Name not found");
		return response;
	}

	public String CreateUser(Course crs) {
		crsRepo.save(crs);
		return "User Created Successfully";
	}

	public Object UpdateUser(Course cr) {
		HashMap<String, Object> response = new HashMap<>();
		Optional<Course> getSt = crsRepo.findById(cr.getStd_id());
		if (getSt.isPresent()) {
			Course updCrs = getSt.get();
			if (cr.getStd_name().isEmpty()) {
				updCrs.setStd_name(cr.getStd_name());
			}
			if (cr.getTrainer_name().isEmpty()) {
				updCrs.setTrainer_name(cr.getTrainer_name());
			}
			if (cr.getCourse().isEmpty()) {
				updCrs.setCourse(cr.getCourse());
			}
			if (cr.getJoin_date() != null) {
				updCrs.setJoin_date(cr.getJoin_date());
			}
			if (cr.getPaid_amt() != null) {
				updCrs.setPaid_amt(cr.getPaid_amt());
			}
			if (cr.getBal_amt() != null) {
				updCrs.setBal_amt(cr.getBal_amt());
			}
			if (cr.getStd_address().isEmpty()) {
				updCrs.setStd_address(cr.getStd_address());
			}
			if (cr.getStd_num() != null) {
				updCrs.setStd_num(cr.getStd_num());
			}
			if (cr.getStatus().isEmpty()) {
				updCrs.setStatus(cr.getStatus());
			}
			crsRepo.save(updCrs);
			response.put("data", "updated Successfully");
			return response;
		}
		response.put("data", "Id not found");
		return response;
	}

	public Object DeleteUser(int dlid) {
		HashMap<String, Object> response = new HashMap<String, Object>();
		Optional<Course> deleteId = crsRepo.findById(dlid);
		if (deleteId.isPresent()) {
			crsRepo.deleteById(dlid);
			response.put("data", "Deleted Successfully");
			return response;
		}
		response.put("data", "ID not found");
		return response;
	}

}
