package main.java.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestCadena {

	@ValueSource(strings= {"ronor","apapa"})
	@ParameterizedTest
	void AnagramaTestString(String valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esAnagrama(), true);
	}
	
	@ValueSource(strings= {"ronor","apapa"})
	@ParameterizedTest
	void AnagramaTestStringValorExterno(String valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esAnagrama(valor), true);
	}
	
	
	@ValueSource(ints = {121,4552})
	@ParameterizedTest
	void esCapicuaTest(int valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esCapicua(), true);
	}
	
	@ValueSource(doubles = {12.21,23.32})
	@ParameterizedTest
	void esCapicuaCadenaTestDouble(double valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esCapicua(valor), true);
	}
	
	@ValueSource(longs = {1222221,322222223})
	@ParameterizedTest
	void esCapicuaCadenaTestLong(Long valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esCapicua(valor), true);
	}
	
	@ValueSource(strings= {""," "})
	@ParameterizedTest
	void esAnagramaTestStringsVacio(String valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esAnagrama(), false);
	}
	
	@ValueSource(strings= {"hola","batman"})
	@ParameterizedTest
	void esAnagramaTestFalso(String valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esAnagrama(), false);
	}
	
	@ValueSource(strings= {" ana     "})
	@ParameterizedTest
	void esCapicuaCadenaTestconStringSeaNulo(String valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esAnagrama(), false);
	}
	

}

