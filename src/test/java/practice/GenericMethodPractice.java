package practice;

public class GenericMethodPractice {

	public static void main(String[] args) {
		
		int sum=add(40,50);
		System.out.println(sum);
		int sum1=add(60,50);
		System.out.println(sum1);
	}
	public static int add(int a , int b)
	{
		int c=a+b;
		return c;
	}

}
