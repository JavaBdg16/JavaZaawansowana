package oop.polymorphism;

public class Main {

    public static void main(String[] args) {

        C c = new C();
        B b = new B();
        A a = new A();

        a.print();
        // A

        a = new B();
        a.print();
        // B

        a = new C();
        a.print();
        // C

        Parent obj = new Child();
        obj.eat();
    }
}
