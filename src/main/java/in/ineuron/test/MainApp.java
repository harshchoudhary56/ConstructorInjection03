package in.ineuron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.Student;

public class MainApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		FileSystemResource fileSystemResource = new FileSystemResource("./src/main/java/in/ineuron/cfg/applicationContext.xml");
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(fileSystemResource);
		
		Student std1 = xmlBeanFactory.getBean("std1", Student.class);
		System.out.println(std1);
		
		Student std2 = xmlBeanFactory.getBean("std2", Student.class);
		System.out.println(std2);
		
		Student std3 = xmlBeanFactory.getBean("std3", Student.class);
		System.out.println(std3);
		
		Student std4 = xmlBeanFactory.getBean("std4", Student.class);
		System.out.println(std4);
		
	}	

}
