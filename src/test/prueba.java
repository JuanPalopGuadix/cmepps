package test;

import pkg.*;
import pkg.Empleado.TipoEmpleado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class prueba {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBrutaVendedor() {
		float expected = 2000; 
		float actual =	Empleado. calculoNominaBruta(TipoEmpleado.VENDEDOR,0,0);
		assertEquals(expected,actual);
	}

	@Test
	void testCalculoNominaBrutaEncargado() {
		float expected =2500; 
		float actual =	Empleado. calculoNominaBruta(TipoEmpleado.ENCARGADO,0,0);
		assertEquals(expected,actual);
	}

	@Test
	void testCalculoNominaBrutaOtro() {
		float expected =0; 
		float actual =	Empleado. calculoNominaBruta(null,0,0);
		assertEquals(expected,actual);
	}

	@Test
	void testCalculoNominaBrutaVentasNegativas() {
		float expected =2000; 
		float actual =	Empleado.calculoNominaBruta(TipoEmpleado.VENDEDOR,-1,0);
		assertEquals(expected,actual);
	}

	@Test
	void testCalculoNominaBrutaVentasEntre0y1000() {
		float expected =2000; 
		float actual =	Empleado. calculoNominaBruta(TipoEmpleado.VENDEDOR,10,0);
		assertEquals(expected,actual);
	}

	@Test
	void testCalculoNominaBrutaVentasEntre1000y1500() {
		float expected =2100; 
		float actual =	Empleado. calculoNominaBruta(TipoEmpleado.VENDEDOR,1050,0);
		assertEquals(expected,actual);
	}

	@Test
	void testCalculoNominaBrutaVentasMayor1500() {
		float expected =2200; 
		float actual =	Empleado. calculoNominaBruta(TipoEmpleado.VENDEDOR,1550,0);
		assertEquals(expected,actual);
	}

	@Test
	void testCalculoNominaBrutaHorasExtraNegativas() {
		float expected =2000; 
		float actual =	Empleado. calculoNominaBruta(TipoEmpleado.VENDEDOR,0,-1);
		assertEquals(expected,actual);
	}

	@Test
	void testCalculoNominaBrutaHorasExtraPositivas() {
		float expected =2030; 
		float actual =	Empleado. calculoNominaBruta(TipoEmpleado.VENDEDOR,0,1);
		assertEquals(expected,actual);
	}

	@Test
	void testCalculoNominaNetaMenor2000() {
		float expected = 1900; 
		float actual =	Empleado.calculoNominaNeta(1900);
		assertEquals(expected,actual);
	}

	void testCalculoNominaNetaEntre2001y2500() {
		float expected = 2001*(1-0.15f);// 1700.85
		float actual =	Empleado.calculoNominaNeta(2001);
		assertEquals(expected,actual);
	}

	void testCalculoNominaNetaMayor2500() {
		float expected = 2550 *(1-0.18f); //2091
		float actual =	Empleado.calculoNominaNeta(2550);
		assertEquals(expected,actual);
	}

}
