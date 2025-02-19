package es.santander.ascender.ejerc005.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.santander.ascender.ejerc005.model.Persona;

@SpringBootTest
public class PersonaRepositoryTest {
    Persona persona;

    @Autowired
    PersonaRepository pr;

    @BeforeEach
    void setUp() {
        persona = new Persona("Jose", "Calatayud", 44, 15l);
        pr.deleteAll();

    }

    @Test
    void crearTest() {
        assertTrue(pr.findAll().isEmpty());
        pr.save(persona);
        assertFalse(pr.findAll().isEmpty());
    }

    @Test
    void listarTest() {
        // for (int i = 0; i < 5; i++) {
        //     pr.save(persona);
        // }
        pr.save(persona);
        pr.save(persona);
        pr.save(persona);
        assertTrue(pr.findAll().size()==3);

    }

}
