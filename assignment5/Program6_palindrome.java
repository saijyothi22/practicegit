package assignment5;

public class Program6_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1221;
		int originalNum=num;
		 System.out.println(num);
		   int reverse=0;
		   while(num>0)
		   {
			int lastDigit=num%10;
			reverse=reverse*10+lastDigit;
			System.out.println(reverse);
			num=num/10;

		   }
		   if(originalNum==reverse);
		   System.out.println("palindrome");
			}

		

	}


