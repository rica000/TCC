package br.com.caelum.tcc.modelo;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livro {
	@Id @GeneratedValue
	private Integer id;
	private String codigo;
	private String titulo;
	private String tituloCurto;
	private String nomeAutor;
	private String imagem;
	private BigDecimal valorEbook;
	private BigDecimal valorImpresso; 
	@Column(length=1000) 
	private String descricao;}
