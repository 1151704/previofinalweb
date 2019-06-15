package Dao;

import Entities.Tipocliente;
import Util.Conexion;

public class TipoClienteDao extends Conexion<Tipocliente> implements GenericDao<Tipocliente>{

	public TipoClienteDao() {
		super(Tipocliente.class);
		// TODO Auto-generated constructor stub
	}

}
