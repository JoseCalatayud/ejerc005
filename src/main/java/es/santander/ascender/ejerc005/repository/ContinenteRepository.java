package es.santander.ascender.ejerc005.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.santander.ascender.ejerc005.model.Continente;
@Repository
public interface ContinenteRepository extends JpaRepository<Continente, Long> {

}
