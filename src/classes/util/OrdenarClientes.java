package classes.util;

import java.util.Comparator;

import classes.model.Clientes;

public enum OrdenarClientes implements Comparator<Clientes> {
	PorGeopolitico() {
		public int compare(Clientes one, Clientes other) {
			return one.getGeopolitico().compareTo(other.getGeopolitico());
		}
	},

	PorZonaGeo() {
	public int compare(Clientes one, Clientes other) {
			if (one.getZona() != other.getZona()) {
				return one.getZona().compareTo(other.getZona());
			} else if (one.getZona() == other.getZona()) { 
				return one.getGeopolitico().compareTo(other.getGeopolitico());
			} else {
				return one.getGeopolitico().compareTo(other.getGeopolitico());
			}
		}
	},

	PorRazaoSocial() {

		public int compare(Clientes one, Clientes other) {
			return one.getRazaoSocial().compareTo(other.getRazaoSocial());
		}
	},
	PorCodigo() {

		public int compare(Clientes one, Clientes other) {
			return one.getCod().compareTo(other.getCod());
		}

	},

	PorQtd() {

		public int compare(Clientes one, Clientes other) {
			return one.getQtd().compareTo(other.getQtd());
		}

	},

	PorDescricao() {

		public int compare(Clientes one, Clientes other) {
			return one.getDescricao().compareTo(other.getDescricao());
		}

	},

	PorCodProduto() {

		public int compare(Clientes one, Clientes other) {
			return one.getCodproduto().compareTo(other.getCodproduto());
		}

	},

	PorEndereco() {

		public int compare(Clientes one, Clientes other) {
			return one.getEndereco().compareTo(other.getEndereco());
		}

	},

	PorFantasia() {

		public int compare(Clientes one, Clientes other) {
			return one.getFantasia().compareTo(other.getFantasia());
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