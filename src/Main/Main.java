package Main;

import model.Student;

public class Main {

    public static void main(String[] args){
        Student newStudent = new Student("DummyWong", 22, "M", 123456);
        System.out.println(newStudent.getNames());
        System.out.println(newStudent.getAge());
        System.out.println(newStudent.getGender());
        System.out.println(newStudent.getId());
    }



}
