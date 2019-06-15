package Dao;

import Entities.Tarifa;
import Util.Conexion;

public class TarifaDao extends Conexion<Tarifa> implements GenericDao<Tarifa>{

	public TarifaDao() {
		super(Tarifa.class);
		// TODO Auto-generated constructor stub
	}
	

}
