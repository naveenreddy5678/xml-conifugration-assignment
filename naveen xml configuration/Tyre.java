package com.practice;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	

	public Tyre() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String tyrebrand;

	public Tyre(String tyrebrand) {
		super();
		this.tyrebrand = tyrebrand;
	}

	public String getTyrebrand() {
		return tyrebrand;
	}

	public void setTyrebrand(String tyrebrand) {
		this.tyrebrand = tyrebrand;
	}

	@Override
	public String toString() {
		return "Tyre [tyrebrand=" + tyrebrand + "]";
	}
	
	}
	


