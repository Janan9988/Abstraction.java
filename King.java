interface  Animal {
    public void Sound();
    public void Colour();   
}
class Lion implements Animal{
public void Sound(){
    System.out.println("Haaa Haaaa");
}
public void Colour(){
    System.out.println("Yellow");
}
}
public class King{
    public static void main(String[]args){
      Lion myAnimal = new Lion();
    myAnimal.Sound();
    myAnimal.Colour();
}
}