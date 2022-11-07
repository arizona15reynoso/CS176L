
public class Instructor extends Person{

	private double salary;
	
	public Instructor(String n, int by, double s)
	{
		super(n, by);
		salary = s;
	}

 
   public String toString()
   {
      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
   }
}