/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author dfz6
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
       // CreateTools.createFolder("Randa", "C:");
       //CreateTools.createFolder("Rannn");
       
       //CreateTools.openForm(new Frame1());
       
      // CreateTools.clearText(new Frame1());
      
      
      /*CreateTools.createEmptyFile("randa.txt");
      
      
      
      Object data []={12334 ,"786hgjhg", 8798, 898687956};
       CreateTools.createFile("randa.txt", data);
       
      */ 
       
      // CreateTools.inputBox("Enter Your Name : ");
      
      //String num=CreateTools.getNumberFromString("gjhg57w543534568gjh546758ghjgj90809");
      //CreateTools.msgBox(num);

      
      // String text=CreateTools.removeNumberFromString("gjhg57w567777777777uu09");
      //CreateTools.msgBox(text);

     // String [] filenames={"rr.txt","hh.txt","hu.txt"};
      //CreateTools.createEmptyFiles(filenames);
      
      
       String [] filenames={"rr.txt","hh.txt","hu.txt"};
       Object [][] data ={
           {"ghjgkjhgkjgkjh"},
           {"hgkjgkgkugkjhgkhj"},
           {"ugiugliughiu"}
       };
      CreateTools.createFiles(filenames, data);
    }
    
    
}
