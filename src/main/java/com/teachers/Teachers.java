package com.teachers;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table

public class Teachers {	

@Id


private String teachername;
	private int contact;
	private String emailid;
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Teachers(String teachername, int contact, String emailid) {
		super();
		this.teachername = teachername;
		this.contact = contact;
		this.emailid = emailid;
	}
	
	
	@Override
	public String toString() {
		return "Teachers [teachername=" + teachername + ", contact=" + contact + ", emailid=" + emailid + "]";
	}
}
	