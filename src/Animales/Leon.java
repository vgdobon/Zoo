package Animales;

public class Leon  extends Animal implements IShow{
    @Override
    public String show() {
        return "Grrrrr , soy un león";
    }
}
