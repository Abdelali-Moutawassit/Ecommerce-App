package abdelali.tp.ecommeceapp.repositories;

import abdelali.tp.ecommeceapp.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommandeRepository extends JpaRepository<Commande, Integer> {
}
