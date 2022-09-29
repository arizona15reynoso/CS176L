
public class Microwave {
	public int time;
		
	public int power;
	
	public Microwave()
	{
		power = 1;
		time = 0;
	}

	public void increaseTime()
	{
	time +=30;
	System.out.println("Time Button was presssed. Time is " + time + " seconds");
	}
	public void switchPower()
	{
	if(power == 2)
		power = 1;
	if(power == 1)
		power =2;
	System.out.println("Power Button was presssed. Power level is " + power);
	}
	public void reset()
	{
	 power = 1;
	 time = 0;
	 System.out.println("Reset Button was pressed. Power level is 1. Time is 0 seconds.");
	}
	public void start()
	{
	System.out.println("Cooking for " + time + " seconds at level " + power);
	}
	

}
