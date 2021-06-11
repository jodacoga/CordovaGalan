package ec.edu.ups.DaoControlador;

import java.util.List;

import ec.edu.ups.entidades.Pedido;

public interface ControladorBuscarPedido {

	public List<Pedido> findPedido();
	public Pedido findPedido(Pedido p);
	
	
}
