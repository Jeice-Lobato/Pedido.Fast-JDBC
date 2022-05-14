package app;

import model.cadastro.Cliente;
import model.repository.ClienteJDBCRepository;

public class ClienteCadastroApp {

	
	public static void main(String[] args) {
		//SCANNER
		//INTERFACE GRAFICO DO SISTEMA
		//APP - API REST

		Cliente ts = new Cliente();
		ts.setCpf("68678");
		ts.setNome("TONY STARK");
		ts.setWhatsapp(118978898L);


		ClienteJDBCRepository repository = new ClienteJDBCRepository();
		repository.incluir(ts);

	}
}

