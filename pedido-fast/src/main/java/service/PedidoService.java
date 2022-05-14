package service;

import java.util.List;

import model.pedido.Pedido;
import model.pedido.PedidoItem;

public class PedidoService {
	
	//Aqui é toda a lógica de negócio do sistema
	//relacionado ao pedido.
	public void concluir(Pedido pedido) {
		Double valorTotalPedido = 0.0d;
		List<PedidoItem> itens = pedido.getItens();
		for(PedidoItem item: itens) {
			valorTotalPedido = valorTotalPedido + item.getSubtotal();
		}
		pedido.setValorTotal(valorTotalPedido);
		//ufa parece que o pedido foi concluído,
		//podemos imprimir ou gravar no banco.
	}
}