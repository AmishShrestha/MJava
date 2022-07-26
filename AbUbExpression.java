/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

//Autoboxing and Unboxing Expression
//wrapper => primitive = unboxing
//primitive => warpper = autoboxing
public class AbUbExpression {
    public static void main(String[] args) {
        int a=10;//primitive
        Integer b=20;//warpper
        int c=a*b;
        Integer d=a/b;
        System.out.println(c);
        System.out.println(d);
        
        
        
        boolean p=true;
        Boolean q=p;
        boolean r=q;
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        
        char e='a';
        Character f=e;
        char g=f;
        System.out.println(g);
    }
}

//Homework:
//How unboxing and autoboxing helps to prevent errors?

//Method:-
//Float
//Integer
//Boolean