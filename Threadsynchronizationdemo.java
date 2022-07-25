/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
class Count{
    public static int c=0;
//    public static void increment(){
    public synchronized static void increment(){
        Count.c++;
    }
}

class ThB extends Thread{
    
    public void run(){
        for (int i=0; i<=100000; i++){
            Count.increment();
        }
    }
}
public class Threadsynchronizationdemo {
    public static void main(String[] args) {
        ThB ob=new ThB();
        ob.start();
        ThB ob1=new ThB();
        ob1.start();
        try {
            ob.join();
            ob1.join();
        }
        catch (Exception e){
//            System.out.println(a);
        }
        System.out.println(Count.c);
    }
}
