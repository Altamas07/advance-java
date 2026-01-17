package com.map1;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int id;
	private String name;
	@ManyToMany 
	@Column(name = "pro_id")
	private List<Project> pro;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, List<Project> pro) {
		super();
		this.id = id;
		this.name = name;
		this.pro =pro;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pro=" + pro + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Project> getPro() {
		return pro;
	}
	public void setPro(List<Project> pro) {
		this.pro = pro;
	}
	
}
