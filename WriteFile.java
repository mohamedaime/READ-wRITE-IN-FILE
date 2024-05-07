/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.readfile;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
public class WriteFile {

  public static void main(String[] args) {
      String data="",data3="";
      ReadFile myObj = new ReadFile();
    try {
   data3 =myObj.Read();
      System.out.println("data 3 ="+data3);
      //create a object to create a new file
      File myObj2 = new File("C:\\Users\\HP_PC\\Desktop\\write.txt");
      //createNewFile() This method returns a boolean value: true if the file was successfully created
      if (myObj2.createNewFile()) {
        System.out.println("File created: " + myObj2.getName());
      } else {
        System.out.println("File already exists.");
      }
      //create an object to write data in the file
      FileWriter myWriter = new FileWriter("C:\\Users\\HP_PC\\Desktop\\write.txt");
      //write() method to write text stored in data3 to the file we created
     myWriter.write(data3);
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
    
  }
}

