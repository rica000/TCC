package br.com.caelum.tcc.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id @GeneratedValue
	private int id;
	private String nome;
	private String senha;
	private String email;
	private Perfil perfil;
}
