package com.ua.robot.lesson14.repository;

import com.ua.robot.lesson14.domain.Student;

import java.util.Random;

public class StudentMemoryRepository {

    public static final int SIZE = 15;
    private Student[] students = new Student[SIZE];




    public StudentMemoryRepository() {
        fillArrayWithRandomStudents();
    }
    public Student[] findAll(){
        return students;
    }

    public void save(Student student){
        for (int i=0; i<students.length; i++){
            if(students[i] == null){
                students[i] = student;
                break;
            }
        }
    }
    private void fillArrayWithRandomStudents(){
        for(int i = 0; i<8; i++){
            Student student = getRandomStudent();
            student.setId(i+1);
            save(student);
        }
    }

    private Student getRandomStudent(){
        Random random = new Random();
        int nameSize = random.nextInt(4, 8);
        String name = generateRandomNameString(nameSize);
        int age = random.nextInt(17, 25);
        double scores = random.nextDouble(2.4, 5.3);
        String university = generateRandomNameString(2).toUpperCase();


        return  new Student(0, name, age, university, scores );

    }
    private String generateRandomNameString(int size){
        String alphaNumericStr = "abcdefghijklmnopqrstuvxyz";
        Random random  = new Random();
        StringBuilder result = new StringBuilder();
        for (int i =0; i< size; i++){
            for (int j = 0; j < random.nextInt(1, 3); j++) {
                result.append(alphaNumericStr.charAt(random.nextInt(0, alphaNumericStr.length())));

            }
        }
        result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
        return result.toString();
    }



}
