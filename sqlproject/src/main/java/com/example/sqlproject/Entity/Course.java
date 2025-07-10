package com.example.sqlproject.Entity;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jakarta.persistence.*;

@Entity
@Table(name = "crs_detail") // Map to the correct database table
public class Course {

	@Id
	@Column(name = "STD_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int std_id;

	@Column(name = "STD_NAME")
	private String std_name;

	@Column(name = "TRAINER_NAME")
	private String trainer_name;

	@Column(name = "COURSE")
	private String course;

	@Column(name = "JOIN_DATE")
	private LocalDate join_date;

	@Column(name = "PAID_AMT")
	private Integer paid_amt;

	@Column(name = "BAL_AMT")
	private Integer bal_amt;

	@Column(name = "STD_ADDRESS")
	private String std_address;

	@Column(name = "STD_NUM")
	private long std_num;

	@Column(name = "STATUS")
	private String status;

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public String getTrainer_name() {
		return trainer_name;
	}

	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public LocalDate getJoin_date() {
		return join_date;
	}

	public void setJoin_date(LocalDate join_date) {
		this.join_date = join_date;
	}

	public Integer getPaid_amt() {
		return paid_amt;
	}

	public void setPaid_amt(Integer paid_amt) {
		this.paid_amt = paid_amt;
	}

	public Integer getBal_amt() {
		return bal_amt;
	}

	public void setBal_amt(Integer bal_amt) {
		this.bal_amt = bal_amt;
	}

	public String getStd_address() {
		return std_address;
	}

	public void setStd_address(String std_address) {
		this.std_address = std_address;
	}

	public Long getStd_num() {
		return std_num;
	}

	public void setStd_num(Long std_num) {
		this.std_num = std_num;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Course() {

	}

	public Course(int std_id, String std_name, String trainer_name, String course, LocalDate join_date,
			Integer paid_amt, Integer bal_amt, String std_address, Long std_num, String status) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.trainer_name = trainer_name;
		this.course = course;
		this.join_date = join_date;
		this.paid_amt = paid_amt;
		this.bal_amt = bal_amt;
		this.std_address = std_address;
		this.std_num = std_num;
		this.status = status;
	}

}