package com.abhi.jpa.dao;

import java.util.List;

import com.abhi.jpa.model.Person;

public interface PersonDao {

	void addPerson(Person person);
	List<Person>getPersons();
}
