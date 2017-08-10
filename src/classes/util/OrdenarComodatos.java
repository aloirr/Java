package classes.util;

import java.util.Comparator;

import classes.model.Comodatos;

public enum OrdenarComodatos implements Comparator<Comodatos> {
	PorCodigo() {

		public int compare(Comodatos one, Comodatos other) {
			return one.getCod().compareTo(other.getCod());
		}

	},

	PorQtd() {

		public int compare(Comodatos one, Comodatos other) {
			return one.getQtd().compareTo(other.getQtd());
		}

	},

	PorDescricao() {

		public int compare(Comodatos one, Comodatos other) {
			return one.getDescricao().compareTo(other.getDescricao());
		}

	},

	PorCodProduto() {

		public int compare(Comodatos one, Comodatos other) {
			return one.getCodproduto().compareTo(other.getCodproduto());
		}

	};

	// public abstract int compare(Clientes one, Clientes other);
	//
	// public Comparator asc() {
	// return this;
	// }
	//
	// public Comparator desc() {
	// return Collections.reverseOrder(this);
	// }
}