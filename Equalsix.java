public class Equalsix {
    public static void main(String []args){
        String s1= "Besant";
        String s2 = "Besant";
        String s3 = new String ("Besant");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);
        System.out.println(s2.equals(s3));
        System.out.println(s2==s3);
    }
    
}
