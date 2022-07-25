/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

public class logicaloperators {
//Perform operation between two boolean operands
//&, &&, |, ||
    public static void main(String[] args){
        //relational operator tala ko
//        int a=10;
//        int b=20;
//        boolean c=a>b;
//        System.out.println(c);
        boolean b=true;
        boolean c=false;
        boolean d=b&c;
        boolean e=b&&c;
        boolean f=b|c;
        boolean g=b||c;
        boolean h=!b;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        int a1=2;
        int a2=3;
        int a3=5;
//        boolean i=(a1>a2 && a1++ < a3);
//        boolean i=((a1<a2) && (a1++ <a3));
//        boolean i=((a1<a2) & (a1++ <a3));
        boolean i=((a1>a2) & (a1++ <a3));
        System.out.println(a1);
//        System.out.println(i);
    }
}
