package Model;

public class SalleCinema
{
    private String film;
    public int nbPlaces;
    private double tarifs;
    private int nbPlacesVendues;

    public SalleCinema(String film, int nbPlaces, double tarifs)
    {
        this.film=film;
        this.nbPlaces=nbPlaces;
        this.tarifs=tarifs;
    }

    public boolean estPlaine()
    {
        if(nbPlacesVendues>=nbPlaces)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int nbPlacesDisponible()
    {
        return nbPlaces-nbPlacesVendues;
    }

    public void vendrePlace(int nb)
    {
        if(nbPlacesDisponible()>=nb)
        this.nbPlacesVendues+=nb;
        else
        System.out.println("Pas assez de places, il ne reste que "+this.nbPlacesDisponible());
    }



    public String versChaine()
    {
        return "";
    }

    public int getNbPlaces()
    {return nbPlacesVendues;}

    public int getNbPlacesVendues()
    {return nbPlacesVendues;}

}
