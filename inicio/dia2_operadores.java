public class dia2_operadores {
  public static void operadores() {
    double num1 = 1;
    double num2 = 2;
    double suma = num1 + num2;

    System.out.println(suma);
    System.out.println(num1 - num2);
    System.out.println(num1 / num2);
    System.out.println(num1 * num2);
    System.out.println(num1 % num2);
    // System.out.println(num1 ^ num2);

    // suma = suma + num2
    suma += num2;
    System.out.println(suma);
    suma -= num2;
    System.out.println(suma);
  }

  public static void jugandoConString(){
    String frase = "java es un asco";
    System.out.println("La frase elegida es: " + frase);
    System.out.println("La longitud de la frase es: " + frase.length());
    System.out.println("Ahora gritando: " + frase.toUpperCase());
    System.out.println("La palabra asco empieza en la posicion: " + frase.indexOf("asco"));
  }

  public static void main(String[] args) {
    //operadores();
    jugandoConString();
  }

}
