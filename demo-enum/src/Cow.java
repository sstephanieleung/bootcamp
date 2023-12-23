public class Cow extends Animal {
    
    @Override
    public void eat(){
        System.out.println("Cow eat!");
    }

    public static void main(String[] args) {
        Animal a = new Cow();
        a.eat(); //Animal eat! or Cow eat! ??
    }
}
