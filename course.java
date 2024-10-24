package com.example.rest_sqldemo;

import jakarta.persistence.*;

@Entity
@Table(name = "course_table")

public class course{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cid;
	private String name;
	private double price;
	public void setcid(Integer cid) {
		this.cid=cid;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setprice(double price) {
		this.price=price;
	}
	
	public Integer getcid() {
		return cid;
	}
	public String getname() {
		return name;
	}
	public double getprice() {
		return price;
	}
}





