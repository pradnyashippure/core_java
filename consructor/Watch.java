class Watch {
       String brandname ;
       String type ;
       char color;
       short price;

           Watch (String bname, String t, char c, short p) {
	       System.out.println("creating object");
               brandname =  bname;
               type = t;
               color = c;
               price = p;
               System.out.println("object created");
     }
 }