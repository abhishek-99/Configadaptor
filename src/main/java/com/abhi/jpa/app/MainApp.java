package com.abhi.jpa.app;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhi.jpa.config.AppConfig;
import com.abhi.jpa.model.Person;
import com.abhi.jpa.service.PersonService;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		PersonService personService = con.getBean(PersonService.class);
		//Add persons.
		personService.add(new Person("SaiBaba", "Shiridi", "shridisai@gmail.com"));
		//get persons
		List<Person> allPersons = personService.getAllPersons();
		for (Person person : allPersons) {
			System.out.println("Id = "+ person.getId());
			System.out.println("First_Name = "+person.getFirstname());
			System.out.println("Last_Name = "+person.getLastname());
			System.out.println("Email = "+person.getEmail());
		}

	}

}
