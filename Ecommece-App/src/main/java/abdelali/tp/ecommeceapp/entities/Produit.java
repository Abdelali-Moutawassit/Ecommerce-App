package abdelali.tp.ecommeceapp.entities;

import abdelali.tp.ecommeceapp.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data @Builder
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageUrl;
    private String nom;
    private String description;
    private double prix;
    private int stock;

    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @ManyToMany(mappedBy = "produits", cascade = CascadeType.ALL)
    private List<Commande> commandes;

}

