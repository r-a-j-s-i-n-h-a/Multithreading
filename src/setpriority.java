package com.multithreading;
class child1 extends Thread{
    public void run(){
        System.out.println("child1 thread with norm priority");
    }
}
class child2 extends Thread{
    public void run(){
        System.out.println("child2 thread with max priority");

    }
}
class child3 extends Thread{
    public void run(){
        System.out.println("child3 thread with min priority");
    }
}


public class threadpriorities {
    public static void main(String[] args) {
        System.out.println(" The priority of main method is :"+Thread.currentThread().getPriority());
        // by default the priority of main thread is 5

        child1 obj1 = new child1();
        obj1.setPriority(Thread.NORM_PRIORITY); // sets the priority of child1 as maximum = 10
        obj1.start();



        child2 obj2 = new child2();
       obj2.setPriority(Thread.MAX_PRIORITY); // sets the priority of child2 as norm = 5
        obj2.start();

        child3 obj3 = new child3();
       obj3.setPriority(Thread.MIN_PRIORITY); // sets the priority of child 3 as min = 1
        obj3.start();




    }
}
