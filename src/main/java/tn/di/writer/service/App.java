package tn.di.writer.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"META-INF/applicationContext.xml");
		BeanFactory factory = context;
		PrintingService test = (PrintingService) factory
				.getBean("printingService");
		test.run();

	}

}
