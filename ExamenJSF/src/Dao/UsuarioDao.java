package Dao;

import Entities.Usuario;
import Util.Conexion;

public class UsuarioDao extends Conexion<Usuario> implements GenericDao<Usuario>{

	public UsuarioDao() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}

}
