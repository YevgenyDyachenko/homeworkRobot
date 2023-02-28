package com.ua.robot.lesson13.service;

import com.ua.robot.lesson13.domain.Student;
import com.ua.robot.lesson13.repository.StudentMemoryRepository;

public class StudentService {
    private static final String TABLE_FORMAT = "|%-5s |%-20s |%-10s |%-10.1f| %-10s | %-10s |";
    private static final String TABLE_FORMAT_HEADER = "|%-5s |%-20s |%-10s |%-10s| %-5s | %-10s |";
    private static final int LINE_SIZE = 78;
    private StudentMemoryRepository studentMemoryRepository;

    public StudentService() {
        studentMemoryRepository = new StudentMemoryRepository();

    }
    public void printStudents(){
        printHeader();
        for (Student student: studentMemoryRepository.findAll()){
            if(student!=null){
                String body = String.format(TABLE_FORMAT,
                        student.getId(),
                        student.getName(),
                        student.getAge(),
                        student.getScores(),
                        student.getUniversity(),
                        student.getRole());


                System.out.println(body);


            }
        }
    }
    private void printHeader() {
        printDivider();
        System.out.printf((TABLE_FORMAT_HEADER) + "%n", "id", "name", "age", "scores", "university", "role");
        printDivider();
    }

public Student[] findAll(){
        return studentMemoryRepository.findAll();
}

    private void printDivider() {
        for (int i = 0; i < LINE_SIZE; i++) {
            System.out.print("_");
        }
        System.out.println();
    }


}
