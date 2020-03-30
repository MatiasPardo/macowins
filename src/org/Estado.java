package org;

import java.math.*;
import java.util.*;

public class Estado {
	
	private Collection<Estado> estados;
	
	private TipoEstado tipoEstado;

	public Collection<Estado> getEstados() {
		return estados;
	}

	public void setEstados(Estado estado) {
		this.estados.add(estado);
	}
	
	public void hacerEfecto(Prenda prenda, BigDecimal parametroFijo){
		
		estados.stream().forEach(estado -> {
			if(estado.getTipoEstado().equals(TipoEstado.Promocion)){
				prenda.setValor(prenda.getValor().subtract(parametroFijo));
			}else prenda.setValor(prenda.getValor().multiply(new BigDecimal(0.5)));
		});
	}

	public TipoEstado getTipoEstado() {
		return tipoEstado;
	}

	public void setTipoEstado(TipoEstado tipoEstado) {
		this.tipoEstado = tipoEstado;
	}

	public void setEstados(Collection<Estado> estados) {
		this.estados = estados;
	}

	

}
