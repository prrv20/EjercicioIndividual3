package com.pedro.modelo;

public class Item {

	private int iditem;
	private String nombre;
	private int precio;
	private int cantidad;
	
	public Item() {
		this.iditem = 0;
		this.nombre = "";
		this.precio = 0;
		this.cantidad = 0;
	}
	
	public int getIditem() {
		return iditem;
	}
	
	public void setIditem(int iditem) {
		this.iditem = iditem;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
