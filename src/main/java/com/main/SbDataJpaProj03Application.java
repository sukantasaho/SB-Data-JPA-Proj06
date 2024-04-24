package com.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.main.services.IDoctorService;
import com.main.view.IResultView1;
import com.main.view.IResultView2;

@SpringBootApplication
public class SbDataJpaProj03Application
{

	public static void main(String[] args) 
	{
		   ApplicationContext ctx = SpringApplication.run(SbDataJpaProj03Application.class, args);
		   IDoctorService service = ctx.getBean("docService", IDoctorService.class);
		   
		   System.out.println(service.registerDoctor("Banalaxmi", 35000f, "Gastronolofy"));
		      
		   System.out.println(service.displaySysDate());
		      ((ConfigurableApplicationContext) ctx).close();
	}

}
