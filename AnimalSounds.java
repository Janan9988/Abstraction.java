abstract class Sounds {
    public abstract void animalsound();

public void sleep(){
    System.out.println("The cow sleep like bzzz bzzz");
}
  }
class Cow extends Sounds{
    public void animalsound(){
        System.out.println("The cow is sleeping ");
    }
} 
class AnimalSounds
 {
    public static void main(String[]args){

    
Cow g = new Cow();
g.animalsound();
g.sleep();

}

 }