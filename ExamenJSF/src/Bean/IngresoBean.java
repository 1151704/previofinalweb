package Bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;

import DAO.*;
import Entities.Ingreso;
import Entities.Ingresonormal;
import Entities.Usuario;
import Entities.UsuariorolPK;

@ManagedBean
public class IngresoBean {
	
	public Ingreso ingreso = new Ingreso();
	public int idIngreso;
	
	public Ingreso getIngreso() {
		return ingreso;
	}
	public void setIngreso(Ingreso ingreso) {
		this.ingreso = ingreso;
	}
	
	public String registrarIngreso() {
		
		String cadena = "Error";

		Ingreso i = new Ingreso();

		i.setTipo(ingreso.getTipo());
		i.setFechaingreso(ingreso.getFechaingreso());
		i.setFechasalida(ingreso.getFechasalida());
		i.setNumero(ingreso.getNumero());
		Ingresonormal iNormal = new Ingresonormal();
		iNormal.setId(i.getId());

		if (i != null) {

			IngresoDao iDAO = new IngresoDao();
			iDAO.insert(i);
			cadena = "Ver Ingresos";

		}

		return cadena;
		
	}
	
	public static void main(String[]args) {
		
		Ingreso i = new Ingreso();
		Date fIngreso = new Date("14/06/2019");
		Date fSalida = new Date("15/06/2019");
		
		i.setTipo(0);
		i.setFechaingreso(fIngreso);
		i.setFechasalida(fSalida);
		i.setNumero("1");
		
		IngresoDao iDao = new IngresoDao();
		iDao.insert(i);
		
		Ingresonormal iNormal = new Ingresonormal();
		iNormal.setId(5);
		
		IngresonormalDao iNDao = new IngresonormalDao();
		iNDao.insert(iNormal);
		
	}

}
