package com.tr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class OraDao{
private static final String Q="INSERT INTO EPROJ(EID,ENAME)VALUES(?,?)";
@Autowired
private JdbcTemplate jt;

public int Insert(int id,String name) {
	int c=jt.update(Q,id,name);
	return c;
   }

System.out.println("hii");
}
