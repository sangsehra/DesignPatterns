package PrototypeDesignPattern;


public class Student implements Prototype{
    String name;
    int age;
    private int rollNo;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                '}';
    }
    Student(){

    }

    Student(String name, int age, int rollNo){
        this.age=age;
        this.name=name;
        this.rollNo=rollNo;
    }


    @Override
    public Prototype clone() {
        return new Student(this.name,this.age,this.rollNo);
    }
}
