package com.students;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.classes.Classes;
import com.subjects.Subjects;



@Table
@Entity
public class Student {
@GeneratedValue(strategy = GenerationType.AUTO)
 @Id
 private int studentId;
private String studentname;
 @OneToOne(fetch = FetchType.LAZY)
 @JoinColumn(name = "classes")
 private Classes classes;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public Classes getClasses() {
	return classes;
}
public void setClasses(Classes classes) {
	this.classes = classes;
}
public Student(String studentname, Classes classes) {
	super();
	this.studentname = studentname;
	this.classes = classes;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentname=" + studentname + ", classes=" + classes + "]";
}

 
    
  
 
 
}
