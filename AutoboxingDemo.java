/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

//Autoboxing and method
//1 marks question, if merged and asked then 5 marks
public class AutoboxingDemo {
    //autoboxing
    public static void test1(Integer a){
        System.out.println(a);
    }
    //unboxing
    public static void test2(int b){
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a=5;
        Integer b=6;
        test1(a);
        test2(b);
    }
}
