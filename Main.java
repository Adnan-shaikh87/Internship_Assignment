package com.company;
abstract class TestA{
    abstract void sum();
}
interface TestB{
    void display();
}

class TestC extends TestA implements TestB{
    @Override
    void sum(){
        int a = 10, b = 20;
        int add = a+b;
        System.out.println(add);
    }

    @Override
    public void display() {
        System.out.println("Second Display Method");
    }
}
public class Main {

    public static void main(String[] args) {
	    TestC T = new TestC();
        T.display();
        T.sum();
    }
}
