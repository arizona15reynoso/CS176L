import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Donations {
	private int numIndividual;
	private double amtIndividual;
	private int numBusiness;
	private double amtBusiness;
	private int numOther;
	private double amtOther;
	
	public void incrementNumIndividual(int amount) {
		numIndividual += amount ;
	}
	
	public void incrementNumBusiness(int amount) {
		numBusiness += amount ;
	}
	
	public void incrementNumOther(int amount) {
		numOther += amount ;
	}
	
	public void incrementAmtIndividual(double amount) {
		amtIndividual += amount ;
	}
	
	public void incrementAmtBusiness(double amount) {
		amtBusiness += amount ;
	}
	
	public void incrementAmtOther(double amount) {
		amtOther += amount ;
	}

	public int getNumIndividual() {
		return numIndividual;
	}

	public void setNumIndividual(int numIndividual) {
		this.numIndividual = numIndividual;
	}

	public double getAmtIndividual() {
		return amtIndividual;
	}

	public void setAmtIndividual(double amtIndividual) {
		this.amtIndividual = amtIndividual;
	}

	public int getNumBusiness() {
		return numBusiness;
	}

	public void setNumBusiness(int numBusiness) {
		this.numBusiness = numBusiness;
	}

	public double getAmtBusiness() {
		return amtBusiness;
	}

	public void setAmtBusiness(double amtBusiness) {
		this.amtBusiness = amtBusiness;
	}

	public int getNumOther() {
		return numOther;
	}

	public void setNumOther(int numOther) {
		this.numOther = numOther;
	}

	public double getAmtOther() {
		return amtOther;
	}

	public void setAmtOther(double amtOther) {
		this.amtOther = amtOther;
	}
	
	public void processDonation(String cat, double donation) {
		if (cat.startsWith("<individual")) {
			if (donation>0) {
				incrementNumIndividual(1);
			}
			else {
				incrementNumIndividual(-1);
			}
			incrementAmtIndividual(donation);
			System.out.println("Individual donation amount: " + donation); 
		}
		else if (cat.startsWith("<business")) {
			if (donation>0) {
				incrementNumBusiness(1);
			}
			else {
				incrementNumBusiness(-1);
			}
			incrementAmtBusiness(donation);
			System.out.println("Business donation amount: " + donation);
		}
		else if (cat.startsWith("<other")) {
			if (donation>0) {
				incrementNumOther(1);
			}
			else {
				incrementNumOther(-1);
			}
			incrementAmtOther(donation);
			System.out.println("Other donation amount: " + donation);
		}
	}
	public void getStatistics() {
		System.out.println("Individual: #:" + numIndividual + " $" + amtIndividual);
		System.out.println("Business: #:" + numBusiness + " $" + amtBusiness);
		System.out.println("Other: #:" + numOther + " $" + amtOther);
	}
	
}

