/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
//package multithreading;

class TH1 extends Thread{
    public void run(){
        try {
            for(int i=0; i<=10; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        TH1 t=new TH1();
        t.start();
        try {
            for(int i=0; i<=10; i++){
//                System.out.println(5 * i);
//                if(i==5){
//                    t.join();
//                    System.out.println(t.isAlive());
//                }
                    int a = 5 * i;
                    System.out.println(a);
                    if(a==25){
                    t.join();
                    System.out.println(t.isAlive());
                }
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
