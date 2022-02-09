/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filehandeling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anas1
 */
public class FileHandeling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.println("working");
        File f = new File("anas.txt");
        try {
            f.createNewFile();
            FileWriter fw = new FileWriter("anas.txt");
            fw.write("this is my first file");
            fw.close();
            Scanner scanner=new Scanner(f);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());        
            }
        } catch (IOException ex) {
            Logger.getLogger(FileHandeling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
