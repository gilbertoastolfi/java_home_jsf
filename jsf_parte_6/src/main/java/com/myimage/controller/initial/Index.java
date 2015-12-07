package com.myimage.controller.initial;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class Index {

	@PostConstruct
	public void init() {
		System.out.println("Bean executado!");
	}

	public String getMessage() {
		return "Hello World JSF!";
	}

	public String register() {
		return "/public/register.xhtml";
	}
}
