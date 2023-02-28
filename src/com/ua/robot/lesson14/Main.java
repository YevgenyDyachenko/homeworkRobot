package com.ua.robot.lesson14;

import com.ua.robot.lesson14.domain.Student;
import com.ua.robot.lesson14.service.StudentService;
import com.ua.robot.lesson14.service.TeacherService;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.printStudents();

        TeacherService teacherService = new TeacherService();
        teacherService.printTeachers();
    }


}
