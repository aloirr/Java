package classes;


import java.util.Collections;

import classes.repository.Tables;
import classes.util.CriaFormulario;
import classes.util.OrdenarClientes;

public class Main {

	public static void main(String[] args) {
		Tables table = new Tables();
		CriaFormulario criaformulario = new CriaFormulario();
		table.tables("clientes");
		table.tables("zonas");
		Collections.sort(table.clientesList,OrdenarClientes.PorZonaGeo);
		criaformulario.criaformulario(table.clientesList);
	
	}
}
