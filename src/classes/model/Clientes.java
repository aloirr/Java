package classes.model;

import java.util.Map.Entry;

public class Clientes {
	private String cod, fantasia, razaoSocial, endereco, geopolitico, documento, codproduto, descricao, qtd, zona;

	public Clientes(String[] linha) {
		this.cod = linha[0];
		this.fantasia = linha[1];
		this.razaoSocial = linha[2];
		this.endereco = linha[3];
		this.geopolitico = linha[4];
		this.setZona(linha[9]);
	}

	public Clientes(Entry<Integer, Clientes> linha) {
		this.cod = linha.getValue().cod;
		this.fantasia = linha.getValue().fantasia;
		this.razaoSocial = linha.getValue().razaoSocial;
		this.endereco = linha.getValue().endereco;
		this.geopolitico = linha.getValue().geopolitico;
		this.zona = linha.getValue().zona;
	}


	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getGeopolitico() {
		return geopolitico;
	}

	public void setGeopolitico(String geopolitico) {
		this.geopolitico = geopolitico;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCodproduto() {
		return codproduto;
	}

	public void setCodproduto(String codproduto) {
		this.codproduto = codproduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getQtd() {
		return qtd;
	}

	public void setQtd(String qtd) {
		this.qtd = qtd;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}







}
