import java.util.Scanner;

public class dia1_tiposDeDatos {
	public static void saludo(){
		System.out.println("Hola mundo!");
		System.out.println("Hola " + "mundo!");
		System.out.println(2 + 3);
		System.out.println("Hola " + 3 + 2);
		System.out.println(3 + 2 + "Hola ");
	}
	public static void variables(){
		String datoString = "Hola";
		int datoInt = 100;
		double datoDouble = 1.0;
		char datoChar = 'a';
		char datoCharNumero = 98;
		boolean datoBool = true;
		System.out.println(datoInt + datoDouble);
		System.out.println(datoInt + datoChar);
		System.out.println(datoChar + datoInt);
		System.out.println(datoChar + datoDouble);
		System.out.println(datoChar);
		System.out.println(datoChar + datoString);
		System.out.println(datoString + datoChar);
		System.out.println(datoCharNumero);
		// No se puede porque char es más pequeño que int:
		// datoChar = datoInt;
		// System.out.println(datoChar);
		datoInt = datoChar;
		System.out.println(datoInt);
		// No se puede porque int es más pequeño que double:
		// datoInt = datoDouble;
		// System.out.println(datoInt);
		datoDouble = datoInt;
		System.out.println(datoDouble);
		// No se puede porque String es una estructura compleja, no un dato simple.
		// datoString = datoChar;
		// System.out.println(datoString);
		// Aunque en otros lenguajes de programación el 0 en un bool indica False,
		// para java son tipos incompatibles.
	  // datoBool = 0;
		// System.out.println(datoBool);
	}
	public static void main(String[] args) {
		//saludo();
		//variables();
	}
}
