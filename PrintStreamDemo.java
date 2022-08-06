/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.io.PrintStream;

public class PrintStreamDemo {

    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("text.txt");
            ps.println("Hello guys from KIST");
            ps.print(2045);
            int a = 20;
            ps.printf("the no \nis %d", a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
