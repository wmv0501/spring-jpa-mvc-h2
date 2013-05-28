package com.wmv.template.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.wmv.template.entity.Person;
import com.wmv.template.repository.PersonRepository;
import com.wmv.template.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Inject
	protected PersonRepository personRepository;

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}

}
