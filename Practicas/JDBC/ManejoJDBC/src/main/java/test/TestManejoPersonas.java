package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

//        Insertando un nuevo objeto tipo Persona
//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@gmail.com", "554456787");
//        personaDao.insetar(personaNueva);

//        Modificando un objeto de persona existente
//        Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcesparza@gmail.com", "5544567879");
//        personaDao.actualizar(personaModificar);

//      Eliminando un objeto de persona existente
        Persona personaEliminar = new Persona(4);
        personaDao.elimar(personaEliminar);

        //Listado de personas-Seleccionando
        List<Persona> personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

    }

}
