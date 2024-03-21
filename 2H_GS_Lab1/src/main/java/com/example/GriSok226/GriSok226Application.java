package com.example.GriSok226;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class GriSok226Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cnx = new ClassPathXmlApplicationContext("appCon.xml");
		Music music = cnx.getBean("ClsMUBean1",CLMus.class);
		PlayMu MP = new PlayMu(new CLMus());
		MP.playM();
		System.out.println("First Project!");
		SpringApplication.run(GriSok226Application.class, args);
		cnx.close();
	}

}
