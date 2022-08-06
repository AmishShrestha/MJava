/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
/*
imports java.io.File;

File Constructors:
File(String path)
File(String dirPath, String Name)
File(String dirObj, String Name)

File f1= new File("C:\\ABC);
*/
import java.io.File;
public class FileConstructor {
    public static void main(String[] args) {
        File f1=new File("C:\\ABC");
//        File f2=new File("C:\\ABC\\A.html");
//        File f3=new File("C:\\ABC","A.html");
//        File f4=new File(f1, "A.html");
        String[] list_f=f1.list();
        
        for(String s:list_f){
            System.out.println(s);
        }
        File f5=new File("C:\\ABC\\F");
//        if(!f5.exists()) {yo garyo bhane nahuda true auxa huda false
        if(!f5.exists()){//yo garda kheri opp
            f5.mkdir();
            
        }
        
        try{
            File f6=new File("C:\\ABC\\test.txt");
        if(!f6.exists()){
            f6.createNewFile();
        }
        }
        catch(Exception e){
            System.out.println(e);
    }
}
}
