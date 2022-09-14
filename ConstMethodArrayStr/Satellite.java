class Satellite {
     String Name;
     short weight;
     String type;
     short Year;
     String [] features;

 Satellite( String Name){
           this.Name = Name;
 }
   
   Satellite( String Name,short weight,short Year, String [] features){
   
     this.Name = Name;
     this.weight =weight;
     this.Year = Year;
     this.features = features;
 }

      void print() {
       System.out.println(Name+"\t"+weight+"\t"+ Year+"\t"+features);
       if (features != null) {
       for(int i = 0; i< features.length;i++){
          System.out.println(features [i] );
      }
    }
  
 }
}