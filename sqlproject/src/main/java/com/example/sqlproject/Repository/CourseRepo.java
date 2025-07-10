package com.example.sqlproject.Repository;

//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.sqlproject.Entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

	@Query(value = "select * from crs_detail c where c.std_name like %?1%",
			nativeQuery = true)

	// List format
	// public List<Course> findName(String name);

	// Optional format
	public Optional<Course> findName(String name);
}
