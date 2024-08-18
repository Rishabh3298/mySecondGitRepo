package com.telusko.Employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Main {

	public static void main(String[] args) {
		
		
		  DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
	        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	        
	        // Load bean definitions from XML configuration files
	        reader.loadBeanDefinitions(new ClassPathResource("employeeConfig.xml"));
	        reader.loadBeanDefinitions(new ClassPathResource("employeeConfig2.xml"));
	        
	        // Retrieve beans by their IDs or by their classes
	        Employee employee = (Employee) factory.getBean("Rishabh");
	        SelfInfo selfInfo = (SelfInfo) factory.getBean("Rishabh2");
	        
	        // Print the bean details to the console
	        System.out.println(employee);
	        System.out.println(selfInfo);
	}
}
