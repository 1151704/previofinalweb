package Bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import Dao.TarifaDao;
import Entities.Tarifa;

@ManagedBean
public class TarifaBean {

	public Tarifa tarifa = new Tarifa();

	public Tarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}

	public String agregarTarifa() {
		String cadena = "error";
		Tarifa tar = new Tarifa();
		tar.setDescripcion(tarifa.getDescripcion());
		tar.setFechainicio(tarifa.getFechainicio());
		tar.setFechafin(tarifa.getFechafin());
		tar.setValor(tarifa.getValor());
		tar.setTipotarifaBean(tarifa.getTipotarifaBean());
		tar.setTipovehiculoBean(tarifa.getTipovehiculoBean());

		if (tar != null) {
			TarifaDao td = new TarifaDao();
			td.insert(tar);
			cadena = "exito";
		}
		return cadena;
	}

	public List<Tarifa> listarTarifas() {
		TarifaDao tDao = new TarifaDao();
		return tDao.list();
	}

	public String borrarTarifa(Tarifa t) {
		String cadena = "error";
		if (t != null) {
			TarifaDao tDao = new TarifaDao();
			tDao.delete(t);
		}
		return cadena;
	}
}
