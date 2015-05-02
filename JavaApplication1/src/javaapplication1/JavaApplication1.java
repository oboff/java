/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.math.*;

/**
 *
 * Hello World application
 */
class FooRunnable implements Runnable {
    public void run() {
        for (int x = 0; x<10; x++) {
            System.out.println(Thread.currentThread().getName() + " running. x is " + x + ".");
        }
    }
}

public class JavaApplication1 {

    public void sayGoodbyeInEnglish() {
        class EnglishGoodbye {
            public static final String farewell = "Bye bye";
            public void sayGoodbye() {
                System.out.println(farewell);
            }
        }
        EnglishGoodbye myEnglishGoodbye = new EnglishGoodbye();
        myEnglishGoodbye.sayGoodbye();
    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int i = 0;
//        for (String a: args) {
//            System.out.println("arg" + i + ": " + a);
//            i++;
//        }
//        
//        for (int j = 0; j < 10; j++) {
//            double x = Math.random()*10;
//            System.out.print(Math.round(x));
//            System.out.print(" " + x + " ");
//        }
        FooRunnable r = new FooRunnable();
        Thread t = new Thread(r);
        Thread s = new Thread(r);
        Thread u = new Thread(r);
        
        t.setName("Thomas");
        s.setName("Sam");
        u.setName("Ursula");
        
        t.start();
        s.start();
        u.start();
        
        JavaApplication1 yes = new JavaApplication1();
        yes.sayGoodbyeInEnglish();
    }
    
}


