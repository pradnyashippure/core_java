class CalculatorSub {
       String brandname;
       short price;
       char color;
       String type;
       boolean isSolarPower;

       CalculatorSub(String brandname,short price,char color,String type,boolean isSolarPower) {
       this.brandname = brandname;
       this.price = price;
       this.color = color;
       this.type = type;
       this.isSolarPower = isSolarPower;
     } 
     static int substraction(int p, int k){
         int sub = p-k;
          return sub;
     }
     public static void main(String [] ar){
     int p = 5690234;
     int k = 13219;
     int result = CalculatorSub.substraction(p,k);
     System.out.println( result);

     int b = 4532;
     int result1 =CalculatorSub.substraction( result,b);
     System.out.println( result1);
   }
}
