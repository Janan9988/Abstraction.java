abstract class Birds {
    abstract public void Sounds();
}
class Lion extends Birds{
    public void Sounds (){
        System.out.println("The lion make the sound haaaaa");
    }

} 
class Tiger extends Birds{
    public void Sounds (){
        System.out.println("The Tiger make the sounds hawww hawww");
    }

} 
class AbstractMain{
    public static void main(String[]args){ 
    Lion h = new Lion();
    Tiger g = new Tiger();
    h.Sounds();
    g.Sounds();
    }
    
}