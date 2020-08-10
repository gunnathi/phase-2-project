package com.classes;





import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.students.Student;
import com.teachers.Teachers;

@Entity
@Table
public class Classes {
@Id
private int classess;
   
public Classes() {
		
	}




	public Classes(int classess) {
	super();
	this.classess = classess;
}




	public int getClassess() {
		return classess;
	}



	public void setClassess(int classess) {
		this.classess = classess;
	}



	@Override
	public String toString() {
		return "Classes [classess=" + classess + "]";
	}



}
	
	 
	 
	