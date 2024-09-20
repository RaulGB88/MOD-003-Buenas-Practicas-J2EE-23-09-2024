package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.util.math.Factorial;

public class StartListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Bienvenido a la practica de classloaders en J2EE");
		
		System.out.println("Factorial(5) ==> "+Factorial.factorial(5));
		
	}

	 

}