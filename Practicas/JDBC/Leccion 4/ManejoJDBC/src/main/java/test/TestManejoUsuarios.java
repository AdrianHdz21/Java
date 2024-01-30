package test;

import datos.Conexion;
import datos.UsuarioJDBC;
import domain.Usuario;
import java.sql.*;
import java.util.*;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            UsuarioJDBC usuariojdbc = new UsuarioJDBC();
            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setId_usuario(2);
            cambioUsuario.setUsername("karla.ivonne");
            cambioUsuario.setPassword("345");
            usuariojdbc.actualizar(cambioUsuario);
            
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setUsername("Carlos");
            nuevoUsuario.setPassword("123");
            usuariojdbc.insetar(nuevoUsuario);
            
            conexion.commit();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}

