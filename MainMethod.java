 class Static {
    static int i ;
    int j;

static {
    i = 10;
    System.out.println("Static Block is called");

}
Static(){
    System.out.println("Instance block");
}
}
public class MainMethod {
    public static void main (String[]args){
        Static t = new Static();
        Static t1 = new Static();

    }
}