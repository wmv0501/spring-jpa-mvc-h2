package com.wmv.template.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity
@Table(name = "PERSON")

public class Person implements Serializable {

	@Id
    @Column(name = "PERSON_ID")
    @GeneratedValue
	private Integer id;
	
	@Column(name = "PERSON_NAME")
    @Size(min = 1, max = 30)
    @NotNull
	private String name;
	
	@Column(name = "AGE")
    @Min(1)
    @Max(200)
    @NotNull
	private Integer age;
	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}   
	
   
}
