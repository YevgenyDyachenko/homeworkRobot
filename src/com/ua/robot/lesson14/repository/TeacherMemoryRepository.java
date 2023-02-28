package com.ua.robot.lesson14.repository;


import com.ua.robot.lesson14.domain.Teacher;

import java.util.Random;

public class TeacherMemoryRepository {
    public static final int SIZE = 10;
    private Teacher[] teachers = new Teacher[SIZE];




    public TeacherMemoryRepository() {
        fillArrayWithRandomTeachers();
    }
    public Teacher[] findAll(){
        return teachers;
    }

    public void save(Teacher teacher){
        for (int i=0; i<teachers.length; i++){
            if(teachers[i] == null){
                teachers[i] = teacher;
                break;
            }
        }
    }
    private void fillArrayWithRandomTeachers(){
        for(int i = 0; i<5; i++){
            Teacher teacher = getRandomTeacher();
            teacher.setId(i+1);
            save(teacher);
        }
    }

    private Teacher getRandomTeacher(){
        Random random = new Random();
        int nameSize = random.nextInt(4, 8);
        String name = generateRandomNameString(nameSize);
        int age = random.nextInt(25, 65);
        double salary = random.nextDouble(2000, 5000);
        String university = generateRandomNameString(2).toUpperCase();


        return  new Teacher(0, name, age, university, salary );

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
