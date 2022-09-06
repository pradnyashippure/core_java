class SumEven{
       public static void main(String []ar){
       byte [] b = {5,30,69,87,20,72,54,33};
       int se = 0;

       System.out.println("size of array:"+b.length);

       for(byte i = 0; i < b.length; i++){
           if(b[i] % 2 == 0){
                se = se + b[i];
           
           }
         }
       System.out.println("sum of even no:"+ se);
     }
}
