package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity    
@Table(name="tb_productos")


public class Producto {
	
	@Id
	@Column(name="idprod")
	private String codigo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="precio")
	private String precio;
	
	@Column(name="idcategoria")
	private int categoria;
	
	@Column(name="estado")
	private int estado;
	
	
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", stock=" + stock + ", precio=" + precio
				+ ", categoria=" + categoria + ", estado=" + estado + "]";
	}
	
	
	public Producto() {
		super();
		
		
	}
	
	
	public Producto(String codigo, String descripcion, int stock, String precio, int categoria, int estado) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
		this.categoria = categoria;
		this.estado = estado;
		
		
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	

}
