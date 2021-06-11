package ec.edu.ups.entidades;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@NamedQuery(name = "comida.findAll", query = "Select c FROM Comida c")
@Table(name = "comida")
public class Comida implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	private String nombre;
	private double precio;
	
	public Comida() {
		// TODO Auto-generated constructor stub
	}

	public Comida(int codigo, String nombre, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Comida [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	

}
