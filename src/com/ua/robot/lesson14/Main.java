package com.ua.robot.lesson14;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Patrick", 50, "MIT", 4552.2);
        Student student = new Student("Thomas", 18, "Oxford", 5.0);


        System.out.println(teacher);
        System.out.println(student);

        teacher.doWork(teacher.name);
        student.doWork(student.name);

        teacher.belongsTo();
        student.belongsTo();


        System.out.println(teacher.getROLE());
        teacher.setSalary(4555);
        System.out.println(teacher.getSalary());

        System.out.println(student.getROLE());
        student.setScores(4.4);
        System.out.println(student.getScores());

    }
}
