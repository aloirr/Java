package classes.util;

import java.util.Comparator;

import classes.model.Zonas;

public enum OrdenarZonas implements Comparator<Zonas> {
	PorZonaId() {
		public int compare(Zonas one, Zonas other) {
			return one.getZonaId().compareTo(other.getZonaId());
		}
	},

	PorBairro {
		public int compare(Zonas one, Zonas other) {
			return one.getBairro().compareTo(other.getBairro());
		}

	},
}
