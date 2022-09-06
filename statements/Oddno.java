class OddNumber {
       public static void main(String []ar){
       byte [] rollno = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
       System.out.println("size of array"+rollno.length);

       for(byte num = 0; num < rollno.length; num++){
           if(rollno [num] % 2 == 1){
           System.out.println(rollno [num] +"is odd number");
           }
         }
     }
}
