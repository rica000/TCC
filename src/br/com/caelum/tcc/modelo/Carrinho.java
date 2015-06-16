package br.com.caelum.tcc.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class Carrinho implements Serializable {

	private static final long serialVersionUID = 1L;

	private Set<ItemCompra> itensDeCompra = new LinkedHashSet<>();
	private BigDecimal valorFrete = BigDecimal.ZERO;
	private String cepDestino;
	private Pagamento pagamento;

}
