package Main;

import Model.SalleCinema;

public class Main
{
    public static void main(String[] args)
    {

        SalleCinema salle = new SalleCinema("creed",5,5.0d);
        salle.vendrePlace(5);
        salle.vendrePlace(1);
        System.out.println(salle.getNbPlacesVendues());
        System.out.println(salle.estPlaine());


    }
}
