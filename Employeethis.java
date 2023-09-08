public class Employeethis {
    private String Ename;
    private int Eno;
    private double ESal;
    Employeethis(String Ename,int Eno,double ESal){
        this.Ename =Ename;
        this.Eno =Eno;
        this.ESal = ESal;
    }
   public static void main(String[]args){
    Employeethis emp =new Employeethis("john", 1, 5000);
    Employeethis emp1 = new Employeethis("john", 1, 5000);
    System.out.println(emp == emp1);
    System.out.println(emp.equals(emp1));
   }
}
