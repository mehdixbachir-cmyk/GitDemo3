package com.ehei.gi4;

import java.util.ArrayList;
import java.util.List;

public class ProduitService {
    private List<Produit> produits = new ArrayList<>();

    // Create
    public void addProduit(Produit p) {
        produits.add(p);
    }

    // Read
    public Produit getProduitById(Long id) {
        return produits.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Produit> getAllProduits() {
        return produits;
    }

    // Update
    public void updateProduit(Long id, String nom, double prix, int quantite) {
        Produit p = getProduitById(id);
        if (p != null) {
            p.setNom(nom);
            p.setPrix(prix);
            p.setQuantite(quantite);
        }
    }

    // Delete
    public void deleteProduit(Long id) {
        produits.removeIf(p -> p.getId().equals(id));
    }
}

