class TestSatellite {
    public static void main(String [] ar){
       String s = new String (" INDIAN SATELLITE");
       System.out.println(s);
 
   Satellite aryabhtta = new Satellite ("ARYABHATTA");
    aryabhtta.print();

 String [] features = {" IRS-1A carries two cameras,LISS-I & LISS-II"};

 Satellite irs = new Satellite ("Indian remote sensing satellite-1A",(short)975,(short)1988, features);
  irs.print();

 
}
   }