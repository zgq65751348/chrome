package com.google.chrome.tools.concurrent;


public class ThreadStop {


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (true){
               if(Thread.currentThread().isInterrupted()){
                   break;
               }
            }
        }, "t1");
        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
        System.out.println(t1.isInterrupted());
    }
}
