package com.abhi.jpa.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.jpa.dao.PersonDao;
import com.abhi.jpa.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao personDao;
	
	@Transactional
	@Override
	public void add(Person person) {
		personDao.addPerson(person);
	}

	@Transactional(readOnly=true)
	@Override
	public List<Person> getAllPersons() {
		return personDao.getPersons();
	}

}
