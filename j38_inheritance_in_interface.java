interface interface1 {
    void math1();

    void math2();
}

interface interface2 extends interface1 {
    void math3();

    void math4();
}

class MySampleClass implements interface2 {
    public void math1() {
        System.out.println("math1");
    }

    public void math2() {
        System.out.println("math2");
    }

    public void math3() {
        System.out.println("math3");
    }

    public void math4() {
        System.out.println("math4");
    }

}

public class j38_inheritance_in_interface {
    public static void main(String[] args) {
        MySampleClass sc = new MySampleClass();
        sc.math1();
        sc.math2();
        sc.math3();
        sc.math4();

    }

}
