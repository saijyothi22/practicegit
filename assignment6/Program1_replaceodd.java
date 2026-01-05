package assignment6;

public class Program1_replaceodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=5678;
     int newNum=0;
     int count=0;
     while(num>0)
     {
    	 count++;
    	 int lastDigit=num%10;
    	 if (count==2)
    		 newNum=lastDigit*10+newNum;
    	 
    	 else if (count==4) 
    		newNum=lastDigit*1000+newNum; 
    	 count--;
     }
     System.out.println(newNum);
                           
	}

}
