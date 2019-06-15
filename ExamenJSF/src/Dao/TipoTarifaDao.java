package Dao;

import Entities.Tipotarifa;
import Util.Conexion;

public class TipoTarifaDao extends Conexion<Tipotarifa> implements GenericDao<Tipotarifa>{

	public TipoTarifaDao() {
		super(Tipotarifa.class);
		// TODO Auto-generated constructor stub
	}

}
