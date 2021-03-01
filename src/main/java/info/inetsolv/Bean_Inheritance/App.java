package info.inetsolv.Bean_Inheritance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.inetsolv.beans.Student;

public class App 
{
   
	public static void main( String[] args )
    {
       ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationcontext.xml");
       
       Student student1 = container.getBean("s1", Student.class);
       Student student2=container.getBean("s2",Student.class);
       
       System.out.println(student1);
       System.out.println(student2);
       container.close();
    }
}
