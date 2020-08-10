package com.subjects;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.classes.Classes;
import com.teachers.Teachers;



	@Entity
	@Table
	public class Subjects {
		
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	
	    private int id;
	    private String subject;
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "classes")
	    private Classes classes;
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "teacher")
	    private Teachers teachers;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public Classes getClasses() {
			return classes;
		}
		public void setClasses(Classes classes) {
			this.classes = classes;
		}
		public Teachers getTeachers() {
			return teachers;
		}
		public void setTeachers(Teachers teachers) {
			this.teachers = teachers;
		}
		public Subjects( String subject, Classes classes, Teachers teachers) {
			super();
			this.subject = subject;
			this.classes = classes;
			this.teachers = teachers;
		}
		
	
		@Override
		public String toString() {
			return "Subjects [id=" + id + ", subject=" + subject + ", classes=" + classes + ", teachers=" + teachers
					+ "]";
		}
	    
	    
	}