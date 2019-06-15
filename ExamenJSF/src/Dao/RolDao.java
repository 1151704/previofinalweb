package Dao;

import Entities.Rol;
import Util.Conexion;

public class RolDao extends Conexion<Rol> implements GenericDao<Rol>{

	public RolDao() {
		super(Rol.class);
		// TODO Auto-generated constructor stub
	}

}
