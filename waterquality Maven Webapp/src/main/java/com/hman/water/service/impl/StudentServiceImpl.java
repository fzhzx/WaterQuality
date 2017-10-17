package com.hman.water.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hman.water.dao.StudentMapper;
import com.hman.water.model.Student;
import com.hman.water.service.StudentServiceI;

@Service("studentServiceI")
public class StudentServiceImpl implements StudentServiceI {
	
	private StudentMapper studentMapper;
	
	public StudentMapper getStudentMapper() {
		return studentMapper;
	}
	
	@Autowired
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	@Override
	public List<Student> selectSubjectByStudentId(Integer id) {
		// TODO Auto-generated method stub
		return studentMapper.selectStuAndSubById(id);
	}

}
