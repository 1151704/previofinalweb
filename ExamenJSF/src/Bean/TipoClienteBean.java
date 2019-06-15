package Bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import Dao.TipoClienteDao;
import Entities.Tipocliente;

@ManagedBean
public class TipoClienteBean {
	public List<Tipocliente> listarTipos() {
		TipoClienteDao tDao = new TipoClienteDao();
		return tDao.list();
	}
}
