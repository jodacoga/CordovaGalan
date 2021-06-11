package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.DaoControlador.*;
import ec.edu.ups.entidades.Pedido;

@Stateless

public class CrearPedidoFacade implements ControladorCrearPedido{

	EntityManager em;
 
	@Override
	public void insertPedido(Pedido p) {
		
		em.persist(p);
		
	}	


}
