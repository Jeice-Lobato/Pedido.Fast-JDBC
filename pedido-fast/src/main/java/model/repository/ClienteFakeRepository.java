package model.repository;

	import java.util.HashMap;
	import java.util.Map;

import model.cadastro.Cliente;
import model.cadastro.Endereco;

	public class ClienteFakeRepository {
		
		private Map<Integer, Cliente> clientes = new HashMap();
		public ClienteFakeRepository() {
			Cliente ts = new Cliente();
			ts.setCpf("12312578923");
			ts.setId(1);
			ts.setNome("TOMMY SHELBY");
			ts.setWhatsapp(21958940362L);
			Endereco endts= new Endereco();
			endts.setBairro("Birmingham/CENTRO");
			endts.setNumero("SN");
			endts.setLogradouro("RUA DAS FADAS");
			ts.setEndereco(endts);

			//adicionando no mapa de clientes
			clientes.put(1, ts);

			Cliente polly = new Cliente();
			polly.setCpf("98688908978");
			polly.setId(2);
			polly.setNome("POLLY GRAY");
			polly.setWhatsapp(21954357976L);
			Endereco endPolly = new Endereco();
			endPolly.setBairro("Birmingham");
			endPolly.setNumero("425");
			endPolly.setLogradouro("RUA DOS ANJOS");
			polly.setEndereco(endPolly);

			//adicionando no mapa de clientes
			clientes.put(2, polly);
		}
		public Cliente buscarPorId(Integer id) {
			return clientes.get(id);
		}
}


