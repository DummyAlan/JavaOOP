package model;

public class Student {
    String names;
    int age;
    String gender;
    int id;


    public Student(String names, int age, String gender, int id){
        this.names = names;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public String getNames(){
        return this.names;
    }

    public void setNames(String names){
        this.names = names;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }





}
