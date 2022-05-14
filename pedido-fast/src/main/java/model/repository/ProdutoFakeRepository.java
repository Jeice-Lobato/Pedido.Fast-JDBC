package model.repository;

import java.util.HashMap;
import java.util.Map;

import model.cadastro.Produto;

public class ProdutoFakeRepository {
	
		private Map<Integer, Produto> produtos = new HashMap();
		public ProdutoFakeRepository() {
			Produto cocacola = new Produto();
			cocacola.setDescricao("COLA COLA PET 600ml");
			cocacola.setId(1);
			cocacola.setPrecoVenda(7.80d);
			cocacola.setSaldo(42.0);

			produtos.put(1, cocacola);

			Produto pizza = new Produto();
			pizza.setDescricao("PIZZA FAMÍLIA CALABRESA");
			pizza.setId(2);
			pizza.setPrecoVenda(35.99d);
			pizza.setSaldo(13.0);

			produtos.put(2, pizza);
		}
		public Produto buscarPorId(Integer id) {
			return produtos.get(id);
		}
	}


