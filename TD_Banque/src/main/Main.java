package main;
 

import model.dec.CompteManip;
import model.exceptions.InsufficientBalance;
import model.fact.CompteFactory;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Main
{
    private static final Logger LOG = Logger.getLogger(Main.class.getCanonicalName());

    public static void main (String[] args)
    {
        try
		{
			Handler handler = new FileHandler("banque.log");
			handler.setLevel(Level.FINE);
			LOG.addHandler(handler);
		}
		catch(Exception ex)
		{
			LOG.severe(ex.getMessage());
		}
		
        CompteFactory cf = new CompteFactory();

        CompteManip c1 = cf.createCompteCourant("John Doe");
        CompteManip c2 = cf.createCompteCourant("Jack Bauer");
		CompteManip c3 = cf.createCompteCourant("Haseeb");
		
		c1.deposit(50);
		c2.deposit(100000.0d);
		c3.deposit(500.0d);
		

        /*double amount = 19.0d;
        try 
		{
            double retrait = c1.withdraw(amount);
        }
        catch (InsufficientBalance ex){
            LOG.severe(ex.getMessage());
        } 
		finally 
		{
            System.out.print("bloc finally");
            LOG.fine("Withdraw operation of " + amount);
        }*/

        System.out.println(c1);
        System.out.println("\n"+c2);
		System.out.println(c3);
    }
}
