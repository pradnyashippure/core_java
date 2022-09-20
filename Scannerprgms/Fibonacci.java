import java.util.Scanner;
class Fibonacci {

	public static void main (String[] args){
	Scanner pk = new Scanner (System.in);
	int a=0,b=1, c=0,no;
	System.out.println ("enter a value");
	no=pk.nextInt();
	for (int k=1;k<no;k++){
	System.out.print(c+" ");
	a=b;
	b=c;
	c=a+b;
	}
     }
} 