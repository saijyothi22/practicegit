package assignment5;

public class Program2_printnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
int num=15487;
while(num>0)
{
	count++;
	num=num/10;
}
System.out.println(count);
}

}
