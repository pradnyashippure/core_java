class  MilkDudhTest {
        public static void main(String []args){
          
          byte q = 1;
         MilkDudh milkdudh = new MilkDudh("Nandini","cow",'W',q);
         System.out.println( milkdudh);
         System.out.println( milkdudh.brandname+"\t"+ milkdudh.type+"\t"+ milkdudh.color+"\t"+ milkdudh.quantity);

         short p = 60;
        MilkDudh milkdudh1 = new MilkDudh ("Amul","buffalow",p);
         System.out.println( milkdudh1);
         System.out.println( milkdudh1.brandname+"\t"+ milkdudh1.type+"\t"+ milkdudh1.price);
    }
   
            
}