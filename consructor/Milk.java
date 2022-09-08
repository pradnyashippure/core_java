class Milk {
       String brandname ;
       String type ;
       char color;
       byte quantity;

          Milk (String bname, String t, char c, byte q ) {
	       System.out.println("creating object");
               brandname =  bname;
               type = t;
               color = c;
               quantity = q;
               System.out.println("object created");
     }
 }