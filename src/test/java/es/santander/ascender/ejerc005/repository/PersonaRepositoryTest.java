package es.santander.ascender.ejerc005.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.santander.ascender.ejerc005.model.Persona;

@SpringBootTest
public class PersonaRepositoryTest {
    
    
    Persona persona1 = new Persona("Andres", "Perez", 44, 15l);
    Persona persona2 = new Persona("Jose", "Perez", 34, 17l);
    Persona persona3 = new Persona("Gonzalo", "Perez", 27, 39l);
    Persona persona4 = new Persona("Fernando", "Gonzalez", 67, 39l);
    
    
    @Autowired
    PersonaRepository pr;


    @BeforeEach
    void setUp() {
        pr.save(persona1);
        pr.save(persona2);
        pr.save(persona3);

    }

    @Test
    void crearTest() {
        assertTrue(pr.findAll().size() == 3);
        pr.save(persona4);
        assertTrue(pr.findAll().size() == 4);
        persona4 = pr.findById(persona4.getId()).get();
        assertTrue("Fernando".equals(persona4.getNombre()));
        pr.deleteById(persona4.getId());
        
    }

    @Test
    void readAllTest() {
        
        List<Persona> personas = pr.findAll();
        assertTrue(personas.size() == 3);

    }

    @Test
    void readById() {
        
        Persona persona = pr.findById(1l).get();
        assertTrue("Andres".equals(persona.getNombre()));
    }

    @Test
    void delete() {
        
        pr.deleteById(persona2.getId());
        
        assertFalse(pr.findById(persona2.getId()).isPresent());
    }

    @Test
    void update() {
        
        Persona persona4 = pr.findById(1l).orElseGet(null);
        persona4.setNombre("Andresito");
        pr.save(persona4);
        assertTrue("Andresito".equals(pr.findById(1l).orElseGet(null).getNombre()));
    }

}
