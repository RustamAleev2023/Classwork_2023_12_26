package task4;

import task3.BankAccount;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void info(){
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public void delete(Student student){
        if(students.contains(student)){
            students.remove(student);
        } else {
            System.out.println("Такого студента не существует");
        }
    }

    public void update(Student student, double average){
        student.setAverage(average);
    }

    public void getMaxAverage(){
       double maxAverage = 0;
       int index = 0;
        for (Student student : students) {
            if(student.getAverage() > maxAverage){
                maxAverage = student.getAverage();
                index = students.indexOf(student);
            }
        }
        System.out.println(students.get(index));
    }

}
