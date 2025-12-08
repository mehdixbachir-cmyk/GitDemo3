package com.ehei.gi4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProduitServiceTest {

    private ProduitService service;

    @BeforeEach
    void setUp() {
        service = new ProduitService();
    }

    @Test
    void testAddProductSuccess() throws Exception {
        Produit p = new Produit(1L, "Produit1", 100, 5);
        service.addProduct(p);
        assertEquals(1, service.getAllProducts().size());
        assertEquals("Produit1", service.getAllProducts().get(0).getNom());
    }

    @Test
    void testAddProductDuplicateId() {
        Produit p1 = new Produit(1L, "Produit1", 100, 5);
        Produit p2 = new Produit(1L, "Produit2", 50, 2);
        assertDoesNotThrow(() -> service.addProduct(p1));
        Exception exception = assertThrows(Exception.class, () -> service.addProduct(p2));
        assertEquals("Produit déjà existant", exception.getMessage());
    }

    @Test
    void testAddProductInvalidPrix() {
        Produit p = new Produit(2L, "Produit3", -10, 5);
        Exception exception = assertThrows(Exception.class, () -> service.addProduct(p));
        assertEquals("Prix et quantité doivent être positifs", exception.getMessage());
    }
    @Test
    void testUpdateProductSuccess() throws Exception {
        Produit p = new Produit(1L, "Produit1", 100, 5);
        service.addProduct(p);
        p.setPrix(120);
        p.setQuantite(10);
        service.updateProduct(p);
        assertEquals(120, service.getAllProducts().get(0).getPrix());
        assertEquals(10, service.getAllProducts().get(0).getQuantite());
    }

    @Test
    void testUpdateProductNotFound() {
        Produit p = new Produit(2L, "Produit2", 50, 3);
        Exception exception = assertThrows(Exception.class, () -> service.updateProduct(p));
        assertEquals("Produit introuvable", exception.getMessage());
    }

}
