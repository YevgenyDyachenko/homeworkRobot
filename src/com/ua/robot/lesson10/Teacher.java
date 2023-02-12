package com.ua.robot.lesson10;

public class Teacher {
    private String teacherName;
    private String course;

    private int totalStudents;

    public Teacher() {
    }

    public Teacher(String teacherName, String course, int totalStudents) {
        this.teacherName = teacherName;
        this.course = course;
        this.totalStudents = totalStudents;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public Student rateStudent(Student student, double grade){
        student.setScore(grade);
        return student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", course='" + course + '\'' +
                ", totalStudents=" + totalStudents +
                '}';
    }
}
