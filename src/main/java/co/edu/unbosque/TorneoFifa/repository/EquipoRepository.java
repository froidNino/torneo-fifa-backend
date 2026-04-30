package co.edu.unbosque.TorneoFifa.repository;

import co.edu.unbosque.TorneoFifa.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
}