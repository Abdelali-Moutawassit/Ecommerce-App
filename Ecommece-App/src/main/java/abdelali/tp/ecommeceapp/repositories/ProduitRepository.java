package abdelali.tp.ecommeceapp.repositories;

import abdelali.tp.ecommeceapp.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Integer> {
}
