package Dao;

import Entities.Cliente;
import Util.Conexion;

public class ClienteDao extends Conexion<Cliente> implements GenericDao<Cliente>{

	public ClienteDao() {
		super(Cliente.class);
		// TODO Auto-generated constructor stub
	}

}
