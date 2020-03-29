package org;

import java.math.*;
import java.util.*;

public class Tarjeta extends MediosDePago{
	
	private int cantidadCuotas;
	
	private BigDecimal interes;
	
	private Collection<Prenda> prendasVendidas;
	
	public void setCantidadCuotas(int cantidad){
		cantidadCuotas = cantidad;
	}
	
	public int getCantidadCuotas(){
		return cantidadCuotas;
	}

	public BigDecimal pago(BigDecimal importe){
		BigDecimal cantidadCutoasBD = new BigDecimal(this.getCantidadCuotas());
		BigDecimal importeTotal = cantidadCutoasBD.multiply(this.getInteres()).add(this.CalculadorPorPrenda()); 
		return importeTotal;		
	}

	private BigDecimal CalculadorPorPrenda() {
		BigDecimal resultado = BigDecimal.ZERO;
		prendasVendidas.stream().forEach(prenda -> { resultado.add(prenda.getValor().multiply(new BigDecimal(0.01))); });
		return resultado;
	}

	private void setInteres(BigDecimal _interes) {
		interes = _interes;
	}
	
	private BigDecimal getInteres() {
		return interes;
	}
	
}
