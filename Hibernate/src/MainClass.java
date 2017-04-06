import java.util.Iterator;
import org.hibernate.*;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.AnnotationConfiguration;

//import com.fasterxml.classmate.AnnotationConfiguration;

public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher=new Teacher();
		DAO dao=new DAO();
		teacher.setName("Aayushi");
		teacher.setSubject("Mul");
		
		dao.addTeacher(teacher);
		
		for(Teacher iter:dao.getTeacher()){
			System.out.println(iter.toString());
		}
		
		
		//teacher.setName("ABC");
		//teacher.setSubject("blah blah");
		//dao.updateTeacher(teacher);
		//System.out.println("Enter the name you want to update");
		//Scanner sc=new Scanner(System.in);
		//String update = sc.next();
		//teacher.setName(update);
		String name="Aayushi";
		dao.deleteTeacher(name);
		
	}
	
}