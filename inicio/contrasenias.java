import java.util.Scanner;

public class contrasenias{
  public static void comprobarContrasenia(String contras) {
    Scanner sc = new Scanner(System.in);
    String cont;

    System.out.print("Vuelva a escribir la contrasenia: ");
    cont = sc.nextLine();

    while (!cont.equals(contras)) {
      System.out.println("Error: las contrasenias no coinciden.");
      System.out.print("Repite la contrasenia: ");
      cont = sc.nextLine();
    }
    System.out.println("Las contrasenas coinciden.");
  }

  public static boolean comparar (String palabra1, String palabra2){
    boolean iguales = true;
    if(palabra1.equals(palabra2)){
      iguales = true;
    }else{
      iguales = false;
    }
    return iguales;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String contrasenia;
    String palabra1, palabra2;
    boolean resultadoComparar;

    //System.out.println("Introduce una contrasenia: ");
    //contrasenia = sc.nextLine();
    //comprobarContrasenia(contrasenia);
    System.out.println("Introduce una palabra: ");
    palabra1 = sc.nextLine();
    System.out.println("Introduce otra palabra: ");
    palabra2 = sc.nextLine();

    resultadoComparar = comparar(palabra1, palabra2);
    System.out.println(resultadoComparar);
}

}
