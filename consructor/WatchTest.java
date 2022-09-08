class WatchTest {
        public static void main(String []args){

         short p = 5009;
        Watch watch= new Watch ("Titan","wristwatch",'G',p);
         System.out.println(watch);
         System.out.println(watch.brandname+"\t"+watch.type+"\t"+watch.color+"\t"+watch.price);
    }
}