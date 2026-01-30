package Core;

class Student{
    private int id;
    private String name;
    private String course;

    public Student() {
        super();
        System.out.println("Default Constructor Called");
    }

    public Student(int id){
        this.id = id;
        System.out.println("Single Parameterized Constructor Called");
    }

    Student(int id, String name, String course){
        this();
        this.id = id;
        this.name = name;
        this.course = course;
        System.out.println("Multi Parameterized Constructor Called");
    }

    void display(){
        System.out.println("Student ID: " + this.id + "\nStudent Name: " + this.name + "\nCourse: " + this.course);
    }
};

public class Oops4Cons {
    public static void main(String[] args) {
        Student s = new Student(1, "John", "Computer Science");
        s.display();
    }
}
