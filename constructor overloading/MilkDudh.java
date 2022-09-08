class MilkDudh {
       String brandname ;
       String type ;
       char color;
       byte quantity;
       short price;

         MilkDudh(String bname, String t, char c, byte q ) {
	       System.out.println("creating object");
               brandname =  bname;
               type = t;
               color = c;
               quantity = q;
               System.out.println("object created");
     }
MilkDudh (String bname, String t,short p) {
	       
               brandname =  bname;
               type = t;
               price = p;
      }
}