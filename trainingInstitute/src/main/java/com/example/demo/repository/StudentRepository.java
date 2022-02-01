package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Student;

@Repository
public class StudentRepository {
	
	@Autowired
	private JdbcTemplate template;
	
	public int addStudent(Student entity) {
		SimpleJdbcInsert inserter =new SimpleJdbcInsert(template);
		inserter.withTableName("student").usingColumns("student_name","percentage","branch","phone","email","status");
		BeanPropertySqlParameterSource sql=new BeanPropertySqlParameterSource(entity);
		return inserter.execute(sql);
	}
	public List<Student> getBranch(String student_branch)
	{
		String sql = "select * from student where branch=?";
		List<Student> cus =template.query(sql, new Object[]{student_branch},new BeanPropertyRowMapper<>(Student.class));
		return cus;
	}
	public String[] getTotalBranch() {
		String sql = "select distinct(branch) from student";
		List<String> lst = template.queryForList(sql, String.class);
		String[] branchAll = lst.toArray(new String[lst.size()]);
	
		return branchAll;
	}
	
	public List<Student> getPercentage(String student_percentage)
	{
		String sql = "select * from student where percentage>=?";
		List<Student> cus =template.query(sql, new Object[]{student_percentage},new BeanPropertyRowMapper<>(Student.class));
		return cus;
	}
	public String[] getTotalPercentage() {
		String sql = "select distinct(percentage) from student";
		List<String> lst = template.queryForList(sql, String.class);
		String[] percentageAll = lst.toArray(new String[lst.size()]);
	
		return percentageAll;
	}
	public List<Student> getAllStudent(){
		String sql="select * from student ";
		List<Student> custList=template.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
		return custList;
		
	}
	public List<Student> getDetailsStatus(String student_status){
		String sql = "select * from student where status=?";
		List<Student> cus =template.query(sql, new Object[]{student_status},new BeanPropertyRowMapper<>(Student.class));
		return cus;
	}
	
}
