package model;

public class Venta {
	//Generacion de atributos
	//private static int nroFactura = 1;
	private String codigoProducto;
	private String nombre;
	private String marca;
	private String cliente;
	private double precioUnitario;
	private int cantidad;
	private double precioTotal;
	
	
	//Metodos propios
	
	public double precioTotal () {
		this.precioTotal = this.precioUnitario * this.cantidad;
		return precioTotal;
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

	public String getCliente () {
		return cliente;
	}

	public double getPrecioUnitario () {
		return precioUnitario;
	}

	public int getCantidad () {
		return cantidad;
	}
	
	public double getprecioTotal () {
		return precioTotal;
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

	public void setCliente (String cliente) {
		this.cliente = cliente;
	}

	public void setPrecioUnitario (double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public void setCantidad (int cantidad) {
		this.cantidad = cantidad;
	}
	
}
	
	//Metodos de autocompletado en Venta
