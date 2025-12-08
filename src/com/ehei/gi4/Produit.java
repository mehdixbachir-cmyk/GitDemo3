package com.ehei.gi4;

public class Produit {
    private final Long id;
    private final String nom;
    private final double prix;
    private final int quantite;

    public Produit(Long id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public Long getId() { return id; }
    public String getNom() { return nom; }

    public void setNom(String nom)
