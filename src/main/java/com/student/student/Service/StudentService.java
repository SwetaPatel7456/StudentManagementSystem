package com.student.student.Service;

import java.util.List;

import com.student.student.Entity.Students;

public interface StudentService {
    public List<Students> getAllStudents();

    public Students saveStudents(Students student);

    public Students getStudentById(long id);
    public Students updateStudent(Students s);
    public void deleteStudent(long id);

}
