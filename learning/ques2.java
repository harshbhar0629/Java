interface A {
    int add(int a, int b);
}

interface B {
    int sub(int a, int b);
}

class C implements A, B {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }
}

public class ques2 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.add(3, 1));
        System.out.println(c.sub(3, 1));
        System.out.println(c.mul(3, 1));
    }
}
