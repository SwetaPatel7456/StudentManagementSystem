package com.student.student.Service.impl;

import java.util.List;

import com.student.student.Entity.Students;
import com.student.student.Repository.StudentRepository;
import com.student.student.Service.StudentService;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Students> getAllStudents() {

        List<Students> students =  studentRepository.findAll();
        return students;
    }

    @Override
    public Students saveStudents(Students student) {

        return studentRepository.save(student);
    }
    @Override
    public Students getStudentById(long id){
    	return studentRepository.findById(id).get();
    }
    

	@Override
	public Students updateStudent(Students s) {
		
		return studentRepository.save(s);
	}

	@Override
	public void deleteStudent(long id) {
		studentRepository.deleteById(id);
		
	}

}
