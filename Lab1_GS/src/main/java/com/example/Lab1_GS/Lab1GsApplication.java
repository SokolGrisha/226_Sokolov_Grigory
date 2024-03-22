package com.example.Lab1_GS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Lab1GsApplication {

	public static BP feed(Product a){
		return (BP) a;
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cnx = new ClassPathXmlApplicationContext("ContextApplication.xml");
		Product Fig = cnx.getBean("FigureB",Figure.class);
		feed(Fig).setName("Figure");
		Product KF = cnx.getBean("KeyFigureB",KeyFigure.class);
		feed(KF).setName("KeyFigure");
		Product RB = cnx.getBean("RandomBB",RandomBox.class);
		feed(RB).setName("Random");
		Cart crt = new Cart();
		crt.add(Fig);
		crt.add(KF);
		crt.add(RB);
		crt.Show();
		SpringApplication.run(Lab1GsApplication.class, args);
		cnx.close();
	}

}
