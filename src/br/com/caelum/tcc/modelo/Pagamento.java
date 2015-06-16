package br.com.caelum.tcc.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pagamento implements Serializable {

	@Id 
	private Integer id;
	private String status;
	private BigDecimal valor;

}
