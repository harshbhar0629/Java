package Core;

class Student{
    int age, rollNo;
    String name;

    void setValue(int age, int rollNo){
        this.age = age;
        this.rollNo = rollNo;
    }

    void setValue(String name, int age){
        this.name = name;
        this.age = age;
    }

    void printValue(){
        System.out.println("Student Details");
        System.out.print("Name: ");
        System.out.println(this.name);
        System.out.print("Age: ");
        System.out.println(this.age);
        System.out.print("Rollno: ");
        System.out.println(this.rollNo);
    }
}

public class Oops2Method {
    public static void main(String[] args) {
        Student st = new Student();
        st.setValue(5, 3);
        st.setValue("Harsh", 20);
        st.printValue();
    }
}
