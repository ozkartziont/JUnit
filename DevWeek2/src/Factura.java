
public class Factura 
{
	Entero venta = new Entero(0);
	Lista listaProductos = new Lista();

	public Entero importeTotal() 
	{
		return venta;
	}

	public void comprar(Producto producto) 
	{
		Entero precio = producto.getPrecio();
		Entero cantidad = producto.getCantidad();
		venta.multiplicar(precio,cantidad);
		listaProductos.add(producto);
		
	}
	public void comprarConPromocion(Producto producto) 
	{
		Entero precio = producto.getPrecio();
		Entero cantidad = producto.getCantidad();
		Entero promocion = producto.getPromocion();

		Entero descuento = cantidad.dividir(promocion);
		venta.multiplicar(precio,cantidad);
		venta.restar(descuento);
		listaProductos.add(producto);
	}

	public String mostrar() 
	{
		return listaProductos.mostrarCompras();
	}

	public String mostrarTotal() 
	{
		String total = "Total - Bs "+venta.valor+"\n";
		return listaProductos.mostrarCompras()+total;
		
	}

	public String mostrarTotalMasItem() 
	{
		String total = "Total - Bs "+venta.valor;
		return listaProductos.mostrarComprasMasItem()+total;
	}

	public String mostrarTotalMasItemMasMedida() 
	{
		String total = "Total - Bs "+venta.valor;
		return listaProductos.mostrarComprasMasItemMasMedida()+total;
	}

	public String mostrarTotalMasItemMasMedidaMasPromocion() 
	{
		String total = "Total - Bs "+venta.valor;
		return listaProductos.mostrarComprasMasItemMasMedidaMasPromocion()+total;
	}

	public String mostrarOnlyImporteTotal() 
	{
		return "Total - Bs "+venta.valor;
	}

}
