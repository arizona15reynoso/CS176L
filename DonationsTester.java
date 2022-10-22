import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DonationsTester {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to process donations now? (enter ‘Yes’ to continue): ");
		String answer = input.nextLine();
		if(answer.equals("Yes")) {
			Donations giveToMe = new Donations();
			Scanner inputFile = new Scanner(new File("Donations.txt"));
			while (inputFile.hasNextLine()) {
				String line = inputFile.nextLine();
				if (!line.equals("<EOF>")) {
					String[]fields = line.split(">");
					giveToMe.processDonation(fields[0],Double.parseDouble(fields[1]));
				}
			}
			giveToMe.getStatistics();
		}
		else {
			System.out.println("Ending now without processing donations");
		}
		
	}

}
