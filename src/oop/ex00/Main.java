package oop.ex00;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
       // A a = new A();
        A b = new B();

    }
}


class A {
    public A A(A this) {
        ((B)this).test();
        return this;
    }

     A() {
        ((B)this).test();
    }
}

class B extends A {
    void test(){}
}