import java.util.ArrayList;

public class Lista 
{
	ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Lista()
	{
		
	}

	public void add(Producto producto) 
	{
		productos.add(producto);
	}

	public String mostrarCompras() 
	{
		String paraMostrar = "";
		for(int i=0;i<productos.size();i++)
		{
			Producto producto = productos.get(i);
			paraMostrar += producto.toString()+"\n";
		}
		return paraMostrar;
	}

	public String mostrarComprasMasItem() 
	{
		String paraMostrar = "";
		for(int i=0;i<productos.size();i++)
		{
			Producto producto = productos.get(i);
			Entero cant = producto.getCantidad();
			String cantidad = ""+cant.valor;
			paraMostrar = paraMostrar + (cantidad+" -"+producto.toString()+"\n");
		}
		return paraMostrar;
	}

	public String mostrarComprasMasItemMasMedida() 
	{
		String paraMostrar = "";
		for(int i=0;i<productos.size();i++)
		{
			Producto producto = productos.get(i);
			Entero cant = producto.getCantidad();
			String medida = producto.getMedida();
			String cantidad = ""+cant.valor;
			paraMostrar = paraMostrar + (cantidad+" "+medida+" -"+producto.toString()+"\n");
		}
		return paraMostrar;
	}

	public String mostrarComprasMasItemMasMedidaMasPromocion() 
	{
		String paraMostrar = "";
		for(int i=0;i<productos.size();i++)
		{
			Producto producto = productos.get(i);
			Entero cant = producto.getCantidad();
			String medida = producto.getMedida();
			String cantidad = ""+cant.valor;
			paraMostrar = paraMostrar + (cantidad+" "+medida+" -"+producto.toString()+"\n");
		}
		return paraMostrar;
	}
}
