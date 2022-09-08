class BookSci {
       String subject ;
       char covercolor;
       byte noofpages;
       short price;

         BookSci(String sub,char col, byte nop,short p ) {
	       System.out.println("creating object");
               subject =  sub;
               covercolor= col;
               noofpages= nop;
               price = p;
               System.out.println("object created");
     }
BookSci (String sub,short p) {
	      System.out.println("creating object");
               subject = sub;
               price = p;
              System.out.println("object created");
      }
      BookSci (String sub, char col,byte nop) {
	       System.out.println("creating object");
               subject = sub;
               covercolor = col;
               noofpages =nop;
              System.out.println("object created");
      }
public static void main(String []args){
          
          byte nop = 100;
          short p = 90;
         BookSci book = new BookSci("Biology",'G',nop,p);
         System.out.println( book);
         System.out.println( book.subject+"\t"+ book.covercolor+"\t"+ book.noofpages+"\t"+ book.price);

         BookSci book1 = new BookSci ("Mathematics",p);
         System.out.println( book1);
         System.out.println( book1.subject+"\t"+book1.price);

       BookSci book2 = new BookSci("controlsystem",'P',nop);
       System.out.println( book2);
       System.out.println( book2.subject+"\t"+book2.covercolor+"\t"+book2.noofpages);
       }
   
}