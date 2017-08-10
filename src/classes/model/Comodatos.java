package classes.model;

public class Comodatos {
	private String cod, documento, codproduto, descricao, qtd;
	private String[] linha;

	public Comodatos() {
	}

	public Comodatos(String[] linha) {
		this.cod = linha[0];
		this.documento = linha[5];
		this.codproduto = linha[6];
		this.descricao = linha[7];
		this.qtd = linha[8];
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
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

	public String[] getLinha() {
		return linha;
	}

	public void setLinha(String[] linha) {
		this.linha = linha;
	}

}
