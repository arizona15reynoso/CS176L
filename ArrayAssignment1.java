
public class ArrayAssignment1{
		  public static void main(String[] args) {
		     
		     double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		     int numNegative = 0;
		     double greatest = values[0];
		     for (int i = 0; i< values.length; i++) {
		       System.out.print(values[i]+" ");
		       if(values[i]<0){
		       numNegative++;
		       }
		       if(values[i]>greatest){
		       greatest = values[i];
		       }
		     }
		     System.out.println();
		     System.out.println("The largest element in the array is " + greatest);
		     System.out.println("There are " + numNegative + "negative numbers in the array");
		  }
}
		     