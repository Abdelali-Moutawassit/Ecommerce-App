package abdelali.tp.ecommeceapp.repositories;

import abdelali.tp.ecommeceapp.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
}
