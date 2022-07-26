/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class WrapperClass {
    public static void main(String[] args) {
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isWhitespace('A'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.toUpperCase('A'));
        System.out.println(Character.toUpperCase('a'));//Changes lowercase to uppercase.
        System.out.println(Character.toLowerCase('A'));//Changes uppercase to lowercase.
        System.out.println(Character.toLowerCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('a'));
        
        char c=Character.toUpperCase('c');
        System.out.println(c);
    }
}
