package org;

import java.math.*;

public class Prenda {
	
	private String id;
	
	private String estado;
	
	private TipoPrenda tipoDePrenda;
	
	private BigDecimal valor;

	public TipoPrenda getTipoDePrenda() {
		return tipoDePrenda;
	}

	public void setTipoDePrenda(TipoPrenda tipoDePrenda) {
		this.tipoDePrenda = tipoDePrenda;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getValorSegunEstado() {
		return this.valor;
				
	}


	
	

}
