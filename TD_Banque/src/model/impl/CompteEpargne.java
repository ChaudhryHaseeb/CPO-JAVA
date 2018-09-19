package model.impl;

import model.dec.CompteManip;

public final class CompteEpargne extends Compte implements CompteManip
{
	private float interestRates = 0;

	public CompteEpargne (String owner, double initalBalance, float parInterestRates)
    {
        super(owner, initalBalance);
        interestRates = parInterestRates;
    }

    public CompteEpargne (String owner, float parInterestRates)
    {
    	super(owner);
        interestRates = parInterestRates;
    }

    public float getInterestRates ()
    {
        return this.interestRates;
    }

     @Override
    public double withdraw(double amount)
    {
        if (this.getBalance()<= 50)
        {
            System.out.println ("Erreur : Retrait impossible, solde insuffisant !");
        }
        else
        {
            double previous = this.getBalance();
            this.setBalance(previous - amount);
            return this.getBalance();
        }
        return 0d;
    }

    @Override
    public double deposit(double amount)
    {
        double previous = this.getBalance();
        this.setBalance(previous + amount);
        return this.getBalance();
    }

     @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" Interêt d'épargne : ").append(this.interestRates).append("%\n");
        return sb.toString(); //Retouner avec le .toString() car c'est un stringBuilder (ATTENTION !!)
    }
}