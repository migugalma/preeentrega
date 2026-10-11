package model;

// Se va a crear clase padre Producto los distintas categorias

public abstract class Producto {
	protected String codigoProducto;
	protected String nombre;
	protected String marca;
	protected int stockMinimo;
	protected double costo;
	
	
	// Construcctor de la clase padre
	
	
	public Producto (String codigoProducto, String nombre, String marca, int stockMinimo, double costo) {
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.marca = marca;
		this.stockMinimo= stockMinimo;
		this.costo = costo;
	}

		
	// Se va a calcular el precio en base de un costo 
	
	public abstract double calcularPrecio ();
	
	public abstract void mostrarResultado();
	
	public abstract String asignarCATEGORIA();
	
	public abstract String conversor();
	
	//Creacion de getters abstractos
	
	public abstract String getCodigoProducto();
	public abstract String getNombre();
	public abstract String getMarca();
	//public abstract String getCATEGORIA();
	public abstract int getStockMinimo();
	public abstract double getCosto();
	
	//Creacion de setters abstractos
	
	public abstract void setCodigoProducto(String codigoProducto);
	public abstract void setNombre(String nombre);
	public abstract void setMarca( String marca);
	//public abstract void setCATEGORIA(String CATEGORIA);
	public abstract void setStockMinimo( int stockMinimo);
	public abstract void setCosto(double costo);
	
}

//Categoria Utensillos

public class Utensillo extends Producto {
	public static final String CATEGORIA = "Utensillo";
	private double diametro;
	private boolean conMango;
	private double precio;
	public static final double RENTABILIDAD = 0.2;
	private String agarre;
	
	//Constructor solo para iniciar los datos 
	
	public Utensillo (String codigoProducto, String nombre, String marca, int stockMinimo, double costo,
	double diametro, boolean conMango) {
		super(codigoProducto, nombre, marca, stockMinimo, costo);
		this.diametro = diametro;
		this.conMango = conMango;
	}
	
	
	
	// Metodos propios
	
	@Override
	public double calcularPrecio() {
		this.precio = this.costo * ( 1+ RENTABILIDAD);
		return precio;
	}
	
	// Metodo que convierte los datos de booleanos a texto
	@Override
	public String conversor () {
		if (conMango == true) {
			agarre = "Mango";
		}
		else {
			agarre = "Asas";
		}
		return agarre;
	}
	
	@Override
	public String asignarCATEGORIA() {
		return CATEGORIA;
	}	
	
	@Override
	public void mostrarResultado() {
		System.out.println("Codigo: " + codigoProducto);
		System.out.println("Categoria: " + CATEGORIA);
		System.out.println ("Producto: " + nombre);
		System.out.println ("Marca: " + marca);
		System.out.println("Costo unitario: " + costo);
		System.out.println("Precio unitario: " + precio);
		System.out.println("Diametro: " + diametro + " cm");
		System.out.println("Forma de sujecion: " + agarre);
	}	 

	// Getters de la clase Utensillos - Producto
	
	@Override
	public String getCodigoProducto() {
		return codigoProducto;
	}
		
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String getMarca() {
		return marca;
	}
	/*	
	@Override	
	public String getCATEGORIA() {
		return CATEGORIA;
	}
	*/
	@Override
	public int getStockMinimo() {
		return stockMinimo;
	}
	
	@Override
	public double getCosto() {
		return costo;
	}

	//Setters de la categoria Utensillo - Producto
	
	@Override
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
		
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre ;
	}
	
	@Override
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/*	
	@Override	
	public void setCATEGORIA(String CATEGORIA) {
		this.CATEGORIA = CATEGORIA;
	}
	*/
	@Override
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	
	@Override
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public void setConMango(boolean conMango) {
		this.conMango = conMango;
	}

}


// Categoria Cubiertos

public class Cubierto extends Producto {
	public static final String CATEGORIA = "Cubierto";
	private String tamano;
	private boolean mangoMetal;
	private double precio;
	public static final double RENTABILIDAD = 0.3;
	private String mango;
	
	//Constructor
	public Cubierto (String codigoProducto, String nombre, String marca, int stockMinimo, double costo,
	String tamano, boolean mangoMetal) {
		super(codigoProducto, nombre, marca, stockMinimo, costo);
		
		this.tamano = tamano;
		this.mangoMetal = mangoMetal;
	}
	
	
	//Metodos propios
	@Override
	public double calcularPrecio() {
		this.precio = this.costo * ( 1+ RENTABILIDAD);
		return precio;
	}
	
