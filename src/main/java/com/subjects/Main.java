package com.subjects;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.classes.Classes;
import com.students.Student;
import com.teachers.Teachers;

public class Main {
	
	public static void main(String[] args) {
		
		Curb m2=new Curb();
	
	
			//m2.CreateTables();
		
		
		
		boolean again=true;
	      while(again) 
	      {
			System.out.println("**************************************************");
			System.out.println("**************************************************");
			System.out.println("*******WELCOME TO LEARNERS ACADEMY BACKEND ADMINISTRATIVE PORTAL******************");
			System.out.println("**************************************************");
			System.out.println("**************************************************");	          		
		    while(true){
		    	        System.out.println("Enter username");
		    
		    	        Scanner scan=new Scanner(System.in);
		    	       	String u=scan.nextLine();
		    	       	System.out.println("Enter password");
		    	       	String z=scan.nextLine();
		    	       	if(u.equals("admin123") && z.equals("admin123")) {
		    	       		System.out.println("You have logged in successfully as admin");
		    	       		break;
		    	       		}
		    	       	    
		    	       	else
		    	       		System.out.println("retry again ");
		    }
		    
		    
			
			
	        
	        System.out.println("Please select from the below options"); 
	        System.out.println("--------------------------------------");
	        System.out.println("1.Get the master list of all the teachers");
	        System.out.println("2.Get a master list of all the classes");
			System.out.println("3.Get a master list of all the Students");
			System.out.println("4.View report");
			
	        
	        Scanner scan=new Scanner(System.in);
	        int option=scan.nextInt();
	        System.out.flush(); 
	        switch(option)
	        {  
	        	
					 
		             
	        	
	        	case 1:
	        	{
	        		
	                System.out.println("Select from the below options");
					System.out.println("--------------------------------------"); 
	                System.out.println("1.Insert fields in the teachers table which you like to insert (teachername,contact,emailid)");
	                System.out.println("2.Delete the fields which you want delete from the table(teachername,contact,emailid)");
	                System.out.println("3.Update the fields which you want to update(teachername,contact,emailid)");
					System.out.println("4.Get the list of teachers table");
	                
	        		int option1=scan.nextInt();
	        		
	        		switch(option1)
	        		{
	        			case 1:
		        		{
		        			System.out.println("Enter fields in teachers table which you want to add");
		        			
		        			System.out.println("Enter teachers name");	
		        			scan.nextLine();
		        			String ch=scan.nextLine();
		        			
		        			System.out.println("Enter teachers contact"); 		        			
		        			int c=scan.nextInt();
		        			
		        			
		        			System.out.println("Enter teachers emailid");
		        			scan.nextLine();
		        			String h=scan.nextLine();
		        			
		        			
		        			m2.insertTeacher(ch, c, h);
		        			m2.listTeachers();
		        			break;		        			
		        		}
		        		
		        		case 2:
		        		{   		        			
		        			System.out.println("Enter teachers name to be deleted");
		        			scan.nextLine();
		        			String ch=scan.nextLine();
		        			
		        			m2.deleteTeacher(ch);
		        			break;	
		        		}
		        	        		
		        		case 3:
		        		{        			
		        		     System.out.println("Enter Teacher details you want to update in teachers table");
		        		     m2.updateTeachers2();
		        		     break;
		        		     
		        		}
						case 4:
						{
		        		    m2.listTeachers();
		        		    break;
						}	
					
	        		    default:
		            		System.out.println("Option is invalid");
		            		scan.nextLine();
		            		
		            		break;         			
	        		      		        		
	        		
	        	}
	        		break;
	        	}
	        	case 2:
				{
	                System.out.println("Select from the below options");
					System.out.println("--------------------------------------"); 
	                System.out.println("1.Insert the class which you want to add");	               	               
					System.out.println("2.Get the list of class table");
	                
	        		int option3=scan.nextInt();
	        		
	        		switch(option3)
	        		{
	        			case 1:
		        		{
		        			System.out.println("Insert the class which you want to add");
		        			System.out.println("Enter class"); 		        			
		        			int y=scan.nextInt();
		        			m2.insertClasses(y);
		        			m2.ListClass();
		        			break;
		        			
		        			
		        			
		        		}
		        		
		        		case 2:
		        		{   
		        		
		        			m2.ListClass();
		        			break;
		        			
		        		}
		        	        				        							
	        		    default:
		            		System.out.println("Option is invalid");
		            		scan.nextLine();
		            		
		            		break;         			
	        		      		        		
	        		
	        	}
	        		break;
				}
				case 3:
				{
				   System.out.println("Select from the below options");
					System.out.println("--------------------------------------"); 
	                System.out.println("1.Insert the fileds in the students table which you want to insert(id,name,class)");
	                System.out.println("2.Delete the fields in the students table which you want to delete(id,name,class)");
	                System.out.println("3.Update the fields which you want to update(id,name,class)");
					System.out.println("4.Get the list students table");
	                
	        		int option5=scan.nextInt();
	        		
	        		switch(option5)
	        		{
	        			case 1:
		        		{
		        			System.out.println("Insert the students which you want to add");
		        			m2.insertStudent();
		        			
		        			m2.listStudents();
		        			break;
		        			
		        		}
		        		
		        		case 2:
		        		{   
		        			
		        			m2.listStudents();
		        			System.out.println("Enter Student id to be deleted");
		        			scan.nextLine();
		        			int ch=scan.nextInt();
		        			m2.deleteStudent(ch);
		        			   break;
		        			
		        		}
		        	        		
		        		case 3:
		        		{   
		        			m2.listStudents();
		        			System.out.println("From the above list Select the Id which you want to update the name");
		        			scan.nextLine();
		        		      m2.updateStudents2();
		        		    
		        		       break;
		        		     
		        		}
						case 4:
						{
		        		     System.out.println("Get the entire list of students table");
		        		     m2.listStudents();
		        		       break;
	        		}	
					
	        		    default:
		            		System.out.println("Option is invalid");
		            		scan.nextLine();
		            		
		            		break;         			
	        		      		        		
	        		
		
	            }
	        		break;
				}
				case 4:
				{
	        		//System.out.println("Thanks for using the application");
					m2.listfinalreport();
					break;
	        		
	        		
	        	}  
	        	default:
	        		System.out.println("Option is invalid");
	        		scan.nextLine();
	        		
	        		break;
	        }
	        System.out.println("Do you want to continue again Y or N??");
	        
	        scan.nextLine();
	        String temp=scan.nextLine();
	        if (temp.equalsIgnoreCase("Y"))
	        	again=true;
	        else
	        	again=false;
	      
	      }
	    		System.out.println("Thanks for using the application");
	    		System.exit(0);
	}
	}







