/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDemo {

    public static void main(String[] args) {
//        File f1=new File("A.txt");
//        File f2=new File("B.txt");
        try {
//            FileWriter fw=new FileWriter("text.txt");
//            fw.write("Hello guys!");
//            fw.write('Z');
//            fw.close();
            FileReader fr = new FileReader("text.txt");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
            fr.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
