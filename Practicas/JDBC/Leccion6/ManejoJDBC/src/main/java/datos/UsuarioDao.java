package datos;

import domain.UsuarioDTO;
import java.sql.SQLException;
import java.util.List;

public interface UsuarioDao {

    public List<UsuarioDTO> select() throws SQLException;

    public int insert(UsuarioDTO persona) throws SQLException;

    public int update(UsuarioDTO persona) throws SQLException;

    public int delete(UsuarioDTO persona) throws SQLException;

}
