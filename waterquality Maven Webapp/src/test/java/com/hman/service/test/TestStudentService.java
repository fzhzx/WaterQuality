package com.hman.service.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hman.water.model.Student;
import com.hman.water.service.StudentServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestStudentService {

	private StudentServiceI studentService;
	
	public StudentServiceI getStudentService() {
		return studentService;
	}
	
	@Autowired
	public void setStudentService(StudentServiceI studentService) {
		this.studentService = studentService;
	}
	
	@Test
	public void testSubjectList() {
		Student student = new Student();
		student.setId(1);
		List<Student> lists = studentService.selectSubjectByStudentId(1);
		String json = JSON.toJSONString(lists, SerializerFeature.WriteMapNullValue);
		System.out.println(json);
	}
	
}
