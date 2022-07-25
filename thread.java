/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
class ThreadA extends Thread{
    int a;
    public void run(){
        for(int i=1;i<=50;i++){
            if(i%2==0)
                System.out.println("even "+i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}
class ThreadB extends Thread{

    public void run(){
        for(int i=1;i<=50;i++){
            if(i%2!=0)
                System.out.println("odd "+i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}
public class thread {
    public static void main(String args[]) {
        System.out.println("Start of program");
        ThreadA ta=new ThreadA();
        ThreadB tb=new ThreadB();
        ta.start();
        tb.start();
        System.out.println("End of program");
    }
    
}
