class CalculatorAdd {
       String brandname;
       short price;
       char color;
       String type;
       boolean isSolarPower;

       CalculatorAdd (String brandname,short price,char color,String type,boolean isSolarPower) {
       this.brandname = brandname;
       this.price = price;
       this.color = color;
       this.type = type;
       this.isSolarPower = isSolarPower;
     } 
     static int addition(int p, int k){
         int sum = p+k;
          return sum;
     }
     public static void main(String [] ar){
     int p = 3620;
     int k = 1321;
     int result = Calculator.addition(p,k);
     System.out.println( result);

     int b = 220399;
     int result1 =CalculatorAdd.addition( result,b);
     System.out.println( result1);
   }
}
