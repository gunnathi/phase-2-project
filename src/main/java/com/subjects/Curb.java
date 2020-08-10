package com.subjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.classes.Classes;
import com.students.Student;
import com.teachers.Teachers;

public class Curb {
	
	public void CreateTables() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
	
	
		
		
		
	
		
		
		Classes c1 = new Classes(1);
		Classes c2 = new Classes(2);
		Classes c3 = new Classes(3);
		Classes c4 = new Classes(4);
		Classes c5 = new Classes(5);
		Classes c6 = new Classes(6);
		Classes c7 = new Classes(7);
		Classes c8 = new Classes(8);
		Classes c9 = new Classes(9);
		
		
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		session.save(c5);
		session.save(c6);
		session.save(c7);
		session.save(c8);
		session.save(c9);
		
		
		
		Teachers te1 = new Teachers("Sarala", 958654, "saraldevi124.id");
		Teachers te2 = new Teachers("gopinath", 3456778, "gopina345.id");
		Teachers te3 = new Teachers("lasya", 568905, "lasya456.id");
		Teachers te4 = new Teachers("sweety", 234567, "swettu000.id");
		Teachers te5 = new Teachers("divya", 123456, "divya2111.id");
		Teachers te6 = new Teachers("rishitha", 456789, "ri98.id");
		Teachers te7 = new Teachers("deepu", 98765322, "de09.id");
		Teachers te8 = new Teachers("kavya", 44768890, "kavya543.id");
		Teachers te9 = new Teachers("swetha", 00034567, "swetha654.id");
		
		
		session.save(te1);
		session.save(te2);
		session.save(te3);
		session.save(te4);
		session.save(te5);
		session.save(te6);
		session.save(te7);
		session.save(te8);
		session.save(te9);
		
		
		
		
		

		
		  Subjects s1=new Subjects("Maths",c1,te1); 
		  Subjects s2=new Subjects("Science",c2,te2);
		  Subjects s3=new Subjects("Social",c3,te3);
		  Subjects s4=new Subjects("Hindi",c4,te4);
		  Subjects s5=new Subjects("Telugu",c5,te5);
	      Subjects s6=new Subjects("Kannada",c6,te6);
		   Subjects s7=new Subjects("Malayalam",c7,te7); 
		   Subjects s8=new Subjects("Art",c8,te8);
		   Subjects s9=new Subjects("Drawing",c9,te9);
		   
  
   	  
		  
		  
		  
		  session.save(s1); session.save(s2); session.save(s3); session.save(s4);
		  session.save(s5); session.save(s6); session.save(s7); session.save(s8);
		  session.save(s9);
		  	 	
		
		  Student st1=new  Student("Abhishek",c1);
			Student st2=new  Student("Tejaswini",c2);
			Student st3=new  Student("Dileep",c3);
			Student st4=new  Student("Soma",c4);
			Student st5=new  Student("Varsha",c5);
			Student st6=new  Student("Pravalikha",c6);
			Student st7=new  Student("pandu",c7);
			Student st8=new  Student("vinay",c8);
			Student st9=new  Student("shilpa",c9);
			
			session.save(st1);
			session.save(st2);
			session.save(st3);
			session.save(st4);
			session.save(st5);
			session.save(st6);
			session.save(st7);
			session.save(st8);
			session.save(st9);
			
			

		transaction.commit();
		session.close();
		factory.close();
	}
	
