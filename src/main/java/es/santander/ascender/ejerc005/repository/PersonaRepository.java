package es.santander.ascender.ejerc005.repository;

import org.springframework.stereotype.Repository;

import es.santander.ascender.ejerc005.model.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
