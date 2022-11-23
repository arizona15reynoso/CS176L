import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;
/**
   This program demonstrates how an action listener can be used to trigger 
   a variable from a surrounding block.
*/
public class MeasurableViewer
{

	   private static final int FRAME_WIDTH = 240;
	   private static final int FRAME_HEIGHT = 160;

	   public static void main(String[] args)
	   {
		   Scanner in = new Scanner(System.in);
		   
		   //create bank accounts
		   Measurable[] accounts = new Measurable[3];
		   accounts[0] = new BankAccount(176220);
		   accounts[1] = new BankAccount(513120);
		   accounts[2] = new BankAccount(30510);
	   
		   //create countries
		   Measurable[] countries = new Measurable[3];
		   countries[0] = new Country("Uruguay", 176220);
		   countries[1] = new Country("Thailand", 513120);
		   countries[2] = new Country("Belgium", 30510);	      
		      
		   //create quizzes
		   Measurable[] quizzes = new Measurable[5];
		   quizzes[0] = new Quiz("Joe", 95);
		   quizzes[1] = new Quiz("Sally",80);
		   quizzes[2] = new Quiz("Jane",90);
		   quizzes[3] = new Quiz("Billy",50);
		   quizzes[4] = new Quiz("Sue",75);  
		      
		   
		   //entered int correlating to max,min,avg
		   int whichMetric = 1;
		   //String for the name of each metric
		   String metricToUse = "placeholder";
		   
		   //while the metric isn't 0 (sentinel value)
		   while(whichMetric==1 || whichMetric==2 || whichMetric==3)
		   {
			   System.out.print("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average, 0 to end: ");
			   whichMetric = in.nextInt();
			   
			   //check validity of entered int
			   while(whichMetric!=1 && whichMetric!=2 && whichMetric!=3 && whichMetric!=0)
			   {
				   System.out.print("Please enter a valid option: 1 for maximum, 2 for minimum, 3 for average, 0 to end: ");
				   whichMetric = in.nextInt();
			   }
			   
			   //set metricToUse string to correct name of metric
			   if (whichMetric == 1)
			   {metricToUse = "Maximum";}
			   if (whichMetric == 2)
			   {metricToUse = "Minimum";}
			   if (whichMetric == 3)
			   {metricToUse = "Average";}
			   
			   //if the user didn't enter to close, open the JFrame
			   if(whichMetric != 0)
			   { 
				  //Create frame and panel where buttons will be shown      
				  JPanel panel = new JPanel();
				  JFrame frame = new JFrame();
				  frame.add(panel);
			      
				  //Create button and listener for BankAccount      
			      JButton button = new JButton("Get " + metricToUse + " Balance");
			      panel.add(button);
			      ActionListener listener = new ButtonListener(accounts,metricToUse);
			      button.addActionListener(listener);

			      //Create button and listener for Country      
			      JButton button2 = new JButton("Get " + metricToUse + " Area");
			      panel.add(button2);
			      ActionListener listener2 = new ButtonListener(countries,metricToUse);
			      button2.addActionListener(listener2);
				      
			      //Create button and listener for Quiz      
			      JButton button3 = new JButton("Get " + metricToUse + " Score");
			      panel.add(button3);
			      ActionListener listener3 = new ButtonListener(quizzes,metricToUse);
			      button3.addActionListener(listener3);

			      //Now display frame with buttons      
			      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
			      frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			      frame.setVisible(true);
			      frame.setAlwaysOnTop(true);
			      

			      while(frame.isShowing())
			      {
			    	  /**
			    		This loop stops the outside loop from advancing
			    		and asking the user for a new choice / window
			    		until the current window is closed
			    	  **/
			      }
			      
			   }
		   }
		   
	      System.out.println("Program ended.");
	      in.close();
	      System.exit(0);;
	   }
	}