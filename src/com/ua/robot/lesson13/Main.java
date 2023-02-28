package com.ua.robot.lesson13;

import com.ua.robot.lesson13.service.StudentService;
import com.ua.robot.lesson13.service.TeacherService;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.printStudents();

        TeacherService teacherService = new TeacherService();
        teacherService.printTeachers();
    }


}
