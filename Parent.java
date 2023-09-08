abstract  class CodesDope {
    abstract public  void message();{

    }    
}
class First extends CodesDope {
    public void message(){
        System.out.println("The First class extends the Codesdope ");
        
    }
}
class Second extends CodesDope{
    public void message(){
        System.out.println("THe Second class extends the Codesdope");
        
    }
}
public class Parent{
    public static  void  main (String[]args){
        First h = new First();
        Second j = new Second();
        h.message();
        j.message();
       
    }
}