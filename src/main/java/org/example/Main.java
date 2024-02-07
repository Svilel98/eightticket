package org.example;

public class Main {
    public static void main(String[] args) throws Throwable {
        Student student = new Student(null);
        Student student1 = new Student("Sergey");
        checkNameNull(student.getName());
        checkNameIvan(student1.getName());
    }
    public static void checkNameNull(String name){
        Student student = new Student(name);
        try {
            if (student.getName() == null);
        } catch (NullPointerException e){
            System.out.println("Укажите имя");
        }
    }
    public static void checkNameIvan(String name) throws CheckNameIvanError{
        Student student = new Student(name);
        if (student.getName() != "Ivan"){
            throw new CheckNameIvanError("Вы не Иван");
        }
    }
}
