package itensApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	private String tipo;
	private boolean estoque;
	private int quant;
	double preco;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	public boolean isEstoque() {
		return estoque;
	}
	public int getQuant() {
		return quant;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setEstoque(boolean estoque) {
		this.estoque = estoque;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	


}
