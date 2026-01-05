package assignment6;

public class Program2_trailing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=1;
  int Originalnum=num;
  int countDigit=0;
  int result=0;
 while(num>0)
 {
	countDigit++;
	num=num/10;
	
	}
 if(countDigit==1)
 {
	 result=Originalnum*10;
 }
 else if(countDigit==2)
 {
	result=Originalnum*100; 
 }
 else
 {
	 result=Originalnum;
 }
 System.out.println(result);
	}
}
	
	 
 
  
  