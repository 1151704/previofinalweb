package Entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the pago database table.
 * 
 */
@Entity
@NamedQuery(name="Pago.findAll", query="SELECT p FROM Pago p")
public class Pago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private int ingreso;

	private BigDecimal valor;

	//bi-directional many-to-one association to Caja
	@ManyToOne
	@JoinColumn(name="caja")
	private Caja cajaBean;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuarioBean;

	//bi-directional one-to-one association to Pagomensual
	@OneToOne(mappedBy="pago")
	private Pagomensual pagomensual;

	//bi-directional one-to-one association to Pagoservicio
	@OneToOne(mappedBy="pago")
	private Pagoservicio pagoservicio;

	public Pago() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIngreso() {
		return this.ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Caja getCajaBean() {
		return this.cajaBean;
	}

	public void setCajaBean(Caja cajaBean) {
		this.cajaBean = cajaBean;
	}

	public Usuario getUsuarioBean() {
		return this.usuarioBean;
	}

	public void setUsuarioBean(Usuario usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

	public Pagomensual getPagomensual() {
		return this.pagomensual;
	}

	public void setPagomensual(Pagomensual pagomensual) {
		this.pagomensual = pagomensual;
	}

	public Pagoservicio getPagoservicio() {
		return this.pagoservicio;
	}

	public void setPagoservicio(Pagoservicio pagoservicio) {
		this.pagoservicio = pagoservicio;
	}

}