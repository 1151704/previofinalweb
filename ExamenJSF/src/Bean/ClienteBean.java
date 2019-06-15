package Bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import Dao.ClienteDao;
import Entities.Cliente;

@ManagedBean
public class ClienteBean {
	public Cliente cliente = new Cliente();

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> listarClientes() {
		ClienteDao cDao = new ClienteDao();
		return cDao.list();
	}

	public String agregarCliente() {
		String cadena = "error";
		Cliente cli = new Cliente();
		cli.setNombre(cliente.getNombre());
		cli.setDireccion(cliente.getDireccion());
		cli.setDocumento(cliente.getDocumento());
		cli.setEmail(cliente.getEmail());
		cli.setTelefono(cliente.getTelefono());
		cli.setFechanacimiento(cliente.getFechanacimiento());
		cli.setUsuarioBean(cliente.getUsuarioBean());
		cli.setTipoclienteBean(cliente.getTipoclienteBean());

		if (cli != null) {
			ClienteDao cDao = new ClienteDao();
			cDao.insert(cli);
			cadena = "verClientes";
		}
		return cadena;
	}

	public String borrarCliente(Cliente c) {
		String cadena = "error";
		ClienteDao cDao = new ClienteDao();
		if (c != null) {
			cDao.delete(c);
			cadena = "exito";
		}
		return cadena;
	}

	public String actualizarCliente(Cliente e) {
		ClienteDao eDao = new ClienteDao();
		eDao.update(e);
		return "verClientes";
	}

}