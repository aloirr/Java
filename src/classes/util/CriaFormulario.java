package classes.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.io.PrintWriter;

import classes.model.Clientes;
import classes.model.Formulario;

public class CriaFormulario {
	public void criaformulario(List<Clientes> table) {
		try {
			Formulario formulario = new Formulario();
			File file = new File("Comodatos.txt");
			if (file.exists()) {
				file.delete();
				file.createNewFile();
			}
			FileOutputStream fOutput = new FileOutputStream(file);
			PrintWriter fWriter = new PrintWriter(new BufferedWriter (new OutputStreamWriter(fOutput, "UTF-8")));
			for (Clientes linha : table) {
				formulario.formularioCliente(linha, fWriter);
			}
			fWriter.flush();
			fWriter.close();
			System.out.println(table.size()+" formulários gerados!");
			System.out.println("Arquivo de formulários \"Comodatos.txt\" gerado com sucesso!");
		} catch (IOException exc) {
			exc.printStackTrace();
		}

	}
}
