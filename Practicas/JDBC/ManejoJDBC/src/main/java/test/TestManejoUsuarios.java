package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.*;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        UsuarioJDBC usuarioJdbc = new UsuarioJDBC();

        //Ejecutando listado usuarios
        List<Usuario> usuarios = usuarioJdbc.seleccionar();
        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
        });

//        Insertando Nuevo usuario
//        Usuario usuario = new Usuario("carlos.juarez" ,"123");
//        usuarioJdbc.insetar(usuario);

//        Modificando usuario existente
//        Usuario usuario = new Usuario(3,"carlos.juarez", "456");
//        usuarioJdbc.actualizar(usuario);

//        Eliminando un usuario
        usuarioJdbc.elimar(new Usuario(3));
    }

}
