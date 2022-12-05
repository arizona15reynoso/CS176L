import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.PrintWriter;
 import java.util.Scanner;

 /**
    Used to test the BlankLinesRemover class.
 */
 public class InputOutputFiles
 {
    public static void main(String[] args) throws FileNotFoundException
    {
     		  
     		  Scanner out = new Scanner(System.in);
         	  System.out.println("Please enter the path to open the input file for example " + "C:\\Downloads\\lines.txt : ");
         	  String lines = out.next();
         	  File inputFile = new File(lines);
              PrintWriter outputFile = new PrintWriter("outlines.txt");
              
     try {
              Scanner in = new Scanner(inputFile);
              while (in.hasNext()) {
              String what = in.next();
              outputFile.println(what);
              }
              in.close();
              System.out.println("Input file found");
           }

           catch(FileNotFoundException invalid)
           {
         	  System.out.println("File is not found, please try again");
           }
     outputFile.close();
     out.close();
       }
  
    }
