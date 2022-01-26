package com.student.student.Controller;

import com.student.student.Entity.Students;
import com.student.student.Service.impl.StudentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/students")
    public String listStudents(Model m) {
        m.addAttribute("studentall", studentService.getAllStudents());
        return "students";
    }

    
      @GetMapping(name = "/new")
      public String studentsnew(Model model) {
      Students student = new Students();
      student.setFname("Geeta");
      student.setLname("Pandey");
      student.setEmail("geeta@gmail.com");
      model.addAttribute("student", student);
      return "student-new";
      }
      
      @GetMapping("/studentsave")
      public String saveStudents(@ModelAttribute("student") Students student) {
      studentService.saveStudents(student);
      return "redirect:/students";
      }
      
     

}
