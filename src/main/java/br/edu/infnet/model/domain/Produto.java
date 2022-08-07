package br.edu.infnet.model.domain;



public class Produto {
	private String nome; 
	private Double preco;
	private Integer codigo;
	
	@Override
	public String toString() {
		return " Nome: " + nome + " - " + " Preço: " + preco + " - " + " Código: " + codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	
}
