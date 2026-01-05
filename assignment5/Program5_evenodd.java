package assignment5;

public class Program5_evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=23;
  int evenCount=0;
  int oddCount=0;
  while(num>0)
  {
	  int lastDigit=num%10;
	  if(lastDigit%2==0)
	  evenCount++;
	  else
		  oddCount++;
	  num=num/10;
  }
  System.out.println("EVEN:"+evenCount);
  System.out.println("ODD:"+oddCount);
	}

}
