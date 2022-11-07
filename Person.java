
public class Person{
	private String name;
	private int birthYear;
	
	public Person(String n, int by)
	{
		name = n;
		birthYear = by;
	}

   public String toString()
   {
      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
   }
}