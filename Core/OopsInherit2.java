package Core;

class College{
    int val;
    public College() {
        this.val = 1;
        System.out.println("College cons called!");
    }

    void show(){
        System.out.println("College val= "+this.val);
    }
    
}

class Student extends College{
    int val;
    public Student() {
        this.val = 2;
        // super();
        System.out.println("Student cons called!");
    }

    void show(){
        System.out.println("Student val= "+val);
    }
}

public class OopsInherit2 {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.val);
        st.show();
        
        College st1 = new Student();
        System.out.println(st1.val);
        st1.show();

        // variable depends on reference type and method depends on object type
        
    }
}
