package br.com.caelum.tcc.modelo;

import java.util.Calendar;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido {


	@Id @GeneratedValue 
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Calendar data;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	private Set<ItemCompra> itens;

}