/*---------------------------------------- INSERTS --------------------------------------*/
	
	public void insertTeacher(String ch, int c, String h) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Teachers te1 = new Teachers(ch, c, h);
		session.save(te1);
		
		transaction.commit();
		session.close();
		factory.close();
		
	}
	
	//Inserting subject
	
	
	
	public void insertClasses(int y) {
	// TODO Auto-generated method stub
	
	Configuration configuration = new Configuration().configure();
	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
	SessionFactory factory = configuration.buildSessionFactory(builder.build());
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();

	Classes ce1 = new Classes(y);
	
	session.save(ce1);
	
	transaction.commit();
	session.close();
	factory.close();
	
}
	
	//Insert Subject
	public void insertSubject() {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
        
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter subject "); 
	    String b=scan.nextLine();
		System.out.println("Enter class "); 
		int d=scan.nextInt();
		Classes c1=new Classes();
		c1.setClassess(d);
		
		
		this.listTeachers();
		System.out.println("Enter teacher you want to assign for this subject from above list of teachers");
		scan.nextLine(); 
		String e=scan.nextLine();
		String strArray[]=this.getTeachers(e);
	    
		Teachers t1=new Teachers(strArray[0],Integer.parseInt(strArray[1]),strArray[2]);
		
		Subjects sb1 = new Subjects(b, c1, t1);
		session.save(sb1);
		
		transaction.commit();
		session.close();
		factory.close();
	}
	
				
	//Inserting Student
	
	public void insertStudent() {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
        
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter Studentname "); 
	    String ce=scan.nextLine();
		System.out.println("Enter class "); 
		int cf=scan.nextInt();
		Classes ce1 = new Classes(cf); 	
		
		Student sb1 = new Student(ce, ce1);
		session.save(sb1);
		
		transaction.commit();
		session.close();
		factory.close();
	}
	
		
	/*---------------------------------------- END OF INSERTS --------------------------------------*/
	
	/*---------------------------------------- BEGIN OF DELETES --------------------------------------*/
	
		
	
	/* Method to delete an employee from the records */



	public void deleteTeacher(String Teachername) 
	{
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-2";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			
			//Step3
			Statement statement=connection.createStatement();
			String q1 = "DELETE from teachers WHERE teachername = '" + Teachername +"'";
			
			
            int x = statement.executeUpdate(q1); 
			
			
			String sql="select teachername,contact,emailid from teachers";
			
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			//System.out.println("Query executed");
			
			//Step5
			System.out.println("-----------------------------");
			System.out.println("\n Updated Teachers Details are : ");
			System.out.println("-----------------------------");
			System.out.print("Name\t\t"+" Contact\t\t"+" emailId\t\t"+"\n");
			while(resultSet.next()) {
				
				System.out.print(resultSet.getString("teachername")+"\t\t"+resultSet.getInt("contact")+"\t\t"+resultSet.getString("emailid")+"\n");								
			}
			//System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

	
	public void deleteStudent(int studentId) 
	{
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-2";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			
			//Step3
			Statement statement=connection.createStatement();
			String q1 = "DELETE from student WHERE studentId = '" + studentId +"'";
			
			
            int x = statement.executeUpdate(q1); 
			
			
			String sql="select studentId,studentname,classes from student";
			
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			//System.out.println("Query executed");
			
			//Step5
			System.out.println("-----------------------------");
			System.out.println("\n Updated Student Details are : ");
			System.out.println("-----------------------------");
			System.out.print("studentId\t\t"+" studentname\t\t"+" classes\t\t"+"\n");
			while(resultSet.next()) {
				
				System.out.print(resultSet.getInt("studentId")+"\t\t"+resultSet.getString("studentname")+"\t\t"+resultSet.getInt("classes")+"\n");								
			}
			//System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

	/*---------------------------------------- END OF DELETES --------------------------------------*/
	
	/*---------------------------------------- BEGIN OF DISPLAYS --------------------------------------*/

	
	public void listTeachers( )
	{
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-2";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			//Step3
			Statement statement=connection.createStatement();
			String sql="select teachername,contact,emailid from teachers";
			
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			//System.out.println("Query executed");
			
			//Step5
			System.out.println("-----------------------------");
			System.out.println("\nTeachers Details are : ");
			System.out.println("-----------------------------");
			System.out.print("Name\t\t"+" Contact\t\t"+" emailId\t\t"+"\n");
			while(resultSet.next()) {
				
				System.out.print(resultSet.getString("teachername")+"\t\t"+resultSet.getInt("contact")+"\t\t"+resultSet.getString("emailid")+"\n");								
			}
			//System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
	
	public String[] getTeachers(String teachername)
	{
		Connection connection=null;
		 String strArray[] = null;
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-2";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			//Step3
			Statement statement=connection.createStatement();
			String q1 = "SELECT teachername,contact,emailid from teachers WHERE teachername = '" + teachername +"'";
			
			
			//Step4
			ResultSet resultSet=statement.executeQuery(q1);
			
			while(resultSet.next()) {
				System.out.print(strArray[0]);
				
				
				strArray[0]=resultSet.getString("teachername");
				int temp=resultSet.getInt("contact");
				strArray[1]= Integer.toString(temp);
				System.out.print(strArray[1]);
				strArray[2]=resultSet.getString("emailid");
				System.out.print(strArray[2]);
				//System.out.print(resultSet.getString("teachername")+"\t\t"+resultSet.getInt("contact")+"\t\t"+resultSet.getString("emailid")+"\n");								
			}
			//System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		return strArray;
	}
	
	
	public void listStudents() {
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-2";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			//Step3
			Statement statement=connection.createStatement();
			String sql="select studentId,studentname,classes from student";
			
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			//System.out.println("Query executed");
			
			//Step5
			System.out.println("-----------------------------");
			System.out.println("\n Updated Student Details are : ");
			System.out.println("-----------------------------");
			System.out.print("studentId\t\t"+" studentname\t\t"+" classes\t\t"+"\n");
			while(resultSet.next()) {
				
				System.out.print(resultSet.getInt("studentId")+"\t\t"+resultSet.getString("studentname")+"\t\t"+resultSet.getInt("classes")+"\n");								
			}
			//System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		
	}


	

	public void ListClass( )
	{
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-2";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			//Step3
			Statement statement=connection.createStatement();
			String sql="select classess from classes";
			
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			//System.out.println("Query executed");
			
			//Step5
			System.out.println("-----------------------------");
			System.out.println("\nClass Details are : ");
			System.out.println("-----------------------------");
			System.out.print("Classes"+"\n");
			while(resultSet.next()) {
				
				System.out.print(resultSet.getInt("classess")+"\n");								
			}
			//System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		
	}
	
	
/*---------------------------------------- END OF DISPLAYS --------------------------------------*/
	
	/*---------------------------------------- BEGIN OF UPDATES --------------------------------------*/
	
	public void updateTeachers2()
	{
		System.out.println("Enter teachers name to be updated");
		Scanner scan=new Scanner(System.in); 
		String teachername=scan.nextLine();
		System.out.println("Enter conatct number to be updated");		
		int contact=scan.nextInt();
		
		//System.out.println("Enter emailId  to be updated");
		//scan.nextLine(); 
		//String emailId=scan.nextLine();
		
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-2";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			
			//Step3
			Statement statement=connection.createStatement();
			
			String q1 = "UPDATE teachers set contact = '" + contact +  
                    "' WHERE teachername = '" +teachername +  "'"; 
            int x = statement.executeUpdate(q1); 
			
			
			String sql="select teachername,contact,emailid from teachers";
			
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			//System.out.println("Query executed");
			
			//Step5
			System.out.println("-----------------------------");
			System.out.println("\n Updated Teachers Details are : ");
			System.out.println("-----------------------------");
			System.out.print("Name\t\t"+" Contact\t\t"+" emailId\t\t"+"\n");
			while(resultSet.next()) {
				
				System.out.print(resultSet.getString("teachername")+"\t\t"+resultSet.getInt("contact")+"\t\t"+resultSet.getString("emailid")+"\n");								
			}
			//System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
	
	public void updateStudents2()
	{
		
		Scanner scan=new Scanner(System.in); 
		int studentId=scan.nextInt();
		//System.out.println("Enter class number to be updated");		
		//int classes=scan.nextInt();
		System.out.println("Enter name to be updated");
		scan.nextLine();
		String name=scan.nextLine();
		
		//System.out.println("Enter emailId  to be updated");
		//scan.nextLine(); 
		//String emailId=scan.nextLine();
		
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-2";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			
			//Step3
			Statement statement=connection.createStatement();
			
			String q1 = "UPDATE student set studentname = '" + name +  
                    "' WHERE studentId = '" +studentId +  "'"; 
            int x = statement.executeUpdate(q1); 
			
			
            String sql="select studentId,studentname,classes from student";
			
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			//System.out.println("Query executed");
			
			//Step5
			System.out.println("-----------------------------");
			System.out.println("\n Updated Student Details are : ");
			System.out.println("-----------------------------");
			System.out.print("studentId\t"+" studentname\t"+" classes\t"+"\n");
			while(resultSet.next()) {
				
				System.out.print(resultSet.getInt("studentId")+"\t"+resultSet.getString("studentname")+"\t"+resultSet.getInt("classes")+"\n");								
			}
			//System.out.println("Results Processed");	
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}


	/*---------------------------------------- END OF DISPLAYS --------------------------------------*/
	
	/*---------------------------------------- REPORT START--------------------------------------*/
	public void listfinalreport() {
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-2";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			//Step3
			Statement statement=connection.createStatement();
			String sql="SELECT Student.classes,Student.studentId, Student.studentname,Subjects.subject,Subjects.teacher,\r\n" + 
					"teachers.contact,teachers.emailId\r\n" + 
					"FROM (\r\n" + 
					"(Subjects\r\n" + 
					"INNER JOIN Student ON Student.classes=Subjects.classes)\r\n" + 
					"\r\n" + 
					"INNER JOIN teachers ON teachers.teachername=Subjects.teacher );";
			
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			//System.out.println("Query executed");
			
			//Step5
			System.out.println("-----------------------------");
			System.out.println("\n Class report is as below : ");
			System.out.println("-----------------------------");
			System.out.print("classes\t"+" studentid\t"+" studentname\t\t"+"subject\t"+"teacher\t"+"contact\t"+"emailid\t"+"\n");
			while(resultSet.next()) {
				
				System.out.print(resultSet.getInt("classes")+  "\t"  + resultSet.getInt("studentId")+  "\t"+  resultSet.getString("studentname")+  "\t"+
						resultSet.getString("subject")+  "\t"  +   resultSet.getString("teacher")+  "\t"   +resultSet.getInt("contact")+
						"\t\t"+  resultSet.getString("emailId")+  "\t\n");
				
				
			}
			//System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
}
}
