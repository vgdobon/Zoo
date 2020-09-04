//        3 animales (tortuga, león, águila)
//        todos los animales puedan realizar un show (show es un metodo que devuelve un string)
//        cada animal realiza su propio show
//        un componente zoo que se dedique a realizar shows con animales (metodo que muestra por pantalla el resultado del show)

import Animales.*;

public class Main {
    public static void main(String[] args) {

        Aguila aguila = new Aguila();
        ComponenteShow.doShowMessages(aguila);

        Leon leon = new Leon();
        ComponenteShow.doShowMessages(leon);

        Tortuga tortuga = new Tortuga();
        ComponenteShow.doShowMessages(tortuga);

       // Oso oso = new Oso();
       // System.out.println(ComponenteShow.doShowMessages(oso));
    }
}
