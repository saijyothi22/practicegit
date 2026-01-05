package assignment6;

public class Program3_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=569;
       int sum=0;
       int temp=0;
       while(num!=0)
       {
         temp=num%10;
        sum=sum+temp;
        num=num/10;
       }
       System.out.println(sum);
	}

}

