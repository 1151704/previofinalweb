package Bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import DAO.*;
import Entities.*;

@ManagedBean
public class UsuarioBean {

	public Usuario usuario = new Usuario();
	public int idUsuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String registrarUsuario(Rol r) {

		String cadena = "Error";

		Usuario u = new Usuario();

		u.setUsuario(usuario.getUsuario());
		u.setClave(usuario.getClave());
		u.setEmail(usuario.getEmail());
		u.setNombre(usuario.getNombre());
		u.setDocumento(usuario.getDocumento());
		u.setFechanacimiento(usuario.getFechanacimiento());
		UsuariorolPK us = new UsuariorolPK();
		us.setIdusuario(usuario.getId());
		us.setIdrol(r.getId());

		if (u != null) {

			UsuarioDao pDAO = new UsuarioDao();
			pDAO.insert(u);
			cadena = "Ver Usuarios";

		}

		return cadena;

	}

	public List<Usuario> listarUsuarios() {

		UsuarioDao uDao = new UsuarioDao();

		return uDao.list();

	}

	public String borrarUsuario(Usuario u) {

		String cadena = "Error";

		if (u != null) {

			UsuarioDao uDAO = new UsuarioDao();
			uDAO.delete(u);
			cadena = "MostrarUsuarios";

		}

		return cadena;

	}

	public String editarUsuario(int id) {

		idUsuario = id;
		UsuarioDao uDAO = new UsuarioDao();
		usuario = uDAO.find(idUsuario);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("usuarioMap", usuario);
		return "EditarUsuarios";

	}

	public String actualizarUsuario(Usuario u) {

		UsuarioDao uDAO = new UsuarioDao();
		uDAO.update(u);
		return "MostrarUsuarios";

	}

	public static void main(String[] args) {

		Usuario u = new Usuario();
		Date d = new Date("15/06/2019");

		u.setUsuario("diego15");
		u.setClave("1234");
		u.setEmail("diego@gmail.com");
		u.setNombre("Diego");
		u.setDocumento("1090547963");
		u.setFechanacimiento(d);

		UsuariorolPK uRolPK = new UsuariorolPK();
		uRolPK.setIdrol(1);
		uRolPK.setIdusuario(1);

		UsuarioDao uDAO = new UsuarioDao();
		uDAO.insert(u);

		Usuariorol ur = new Usuariorol();
		ur.setId(uRolPK);

		UsuariorolDao uRolDao = new UsuariorolDao();
		uRolDao.insert(ur);

	}

}
