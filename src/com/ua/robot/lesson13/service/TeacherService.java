package com.ua.robot.lesson13.service;


import com.ua.robot.lesson13.domain.Teacher;
import com.ua.robot.lesson13.repository.TeacherMemoryRepository;

public class TeacherService {

    private static final String TABLE_FORMAT = "|%-5s |%-20s |%-10s |%-10.1f| %-10s | %-10s |";
    private static final String TABLE_FORMAT_HEADER = "|%-5s |%-20s |%-10s |%-10s| %-5s | %-10s |";
    private static final int LINE_SIZE = 78;
    private TeacherMemoryRepository teacherMemoryRepository;

    public TeacherService() {
        teacherMemoryRepository = new TeacherMemoryRepository();

    }
    public void printTeachers(){
        printHeader();
        for (Teacher teacher: teacherMemoryRepository.findAll()){
            if(teacher!=null){
                String body = String.format(TABLE_FORMAT,
                        teacher.getId(),
                        teacher.getName(),
                        teacher.getAge(),
                       teacher.getSalary(),
                        teacher.getUniversity(),
                        teacher.getRole());


                System.out.println(body);


            }
        }
    }
    private void printHeader() {
        printDivider();
        System.out.printf((TABLE_FORMAT_HEADER) + "%n", "id", "name", "age", "salary", "university", "role");
        printDivider();
    }

    public Teacher[] findAll(){
        return teacherMemoryRepository.findAll();
    }

    private void printDivider() {
        for (int i = 0; i < LINE_SIZE; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

}