	// Metodo que convierte los datos de booleanos a texto
	@Override
	public String conversor () {
		if (mangoMetal == true) {
			mango = "Acero inoxidable";
		}
		else {
			mango = "Madera";
		}
		return mango;
	}
	
	@Override
	public String asignarCATEGORIA() {
		return CATEGORIA;
	}	
	
	//Metodo para mostrar los resultados en consola
	@Override
	public void mostrarResultado() {
		System.out.println("Codigo: " + codigoProducto);
		System.out.println("Categoria: " + CATEGORIA);
		System.out.println ("Producto: " + nombre);
		System.out.println ("Marca: " + marca);
		System.out.println("Costo unitario: " + costo);
		System.out.println("Precio unitario: " + precio);
		System.out.println("Tamaño: " + tamano);
		System.out.println("Mango: " + mango);
	}	

	// Getters de la clase Cubierto - Producto
	
	@Override
	public String getCodigoProducto() {
		return codigoProducto;
	}
		
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String getMarca() {
		return marca;
	}
	/*	
	@Override	
	public String getCATEGORIA() {
		return CATEGORIA;
	}
	*/
	@Override
	public int getStockMinimo() {
		return stockMinimo;
	}
	
	@Override
	public double getCosto() {
		return costo;
	}

	//Setters de la categoria Cubierto - Producto
	
	@Override
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
		
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre ;
	}
	
	@Override
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/*	
	@Override	
	public void setCATEGORIA(String CATEGORIA) {
		this.CATEGORIA = CATEGORIA;
	}
	*/
	@Override
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	
	@Override
	public void setCosto(double costo) {
		this.costo = costo;
	}

}

//Categoria Recipientes

public class Recipiente extends Producto {
	public static final String CATEGORIA = "Recipiente";
	private double capacidad;
	private boolean esVidrio;
	private double precio;
	public static final double RENTABILIDAD = 0.4;
	private String material;
	
	//Constructor
	public Recipiente (String codigoProducto, String nombre, String marca, int stockMinimo, double costo,
	double capacidad, boolean esVidrio) {
		super(codigoProducto, nombre, marca, stockMinimo, costo);
		this.capacidad = capacidad;
		this.esVidrio = esVidrio;
	}
	
	
	//Metodos propios
	@Override
	public double calcularPrecio() {
		this.precio = this.costo * ( 1+ RENTABILIDAD);
		return precio;
	}
	
	// Metodo que convierte los datos de booleanos a texto
	@Override
	public String conversor () {
		if (esVidrio == true) {
			material = "Vidrio";
		}
		else {
			material = "Porcelana";
		}
		return material;
	}

	@Override
	public String asignarCATEGORIA() {
		return CATEGORIA;
	}	
	
	//Metodo para mostrar los resultados en consola
	@Override
	public void mostrarResultado() {
		System.out.println("Codigo: " + codigoProducto);
		System.out.println("Categoria: " + CATEGORIA);
		System.out.println ("Producto: " + nombre);
		System.out.println ("Marca: " + marca);
		System.out.println("Costo unitario: " + costo);
		System.out.println("Precio unitario: " + precio);
		System.out.println("Capacidad: " + capacidad + " ml");
		System.out.println("Material: " + material);
	}	

	// Getters de la clase Recipiente - Producto
	
	@Override
	public String getCodigoProducto() {
		return codigoProducto;
	}
		
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String getMarca() {
		return marca;
	}
	/*	
	@Override	
	public String getCATEGORIA() {
		return CATEGORIA;
	}
	*/
	@Override
	public int getStockMinimo() {
		return stockMinimo;
	}
	
	@Override
	public double getCosto() {
		return costo;
	}

	//Setters de la categoria Recipiente - Producto
	
	@Override
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
		
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre ;
	}
	
	@Override
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/*	
	@Override	
	public void setCATEGORIA(String CATEGORIA) {
		this.CATEGORIA = CATEGORIA;
	}
	*/
	@Override
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	
	@Override
	public void setCosto(double costo) {
		this.costo = costo;
	}
}
		