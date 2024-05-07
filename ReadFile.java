/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.readfile;

/**
 *
 * @author HP_PC
 */
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;// Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class ReadFile {
    //load a file
   File myObj = new File("C:\\Users\\HP_PC\\Desktop\\read.txt");
   public  String Read() throws FileNotFoundException{
       //creat object to scan a file
      Scanner myReader = new Scanner(myObj);
      String temp_data = "",data = "";
      //loop to store content of myReadear in data will there is character in a myReader
      while (myReader.hasNextLine()==true) {
          temp_data = myReader.nextLine()+'\n';
          data += temp_data;
      }
       myReader.close();
       return data;
}  
}