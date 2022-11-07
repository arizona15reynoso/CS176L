
public class Student extends Person {

		private String major;
		
		public Student(String n, int by, String m)
		{
			super(n, by);
			major = m;
		}

	   public String toString()
	   {
	      return "Student[super=" + super.toString() + ",major=" + major + "]";
	   }
	}