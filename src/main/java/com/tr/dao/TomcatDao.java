package com.tr.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
@Repository("td")
@Profile({"tom"})
public class TomcatDao implements Idao {
	@Autowired
	private DataSource ds;
	
	@Override
	public void Get() {
		System.out.println(ds.getClass());
	}
}
