package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@NamedQuery(name = "pedidos",query = "select p FROM pedido p")
@Table(name="pedido")
public class Pedido implements Serializable{

	private static final long serialVersionUID=1L;
	
	@Id
	
	private int numero_pedido;
	@Column(name = "fecha")
	private Date fecha;
	
	private String nombre;
	private double subtotal;
	private double total;
	private double iva;
	private String observaciones;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
	private List comida = new ArrayList<Comida>();
	
	 public Pedido() {
		// TODO Auto-generated constructor stub
	}
	 
	 
	
	public Pedido(int numero_pedido, Date fecha, String nombre, double subtotal, double total, double iva,
			String observaciones) {
		super();
		this.numero_pedido = numero_pedido;
		this.fecha = fecha;
		this.nombre = nombre;
		this.subtotal = subtotal;
		this.total = total;
		this.iva = iva;
		this.observaciones = observaciones;
	}



	public int getNumero_pedido() {
		return numero_pedido;
	}
	public void setNumero_pedido(int numero_pedido) {
		this.numero_pedido = numero_pedido;
	}
	public Date getFehca() {
		return fecha;
	}
	public void setFehca(Date fechaa) {
		this.fecha = fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}



	@Override
	public String toString() {
		return "Pedido [numero_pedido=" + numero_pedido + ", fecha=" + fecha + ", nombre=" + nombre + ", subtotal="
				+ subtotal + ", total=" + total + ", iva=" + iva + ", observaciones=" + observaciones + "]";
	}
	
	
}
