package Belajar.java.now.application;

import Belajar.java.now.data.HelloWord;

public class HelloWordApp {
    public static void main(String[] args) {

        HelloWord english = new HelloWord() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello "+ name);
            }
        };

        english.sayHello();
        english.sayHello("Eko");

    }
}
