package Bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import Dao.UsuarioDao;
import Entities.Usuario;
@ManagedBean
public class UsuarioBean {
	public List<Usuario> listarUsuarios() {
		UsuarioDao uDao = new UsuarioDao();
		return uDao.list();
	}
}
