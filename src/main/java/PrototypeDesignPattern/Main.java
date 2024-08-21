package PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("rajat",30,10774);
        Student copy = (Student) student.clone(); // DownCasting is necessary
        System.out.println(student.toString());
        System.out.println(copy.toString());
    }
}
