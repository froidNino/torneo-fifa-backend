package co.edu.unbosque.TorneoFifa.repository;

import co.edu.unbosque.TorneoFifa.model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Long> {
}