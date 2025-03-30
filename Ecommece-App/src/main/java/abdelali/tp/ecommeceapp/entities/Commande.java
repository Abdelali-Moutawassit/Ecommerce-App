package abdelali.tp.ecommeceapp.entities;

import abdelali.tp.ecommeceapp.enums.CommandeStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data @Builder
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateCommande;
    private double total;

    @Enumerated(EnumType.STRING)
    private CommandeStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToMany
    @JoinTable(
            name = "commande_produit",
            joinColumns = @JoinColumn(name = "commande_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id"))
    private List<Produit> produits;


}
