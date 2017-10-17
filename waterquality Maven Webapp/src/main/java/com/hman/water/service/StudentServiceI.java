package com.hman.water.service;

import java.util.List;

import com.hman.water.model.Student;

public interface StudentServiceI {

	List<Student> selectSubjectByStudentId(Integer id);
}
