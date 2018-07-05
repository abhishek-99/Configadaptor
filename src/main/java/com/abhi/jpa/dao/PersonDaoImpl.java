package com.abhi.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.abhi.jpa.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao{

	@PersistenceContext
	private EntityManager em;
	@Override
	public void addPerson(Person person) {
		em.persist(person);
		
	}

	@Override
	public List<Person> getPersons() {
		@SuppressWarnings("unchecked")
		List<Person>personList= em.createNamedQuery("getAllPersons",Person.class).getResultList();
		return personList;
	}

}
