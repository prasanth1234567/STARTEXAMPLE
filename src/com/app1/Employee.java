package com.app1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="json")
public class Employee {
	
	@Id
	
private Integer id;
private String name;
private boolean permanent;
private String  role;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isPermanent() {
	return permanent;
}
public void setPermanent(boolean permanent) {
	this.permanent = permanent;
}

public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", permanent=" + permanent + ", role=" + role + "]";
}


}
