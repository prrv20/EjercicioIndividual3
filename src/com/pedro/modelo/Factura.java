package com.pedro.modelo;
import java.util.ArrayList;
import java.util.List;

public class Factura {

	public int idfactura;
	public String nombrecliente;
	public String fecha;
	public double subtotal;
	public int impuesto;
	public int total;
	public List<Item> listitems;
	
	public Factura() {
		this.idfactura = 0;
		this.nombrecliente = "";
		this.fecha = "";
		this.subtotal = 0;
		this.impuesto = 0;
		this.total = 0;
	}


	public int getIdfactura() {
		return idfactura;
	}
	public void setIdfactura(int idfactura) {
		this.idfactura = idfactura;
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public int getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Item> getListitems() {
		return listitems;
	}
	public void setListitems(List<Item> listitems) {
		this.listitems = listitems;
	}
}
