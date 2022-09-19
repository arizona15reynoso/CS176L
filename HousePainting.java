import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//Get all inputs
	System.out.print("Please enter the cost per square foot: ");
	double costPerSquareFoot = sc.nextDouble();
	System.out.print("Please enter the length of the house: ");
	double houseLength = sc.nextDouble();
	System.out.print("Please enter the width of the house: ");
	double houseWidth = sc.nextDouble();
	System.out.print("Please enter the height of the house: ");
	double houseHeight = sc.nextDouble();
	System.out.print("Please enter the number of windows: ");
	double windowAmount = sc.nextDouble();
	System.out.print("Please enter the length of a window: ");
	double windowHeight = sc.nextDouble();
	System.out.print("Please enter the width of a window: ");
	double windowWidth = sc.nextDouble();
	System.out.print("Please enter the number of doors: ");
	double doorAmount = sc.nextDouble();
	System.out.print("Please enter the length of a door: ");
	double doorHeight = sc.nextDouble();
	System.out.print("Please enter the width of a door: ");
	double doorWidth = sc.nextDouble();
	
	//Do calculations
	double sqFtToPaint = (2*(houseLength * houseWidth) + 2*(houseLength * houseWidth + 0.5 * (houseLength *(houseHeight - houseWidth))))-((windowAmount*windowHeight*windowWidth)+(doorAmount*doorHeight*doorWidth));
	double costToPaint = (sqFtToPaint * costPerSquareFoot);
	
	//Output results
	System.out.printf("Your total paintable surface area is " + sqFtToPaint + " square feet.");
	System.out.printf("\nYour estimate is " + costToPaint + " dollars.");

	}

}
