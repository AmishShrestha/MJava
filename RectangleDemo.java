/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

class Rectangle{
    double l,b;
    double getArea(){
        return l*b;
    }
        double setDim(double l, double b){
        this.l=l;
        this.b=b;
        return l*b;
        }  
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.l=2;
        r.b=2;
        System.out.println(r.getArea());
        System.out.println(r.setDim(5,10));
    }
}
