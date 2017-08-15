package classes.model;

import java.io.IOException;
import java.io.Writer;

import classes.util.BuscaComodato;

public class Formulario {
	public void formularioCliente(Clientes linhaTable, Writer writer) throws IOException {
		BuscaComodato buscacomodato = new BuscaComodato();
		writer.write("C�d: " + linhaTable.getCod()+" - " + linhaTable.getRazaoSocial() + " (" + linhaTable.getFantasia().trim()+")\n");
		writer.write("Endere�o: " + linhaTable.getEndereco() + " - Geopol�tico: " + linhaTable.getGeopolitico().trim()+" - Zona: "+linhaTable.getZona()+"\n");
		buscacomodato.buscacomodato(linhaTable.getCod(), writer);
		writer.write("#########################################################\n");
		writer.write("\n");
	}
}
