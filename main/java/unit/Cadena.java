package main.java.unit;

public class Cadena {

	private Object contenido;
	
	
	public Cadena(Object contenido) {
		this.contenido = contenido;
	}
	
	
	
	public boolean esAnagrama() {
		
		boolean anagrama = false;
		String content = this.contenido instanceof String? (String) contenido: null;
		
		if(content!=null && !content.isEmpty()	&& !content.trim().isEmpty()) {
			anagrama = true;
			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isAlphabetic(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					anagrama = false;
				}
			}
		}
		return anagrama;
		
	}
	
	
	public boolean esAnagrama(String cadena) {
		
		boolean anagrama = false;
		String content = cadena instanceof String? (String) cadena: null;
		
		if(content!=null && !content.isEmpty()	&& !content.trim().isEmpty()) {
			anagrama = true;
			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isAlphabetic(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					anagrama = false;
				}
			}
		}
		return anagrama;
		
	}
	
	/**
	 * He cambiado dentro del ternario "instanceof Integer" a "instancef Number"
	 * cubriendo asi todas las funcionalidades anteriores suprimiendo bastante codigo.
	 */
	public boolean esCapicua() {
		
		String content = this.contenido instanceof Number? String.valueOf(this.contenido): null;
		boolean capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}
		return capicua;
		
	}
	
	public boolean esCapicua(Number numero) {
		
		String content = numero instanceof Number? String.valueOf(numero): null;
		boolean capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}
		return capicua;
		
	}
}
