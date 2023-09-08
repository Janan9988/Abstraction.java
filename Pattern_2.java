public class Pattern_2 {
    public static void leftTriangle(int n){
int a,b;
for(a=0;a<n;a++){
    for(b=2*(n-a);b <= 0;b++){
        System.out.print(" ");
    }
}
for(b=0;b<=a;b++){
    System.out.print("*");
}
System.out.println();
    }
   
  public static void main(String[]args){
    int n=5;
    leftTriangle(n);
  }  
}
