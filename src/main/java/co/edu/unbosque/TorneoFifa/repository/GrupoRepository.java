package co.edu.unbosque.TorneoFifa.repository;

import co.edu.unbosque.TorneoFifa.model.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, String> {
}