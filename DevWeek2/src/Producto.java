
public class Producto 
{
	private String nombre;
	private Entero precio;
	private Entero cantidad;
	private String medida;
	private Entero promocion;
	
	public Producto(String nombre, Entero precio)
	{
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = new Entero(1);
		this.medida = "";
		this.promocion = new Entero(10);
	}
	public Producto(String nombre, Entero precio, Entero cantidad)
	{
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.medida = "";
		this.promocion = new Entero(10);
	}
	public Producto(String nombre, Entero precio, Entero cantidad, String medida)
	{
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.medida = medida;
		this.promocion = new Entero(10);
	}
	public Producto(String nombre, Entero precio, Entero cantidad, String medida, Entero promocion)
	{
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.medida = medida;
		this.promocion = promocion;
	}
	
	public Entero getPrecio()
	{
		return precio;
	}
	public Entero getCantidad()
	{
		return cantidad;
	}
	public int getPrecioPorCantidad()
	{
		return precio.valor*cantidad.valor;
	}
	@Override
	public String toString()
	{
		return " "+nombre+" - Bs "+precio.valor;
	}
	public String getMedida() 
	{
		return medida;
	}
	public Entero getPromocion() 
	{
		return promocion;
	}

}
