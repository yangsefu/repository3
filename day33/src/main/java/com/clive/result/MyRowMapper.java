package com.clive.result;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.clive.bean.Student;

public class MyRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s =new Student();
		s.setId(rs.getInt("id"));
		s.setUsername(rs.getString("username"));
		s.setAge(rs.getInt("age"));
		s.setScore(rs.getDouble("score"));		
		return s;
	}

	

}
