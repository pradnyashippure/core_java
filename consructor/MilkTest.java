class  MilkTest {
        public static void main(String []args){
          
          byte q = 1;
          Milk milk = new Milk ("Nandini","cow",'W',q);
         System.out.println(milk);
         System.out.println(milk.brandname+"\t"+milk.type+"\t"+milk.color+"\t"+milk.quantity);
    }
}