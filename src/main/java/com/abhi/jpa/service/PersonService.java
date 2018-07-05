package com.abhi.jpa.service;

import java.util.List;

import com.abhi.jpa.model.Person;

public interface PersonService {

void add(Person person);
List<Person>getAllPersons();
}
