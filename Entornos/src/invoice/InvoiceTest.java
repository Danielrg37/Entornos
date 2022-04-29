package invoice;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class InvoiceTest {
	
	Invoice invoice = new Invoice(300);
	
	
	
	@Test
	void TestIvaRedu() {
		invoice.iva_21();
		assertTrue(invoice.getTotal() == 363);
	}
	
	
	@Test
	void TestIva() {
		invoice.iva_04();
		assertTrue(invoice.getTotal() == 312);
		}
	
	@Test
	void TestDescuentoEsp() {
		invoice.descuento_VIP();
		assertTrue(invoice.getTotal() == 270);
	}

}
