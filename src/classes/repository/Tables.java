package classes.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

import classes.model.Clientes;
import classes.model.Comodatos;
import classes.model.Zonas;

public class Tables {

	public SortedMap<Integer, Clientes> clientesMap = new TreeMap<>();
	public List<Clientes> clientesList = new ArrayList<>();
	public List<Zonas> zonas = new ArrayList<>();
	public Map<String, Comodatos> comodatos = new LinkedHashMap<>();

	public void tables(String opcao) {
		try {
			clientesMap.clear();
			clientesList.clear();
			zonas.clear();
			comodatos.clear();
			File file = new File("zonasbairros.txt");
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			String leitor;
			while ((leitor = bReader.readLine()) != null) {
				String[] leitorSplit = leitor.split("\t");
				zonas.add(new Zonas(leitorSplit));
			}
			file = new File("table.txt");
			fReader = new FileReader(file);
			bReader = new BufferedReader(fReader);
			leitor = bReader.readLine();
			while ((leitor = bReader.readLine()) != null) {
				String[] leitorSplit = new String[10];
				for (int arr = 0 ; arr < 9 ; arr++) {
				leitorSplit[arr] = leitor.split("\t")[arr];
				}
				int count = 0;
				while (!(zonas.get(count).getBairro().trim().equalsIgnoreCase(leitorSplit[4].trim())) && ((zonas.size()-1) > count)) {
									count++;
				}
				if (zonas.get(count).getZonaId().equalsIgnoreCase("25")) {
					leitorSplit[leitorSplit.length-1] = "25";
				} else if (zonas.get(count).getZonaId().equalsIgnoreCase("36")) {
					leitorSplit[leitorSplit.length-1] = "36";
				} else if (zonas.get(count).getZonaId().equalsIgnoreCase("47")) {
					leitorSplit[leitorSplit.length-1] = "47";
				} else {
					leitorSplit[leitorSplit.length] = "outras";
					System.out.println("outras "+leitorSplit[4]);
				}
				clientesMap.put(Integer.parseInt(leitorSplit[0]), new Clientes(leitorSplit));
				comodatos.put(leitorSplit[5], (new Comodatos(leitorSplit)));
			}
			for (Entry<Integer, Clientes> keys : clientesMap.entrySet()) {
				clientesList.add(new Clientes(keys));
			}
			bReader.close();
			

		} catch (IOException e) {
			e.getMessage();
		}
	}

}
