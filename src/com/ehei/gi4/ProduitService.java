package com.ehei.gi4;

import java.util.ArrayList;
import java.util.List;

public class ProduitService {
    private List<Produit> produits = new ArrayList<>();

    public void addProduct(Produit p) throws Exception {
        for (Produit exist : produits) {
            if (exist.getId().equals(p.getId()) || exist.getNom().equals(p.getNom())) {
                throw new Exception("Produit déjà existant");
            }
        }
        if (p.getPrix() <= 0 || p.getQuantite() <= 0) {
            throw new Exception("Prix et quantité doivent être positifs");
        }
        produits.add(p);
    }

    public List<Produit> getAllProducts() {
        return produits;
    }
    public void updateProduct(Produit p) throws Exception {
        boolean found = false;
        for (Produit exist : produits) {
            if (exist.getId().equals(p.getId())) {
                if (p.getPrix() <= 0 || p.getQuantite() <= 0) {
                    throw new Exception("Prix et quantité doivent être positifs");
                }
                exist.setNom(p.getNom());
                exist.setPrix(p.getPrix());
                exist.setQuantite(p.getQuantite());
                found = true;
                break;
            }
        }
        if (!found) {
            throw new Exception("Produit introuvable");
        }
    }

}
