package classes.model;

import java.util.ArrayList;
import java.util.List;

public class Zonas {
	private String bairro, zonaId;
	private List<Zonas> zonas = new ArrayList<Zonas>();

	public Zonas(String[] linha) {
		this.zonaId = linha[0];
		this.bairro = linha[1];
	}
	
	public Zonas() {
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getZonaId() {
		return zonaId;
	}

	public void setZonaId(String zonaId) {
		this.zonaId = zonaId;
	}

	public List<Zonas> getZonas() {
		return zonas;
	}

	public void setZonas(List<Zonas> zonas) {
		this.zonas = zonas;
	}

}
