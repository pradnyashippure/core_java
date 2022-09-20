import java.util.Scanner;
class Primeno {

	public static void main (String[] args){
	Scanner p = new Scanner (System.in);
	int num, count=0;
	System.out.println ("enter number");
	num=p.nextInt();
	for (int i=1;i<num;i++){
	
	count=0;
	for (int k=1; k<=i;k++){
	if (i%k==0)
	count++;
	}
	if(count==2)

	System.out.print(i+" ");
	
	}
     }
} 