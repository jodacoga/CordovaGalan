package ec.edu.ups.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import ec.edu.ups.DaoControlador.ControladorBuscarPedido;
import ec.edu.ups.entidades.Pedido;

@Stateless
public class BuscarPedidoFacade implements ControladorBuscarPedido{

	EntityManager em;
	@Override
	public List<Pedido> findPedido() {
		
		return null;
	}

	@Override
	public Pedido findPedido(Pedido p) {
		
		return null;
	}

}
