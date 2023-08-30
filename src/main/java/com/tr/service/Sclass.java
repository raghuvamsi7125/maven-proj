package com.tr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tr.dao.OraDao;

@Service
public class Sclass {

	@Autowired
	private OraDao od;
	
	public void Get(int id,String name) {
		System.out.println(od.Insert(id, name));
	}
}
