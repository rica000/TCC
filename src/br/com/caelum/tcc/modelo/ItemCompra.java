package br.com.caelum.tcc.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity
public class ItemCompra {
	@Id @GeneratedValue
	private Integer id;
	private Formato formato;
	private Integer quantidade;
	private Integer quantidadeEstoque;
	
	@ManyToOne
	private Livro livro;
	
	@OneToOne
	private Desconto desconto;
}
