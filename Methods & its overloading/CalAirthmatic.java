class CalAirthmatic {
       String brandname;
       short price;
       char color;
       String type;
       boolean isSolarPower;

       CalAirthmatic (String brandname,short price,char color,String type,boolean isSolarPower){
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
     static double add( double s,int t){
          double sum1 = s+t;
          return sum1;
     }
     static int substraction(int p, int k){
          int sub = p-k;
          return sub;
     }
     static double subtract( double d,int w){
          double sub1 = d-w;
          return sub1;
     }
      static int multiplication(int c, int j){
          int mul = c*j;
          return mul;
     } 
     static double multiply( double x,int z){
          double mul1 = x*z;
          return mul1;
     }

      static int division(int f, int m){
          int div = f/m;
          return div;
     } 
     static double divide( double o,int u){
          double div1 = o/u;
          return div1;
     }
     public static void main(String [] ar){
     int a = 36;
     int b = 21;
     int result = CalAirthmatic.addition(a,b);
     System.out.println( "sum of a & b is:"+result);
     int e = 58;
     int result1 = CalAirthmatic.addition(result,e);
     System.out.println("sum of a b & e is:"+ result1);
     double s= 78.91d;
     int t = 42;
     double  result2 = CalAirthmatic.add(s,t);
     System.out.println("sum of s & t is:"+result2);

     int p =589;
     int k =324;
     int result3 = CalAirthmatic.substraction(p,k);
     System.out.println("substraction of p & k is:"+result3);
     int v = 100;
     int result4 =CalAirthmatic.substraction(result3,v);
     System.out.println( "substraction of p k & v is:"+result4);
     double d= 8.1d;
     int w = 56;
     double  result5 = CalAirthmatic.subtract(d,w);
     System.out.println("subtraction of d & w is:"+result5);

     int c =89;
     int j =34;
     int result6 =CalAirthmatic.multiplication(c,j);
     System.out.println("multiplication of c& j is:"+result6);
     int g =15 ;
     int result7 = CalAirthmatic.multiplication(result6,g);
     System.out.println("multiplication of c j & g is:"+ result7);
     double x= 56.01d;
     int z = 65;
     double  result8 =CalAirthmatic.multiply(x,z);
     System.out.println("multiplication of x & z is:"+result8);

     int f =6000;
     int m =30;
     int result9 = CalAirthmatic.division(f,m);
     System.out.println("division of f & m is:"+ result9);
     int n = 28;
     int result10 =CalAirthmatic.division(result9,n);
     System.out.println( "division of f m & n is:"+result10);
     double o= 88.00d;
     int u = 11;
     double  result11 = CalAirthmatic.divide(o,u);
     System.out.println("division of o & u is:"+result11);
 }
}
