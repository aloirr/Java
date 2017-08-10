package classes.util;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import classes.repository.Tables;

public class BuscaComodato {
	public void buscacomodato(String cod, Writer writer) {
		try {
			Tables table = new Tables();
			table.tables("clientes");
			Iterator<String> iterator = table.comodatos.keySet().iterator();
			while (iterator.hasNext() == true) {
				String iNext = iterator.next();

				if (table.comodatos.get(iNext).getCod().equalsIgnoreCase(cod)) {
					writer.write("----COMODATO N� " + table.comodatos.get(iNext).getDocumento() + " ("
							+ table.comodatos.get(iNext).getDescricao().trim() + " - "
							+ table.comodatos.get(iNext).getQtd() + " UND)--------\n");
					writer.write("[  ]FUNCIONANDO  [  ]ENFERRUJADO  [  ]AMASSADO  [  ]VIDRO QUEBRADO\n"
							+ "[  ]ADESIVAGEM N�O OK  [  ]ESTRUTURA AVARIADA  [  ]INVADIDO\n"
							+ "#RESERVADO A GER�NCIA# [  ]RECOLHER P/ MANUTEN��O  [  ]RECOLHER PARA ENCERRAMENTO\n"
							+ "Obs.:\n");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
