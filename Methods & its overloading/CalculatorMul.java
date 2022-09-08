class CalculatorMul {
       String brandname;
       short price;
       char color;
       String type;
       boolean isSolarPower;

       CalculatorMul (String brandname,short price,char color,String type,boolean isSolarPower) {
       this.brandname = brandname;
       this.price = price;
       this.color = color;
       this.type = type;
       this.isSolarPower = isSolarPower;
     } 
     static int multiplication(int p, int k){
         int mul = p*k;
          return mul;
     }
     public static void main(String [] ar){
     int p = 675;
     int k = 128;
     int result = CalculatorMul. multiplication(p,k);
     System.out.println( result);

     int b = 22;
     int result1 =CalculatorMul. multiplication( result,b);
     System.out.println( result1);
   }
}
