class CalculatorDiv {
       String brandname;
       short price;
       char color;
       String type;
       boolean isSolarPower;

       CalculatorDiv  (String brandname,short price,char color,String type,boolean isSolarPower) {
       this.brandname = brandname;
       this.price = price;
       this.color = color;
       this.type = type;
       this.isSolarPower = isSolarPower;
     } 
     static int division(int p, int k){
         int div = p/k;
          return div;
     }
     public static void main(String [] ar){
     int p =3456;
     int k = 12;
     int result = CalculatorDiv.division(p,k);
     System.out.println( result);

     int b = 20;
     int result1 =CalculatorDiv.division( result,b);
     System.out.println( result1);
   }
}
