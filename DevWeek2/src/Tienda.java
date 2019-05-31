import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tienda 
{
	// Fist Step
	@Test
	public void testImporteTotalCompraSinProductos() 
	{
		Factura factura = new Factura();
		Entero valorEsperado = new Entero(0);
		Entero valorCalculado = factura.importeTotal();
		assertEquals(valorEsperado.valor, valorCalculado.valor);
	}
	
	@Test
	public void testImportTotalCompraUnProducto()
	{
		Factura factura = new Factura();
		factura.comprar(new Producto("Pan", new Entero(1)));
		Entero valorEsperado = new Entero(1);
		Entero valorCalculado = factura.importeTotal();
		assertEquals(valorEsperado.valor, valorCalculado.valor);
	}
	@Test
	public void testImporteTotalCompraEjemplos()
	{
		Factura factura = new Factura();
		factura.comprar(new Producto("Pan", new Entero(1)));
		factura.comprar(new Producto("Fideos", new Entero(5)));
		factura.comprar(new Producto("Bolsa de leche", new Entero(6)));
		
		Entero valorEsperado = new Entero(12);
		Entero valorCalculado = factura.importeTotal();
		assertEquals(valorEsperado.valor, valorCalculado.valor);
		
	}
	
	// Second Step
	// Test for to show the sales.
	@Test
	public void testImporteTotalComprasMostrar()
	{
		Factura factura = new Factura();
		factura.comprar(new Producto("Pan", new Entero(1)));
		factura.comprar(new Producto("Fideos", new Entero(5)));
		factura.comprar(new Producto("Bolsa de leche", new Entero(6)));
		
		String valorEsperado = " Pan - Bs 1\n Fideos - Bs 5\n Bolsa de leche - Bs 6\n";
		String valorCalculado = factura.mostrar();
		assertEquals(valorEsperado, valorCalculado);
		
	}
	// Test for to show the total sales.
	@Test
	public void testImporteTotalMostrar()
	{
		Factura factura = new Factura();
		factura.comprar(new Producto("Pan", new Entero(1)));
		factura.comprar(new Producto("Fideos", new Entero(5)));
		factura.comprar(new Producto("Bolsa de leche", new Entero(6)));
		
		String valorEsperado = " Pan - Bs 1\n Fideos - Bs 5\n Bolsa de leche - Bs 6\nTotal - Bs 12\n";
		String valorCalculado = factura.mostrarTotal();
		assertEquals(valorEsperado, valorCalculado);
		
	}
	// Third Step
	// Test for to add amount of items all sales.
	@Test
	public void testImporteTotalMostrarMasItems()
	{
		Factura factura = new Factura();
		factura.comprar(new Producto("Pan", new Entero(1), new Entero(3)));
		factura.comprar(new Producto("Fideos", new Entero(5), new Entero(2)));
		factura.comprar(new Producto("Bolsa de leche", new Entero(6), new Entero(1)));
		
		String valorEsperado = "3 - Pan - Bs 1\n2 - Fideos - Bs 5\n1 - Bolsa de leche - Bs 6\nTotal - Bs 19";
		String valorCalculado = factura.mostrarTotalMasItem();
		//System.out.println(valorCalculado);
		assertEquals(valorEsperado, valorCalculado);
	}
	// Fourt Step
	// Test for to add unit measurements for all sales.
	@Test
	public void testImporteTotalMostrarMasItemsMasMedida()
	{
		Factura factura = new Factura();
		factura.comprar(new Producto("Pan", new Entero(1), new Entero(3),"u"));
		factura.comprar(new Producto("Fideos", new Entero(5), new Entero(2),"kg"));
		factura.comprar(new Producto("Bolsa de leche", new Entero(6), new Entero(1),"lt"));
		
		String valorEsperado = "3 u - Pan - Bs 1\n2 kg - Fideos - Bs 5\n1 lt - Bolsa de leche - Bs 6\nTotal - Bs 19";
		String valorCalculado = factura.mostrarTotalMasItemMasMedida();
		//System.out.println(valorCalculado);
		assertEquals(valorEsperado, valorCalculado);
	}
	// Fifth Step
	// Test for to add promotions each products
	@Test
	public void testImporteTotalMostrarMasItemsMasMedidaMasPromocion()
	{
		Factura factura = new Factura();
		factura.comprarConPromocion(new Producto("Pan", new Entero(1), new Entero(6),"u",new Entero(5)));
		factura.comprarConPromocion(new Producto("Fideos", new Entero(5), new Entero(2),"kg",new Entero(6)));
		factura.comprarConPromocion(new Producto("Bolsa de leche", new Entero(6), new Entero(1),"lt",new Entero(10)));
		
		//String valorEsperado = "6 u - Pan - Bs 1\nTotal - Bs 5";
		String valorEsperado = "6 u - Pan - Bs 1\n2 kg - Fideos - Bs 5\n1 lt - Bolsa de leche - Bs 6\nTotal - Bs 21";
		String valorCalculado = factura.mostrarTotalMasItemMasMedidaMasPromocion();
		//System.out.println(valorCalculado);
		assertEquals(valorEsperado, valorCalculado);
	}
	// Test for to show only the total of sales.
	@Test
	public void testOnlyImporteTotal()
	{
		Factura factura = new Factura();
		factura.comprarConPromocion(new Producto("Pan", new Entero(1), new Entero(6),"u",new Entero(5)));
		factura.comprarConPromocion(new Producto("Fideos", new Entero(5), new Entero(2),"kg",new Entero(6)));
		factura.comprarConPromocion(new Producto("Bolsa de leche", new Entero(6), new Entero(1),"lt",new Entero(10)));
		
		String valorEsperado = "Total - Bs 21";
		String valorCalculado = factura.mostrarOnlyImporteTotal();
		System.out.println(valorCalculado);
		assertEquals(valorEsperado, valorCalculado);
	}
	
}
