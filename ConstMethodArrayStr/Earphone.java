class Earphone {
        String brandName;
        String modelName;
        String type;
        char color;
        short price;
        byte batteryLife;
        String design;
        String []features;
   
    Earphone(String brandName,String type,char color,short price){
    this.brandName = brandName;
    this.type = type;
    this.color = color;
    this.price = price;
   }
   void print (){                    
  System.out.println( brandName+"\t"+type+"\t"+color+"\t"+price);
  System.out.println();
  }
}