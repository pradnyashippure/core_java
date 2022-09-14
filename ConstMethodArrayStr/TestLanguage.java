class TestLanguage{
public static void main(String[] args){

    Language pk = new Language("java");
        pk .print();

   String[] types ={"DDL DML DCL TCL DQL"};
    
    Language kb = new Language("SQL","Raymond Boyce","IBM",1970,"Oracle",types);
     kb.print();
 
   }
}