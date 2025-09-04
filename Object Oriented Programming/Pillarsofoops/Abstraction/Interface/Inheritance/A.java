package Inheritance;

interface A {
    void display();
}

interface B extends A {
    void print();
}

class C implements B {
    public void display() {
        System.out.println("HI DISPLAY");
    }

    public void print() {
        System.out.println("HI Print");
    }
}