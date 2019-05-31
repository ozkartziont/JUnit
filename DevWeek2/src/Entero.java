
public class Entero 
{
	int valor;
	
	public Entero(int valor)
	{
		this.valor = valor;
	}

	public void sumar(Entero venta) 
	{
		valor +=venta.valor;
	}
	public void multiplicar(Entero precio, Entero cantidad)
	{
		valor +=precio.valor*cantidad.valor;
	}
	public void restar(Entero resta)
	{
		valor -=resta.valor;
	}
	public Entero dividir(Entero promocion)
	{
		Entero division = new Entero(0);
		division.valor = valor/promocion.valor;
		return division;
	}

}
