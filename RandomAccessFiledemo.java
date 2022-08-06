/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFiledemo {
    public static void main(String[] args) {
        File f=new File("text.txt");
        try{
            RandomAccessFile rf=new RandomAccessFile(f, "w");
            rf.seek(3);
            int c; 
            while((c=rf.read())!=-1){
                System.out.println((char)c);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
