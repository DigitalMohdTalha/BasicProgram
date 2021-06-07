package basic;
public class Armstrong {
	public static void main(String[] args) {
		 int n=153, c=0, rem, temp; 
		    temp = n;  
		    while(n>0)  
		    {  
		    rem=n%10;  
		    c=c+(rem*rem*rem);  
		    n=n/10;  
			    }  
		    if(temp==c)  
		    System.out.println("armstrong number" + temp);   
		    else  
		        System.out.println("Not armstrong number" + temp);   
		   }  
		}  