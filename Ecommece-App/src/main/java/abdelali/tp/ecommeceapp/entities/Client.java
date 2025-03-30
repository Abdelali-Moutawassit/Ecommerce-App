package abdelali.tp.ecommeceapp.entities;

import abdelali.tp.ecommeceapp.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data @Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String email;
    private String motDePasse;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Commande> commandes;


}

