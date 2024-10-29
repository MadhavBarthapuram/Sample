package day_3;

public class Functions_Even_Odd_Lastdigit {
	
	public static int isEven(int a) {
		if(a%2==0)
			return 2;
		else
			return 1;
	}
	public static int isodd(int a) {
		if(a%2==0)
			return 2;
		else
			return 1;
	}
	public static int LastDigit(int a) {
		int num=Math.abs(a);
		int rem=num%10;
		return rem;
	}
	
	public static void main(String[] args) {
		System.out.println(isEven(4));
		System.out.println(isodd(3));
		System.out.println(LastDigit(14325));
	}
}
