package com.tr.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tr.service.Sclass;

@Component
public class RClass implements CommandLineRunner {

	@Autowired
	private Sclass sc;
	
	@Override
	public void run(String... args) throws Exception {
	    sc.Get(7125, "raghu");
	}

}
