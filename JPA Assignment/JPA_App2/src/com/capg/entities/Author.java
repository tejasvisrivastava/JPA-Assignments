package com.capg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.Table;

@Entity
@Table(name="data")

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Author {
	
	@Id
	@Column(name="aid")
	private int id;
	@Column(name="aname")
	private String name;
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}
	public Author() {
		
	}
	public Author(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
