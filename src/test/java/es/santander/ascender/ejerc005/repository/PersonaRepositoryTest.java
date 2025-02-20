package es.santander.ascender.ejerc005.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.santander.ascender.ejerc005.model.Persona;

@SpringBootTest
public class PersonaRepositoryTest {
    Persona persona1;
    Persona persona2;
    Persona persona3;

    @Autowired
    PersonaRepository pr;

    @BeforeEach
    void setUp() {
        persona1 = new Persona("Andres", "Perez", 44, 15l); 
        persona2 = new Persona("Jose", "Perez", 34, 17l); 
        persona3 = new Persona("Gonzalo", "Perez", 27, 39l); 
        pr.save(persona1);
        pr.save(persona2);
        pr.save(persona3);
    }
    
    @Test
    void creadByIdTest() {
        Persona persona1 = pr.findById(1l).orElseGet(null);
        assertTrue ("Andres".equals(persona1.getNombre()));        
        assertFalse(pr.findAll().isEmpty());
    }

    @Test 
    void readAllTest() {
        List<Persona> personas = pr.findAll();
        assertTrue(personas.size()==3);
        
    }

    @Test
    void delete(){
        pr.deleteById(1l);
        assertTrue(pr.findAll().size()==2);
        assertFalse(pr.findById(1l).isPresent());
    }

    

    

}
