package org;

import java.util.*;

public class Venta {
	
	private String id;
	
	private Collection<Prenda> prendas;
	
	private Date fechaVenta;
	
	private String formaDePago;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Collection<Prenda> getPrendas() {
		return prendas;
	}

	public void setPrendas(Collection<Prenda> prendas) {
		this.prendas = prendas;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	
	

}
