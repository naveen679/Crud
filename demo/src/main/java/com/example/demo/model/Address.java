package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Component
@Entity
public class Address {
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private int Hno;
	private String strname;
	private String vname;
	private String statename;
	
	public Address(int hno, String strname, String vname, String statename) {
		super();
		Hno = hno;
		this.strname = strname;
		this.vname = vname;
		this.statename = statename;
	}
	public int getHno() {
		return Hno;
	}
	public void setHno(int hno) {
		Hno = hno;
	}
	public String getStrname() {
		return strname;
	}
	public void setStrname(String strname) {
		this.strname = strname;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
}
