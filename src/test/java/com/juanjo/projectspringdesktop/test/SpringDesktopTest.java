/**
 * 
 */
package com.juanjo.projectspringdesktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.juanjo.projectspringdesktop.dao.DisqueraDAO;

/**
 * @author Juanjo
 *
 */
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		
		System.out.println("SpringDesktopTest.testContext(Contexto cargado correctamente)");
		System.out.println("SpringDesktopTest.testContext(disqueraDAO) = "+disqueraDAO);
		
		//::::::::::::::::PROPERTIES::::::::::::::::::
		Properties properties = (Properties) context.getBean("properties");
		
		System.out.println("SpringDesktopTest.testContext() = "+properties.get("spring-username"));
	}

}
