package Core;
// withour static found in oopsinheritance2

class College {
    static int val;

    public College() {
        val = 1;
        System.out.println("College cons called!");
    }

    static void show() {
        System.out.println("College val= " + val);
    }

}

class Student extends College {

    public Student() {
        // super();
        System.out.println("Student cons called!");
    }

    static void show() {
        System.out.println("Student val= " + val);
    }
}

public class OopsInherit6 {
    public static void main(String[] args) {
        Student st = new Student();
        st.show();
        
        College st1 = new Student();
        st1.show();

        // static method depends on reference type
        
    }
}
