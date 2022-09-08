class CalculatorOperate {
       String brandname;
       short price;
       char color;
       String type;
       boolean isSolarPower;

       CalculatorOperate (String brandname,short price,char color,String type,boolean isSolarPower){
       this.brandname = brandname;
       this.price = price;
       this.color = color;
       this.type = type;
       this.isSolarPower = isSolarPower;
     } 
     static int addition(int a, int b){
          int sum = a+b;
          return sum;
     }
     static int substraction(int p, int k){
          int sub = p-k;
          return sub;
     }
      static int multiplication(int c, int j){
          int mul = c*j;
          return mul;
     }
      static int addition(int f, int m){
          int div = f/m;
          return div;
     }
     public static void main(String [] ar){
     int a = 36;
     int b = 21;
     int result = CalculatorOperate.addition(a,b);
     System.out.println( result);
     int e = 58;
     int result1 = CalculatorOperate.addition(result,e);
     System.out.println( result1);

     int p =589;
     int k =324;
     int result2 = CalculatorOperate.substraction(p,k);
     System.out.println( result2);
     int v = 100;
     int result3 = CalculatorOperate.substraction(result2,v);
     System.out.println( result3);

     int c =89;
     int j =34;
     int result4 = CalculatorOperate.multiplication(c,j);
     System.out.println( result4);
     int g =15 ;
     int result5 = CalculatorOperate.multiplication(result4,g);
     System.out.println( result5);

     
     int f =6000;
     int m =30;
     int result6 = CalculatorOperate.division(f,m);
     System.out.println( result6);
     int n = 28;
     int result7 =CalculatorOperat.division(result6,n);
     System.out.println( result7);
 }
}
