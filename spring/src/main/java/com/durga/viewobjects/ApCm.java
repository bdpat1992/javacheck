package com.durga.viewobjects;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class ApCm implements Serializable{

	private int id;
	@NotEmpty @Size(min=1,max=3)	
	private String name;
	private String party;
	
	public ApCm() {
		
	}
	
	public ApCm(int id,String name,String party) {
		this.id=id;
		this.name=name;
		this.party=party;
	}
	
	@Override
	public String toString() {
		return "ApCm [id=" + id + ", name=" + name + ", party=" + party + "]";
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
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	
	
}
