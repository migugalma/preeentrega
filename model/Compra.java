package model;

public class Compra {
	//Generacion de atributos
	// private static int nroODP = 1;
	private String codigoProducto;
	private String nombre;
	private String marca;
	private String proveedor;
	private double costoUnitario;
	private int cantidad;
	private double costoTotal;
	
	//Metodos propios
	
	public double calcularTotal () {
		this.costoTotal = this.costoUnitario * this.cantidad;
		return costoTotal;
	}
	
	//Getters
	
	public String getCodigoProducto () {
		return codigoProducto;
	}

	public String getNombre () {
		return nombre;
	}	
	
	public String getMarca () {
		return marca;
	}

	public String getProveedor () {
		return proveedor;
	}

	public double getCostoUnitario () {
		return costoUnitario;
	}

	public int getCantidad () {
		return cantidad;
	}
	
	public double getCostoTotal () {
		return costoTotal;
	}
	
	// Setters
	
	public void setCodigoProducto (String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public void setNombre (String nombre) {
		this.nombre = nombre;
	}	
	
	public void setMarca (String marca) {
		this.marca = marca;
	}

	public void setProveedor (String proveedor) {
		this.proveedor = proveedor;
	}

	public void setCostoUnitario (double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}

	public void setCantidad (int cantidad) {
		this.cantidad = cantidad;
	}

}

