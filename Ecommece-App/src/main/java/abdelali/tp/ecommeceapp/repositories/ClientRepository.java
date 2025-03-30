package abdelali.tp.ecommeceapp.repositories;

import abdelali.tp.ecommeceapp.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
