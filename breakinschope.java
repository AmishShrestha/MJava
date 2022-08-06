/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class breakinschope {
    
    public static void main(String[] args) {
        boolean a=true, b=true, c=true;
        A:
        {
            System.out.println("Hello from A");
            if(a){
                break A;
            }
            System.out.println("Hi from A");
            B:
            {
                System.out.println("Hello from B");
                if(c){
                    break A;
                }
                System.out.println("Hi from B");
                C:
                {
                    System.out.println("Hello from C");
                    if(c){
                        break B;
                    }
                }
                System.out.println("End of scope C");
            }
            System.out.println("End of scope B");
            
        }
        System.out.println("End of scope C");
    }
}
