package fall23;
/*student id:4516425
* student name:
* faculty name:
 */

public class Week5poly {

	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("the value of cis"+c);
		
	}
public void sum() {
	System.out.println("welcome");
}
	static void max(int num1, int num2) {
		int  result;
		if(num1>num2) {
			result=num1;
		}
		else {
			result=num2;
		}
		System.out.println("the result is"+result);
	}
	public static void main(String[] args) {
		max(10,20);
		Week5poly z=new Week5poly();
		z.sum(10,20);
		z.sum();
	}
	

}
