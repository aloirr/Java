package classes.util;

import java.util.Iterator;
import java.util.Map;

import classes.model.Clientes;

public class BuscaChaveMap {

	public String buscachavemap(Map<String, Clientes> table, Object value) {
		Iterator<String> iterator = table.keySet().iterator();
		String result = null;
		while (iterator.hasNext() == true) {
			String iNext = iterator.next();
			if (table.get(iNext).equals(value)) {
				result = iNext;
			}

		}
		return result;
	}

}