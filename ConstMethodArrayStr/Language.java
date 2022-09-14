class Language {
     String name;
     String father;
     int year;
     String developedby;
     String   adopt;
     String [] types;
     
     Language(String name){
     this.name=name;
    }

    Language(String name,String father,String developedby,int year,String adopt,String [] types){
     this.name=name;
     this.father=father;
     this.developedby=developedby;
     this.year=year;
     this.adopt=adopt;
     this.types=types;
     
}

       void print(){
       System.out.println(name+"\t"+father+"\t"+ developedby+"\t"+year+"\t"+adopt+"\t"+ types);
       if(types !=null){
       for (int i=0;i<types.length;i++){
       System.out.print(types[i]);
       }
     }
  }
}