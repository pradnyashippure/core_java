class MilkD {
       String brandname ;
       String type ;
       char color;
       byte quantity;
       short price;

         MilkD(String bname, String t, char c, byte q ) {
	       System.out.println("creating object");
               brandname =  bname;
               type = t;
               color = c;
               quantity = q;
               System.out.println("object created");
     }
    MilkD (String bname, String t,short p) {
	       
               brandname =  bname;
               type = t;
               price = p;
      }
      public static void main(String []args){
          
          byte q = 1;
         MilkD milkd = new MilkD("Nandini","cow",'W',q);
         System.out.println( milkd);
         System.out.println( milkd.brandname+"\t"+ milkd.type+"\t"+ milkd.color+"\t"+ milkd.quantity);

         short p = 60;
         MilkD milkd1 = new MilkD ("Amul","buffalow",p);
         System.out.println( milkd1);
         System.out.println( milkd1.brandname+"\t"+ milkd1.type+"\t"+ milkd1.price);
    }
   
}