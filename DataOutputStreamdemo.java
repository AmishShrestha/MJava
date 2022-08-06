/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
public class DataOutputStreamdemo {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("text.txt");
            DataOutputStream dos=new DataOutputStream(fos);
            dos.writeInt(29);
            dos.writeLong(67);
            dos.flush();
            dos.close();
            
            FileInputStream fis=new FileInputStream("text.txt");
            
            DataInputStream dis=new DataInputStream(fis);
            int a=dis.readInt();
            long b=dis.readLong();
            System.out.println(a);
            System.out.println(b);
//            char c=dis.readChar();
//            System.out.println((int)c);
            dis.close();
        }
        catch(Exception e){
            
        }
    }
}
