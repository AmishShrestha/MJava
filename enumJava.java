/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

/*enum in JAVA
- save the purpose of representing a group of named constants
- E.g: the 4 suits in a deck of playing cards may be 4 enumerators called: club, diamond, heart and
        spade, belongs to and enumerated type named suit
- enum decleration can be done inside or outside the class
*/

import java.util.Scanner;
//enum gender {
////    int a; mathi rakhda mildeina
//    MALE, FEMALE, OTHER;
////    ";" when we add sth below this ^
//    int a;
//}

enum Season{
    SPRING(1), SUMMER(2), AUTUMN(3), WINTER(4);
    private int SeasonId;
    public int getSeasonId(){
        return SeasonId;
    }
    Season(int id){
        this.SeasonId=id;
        
    }
}
        


public class enumJava {

    public static void main(String[] args) {
//        for (gender g : gender.values()) {
//            System.out.println(g);
//        }
        Scanner sc= new Scanner(System.in);
        System.out.println(Season.valueOf("WINTER"));
        System.out.println(Season.WINTER.getSeasonId());
        
        for(Season s:Season.values()){
            switch (s){
                case WINTER: {
                    System.out.println("It's cold in " + s + " season.");
                    break;
                }
                case SUMMER: {
                    System.out.println("Why would it rain in " + s + " season?");
                    break;
                }
                default: {
                    System.out.println("I don't know about " + s + " season.");
                    break;
                }
            }
            
        }
        System.out.println(Season.WINTER.ordinal());//ordinal() postion of oj=bject
        System.out.println(Season.AUTUMN.name());
    }
}


