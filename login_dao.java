package com.login.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.login.beans.login_bean;

public class login_dao {

	private JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(login_bean login){    
	    String sql="select username,password from users where username="+login.getUsername()+", password="+login.getPassword()+"from login";    
	    return template.update(sql);
	        
	}    
}
