/*package model.impl;

import java.util.Date;
import java.util.UUID;

public class AssuranceVie extends Compte {

    private final Date dateCreation;

    public AssuranceVie(String owner, double initialMontant, Date dateCreation) {
        this.super.owner = owner;
        this.montant = initialMontant;
        this.numCompte = UUID.randomUUID().toString();
    }

    public AssuranceVie(String owner) {
        super(owner);
    }

    @Override
    public double depot(double parMontant) {
        double previous = this.getMontant();
        this.setMontant(previous + parMontant);
        return this.getMontant();
    }

    @Override
    public double retrait(double parMontant) {
        double previous = this.getMontant();
        this.setMontant(previous - parMontant);
        return this.getMontant();
    }
}*/
