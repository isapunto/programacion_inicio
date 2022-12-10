import java.util.Scanner;

public class presentaciones {

  public static String bienvenidoCasa(String nom, String gen) {
    String frase = bienvenido(nom, gen);
    frase += (" a casa.");
    return frase;
  }
  public static String bienvenido(String nom, String gen) {
    String frase = "Hola " + nom + ", bienvenido";
    if (gen.equals("F")){
      frase = "Hola " + nom + ", bienvenida";
    }
    return frase;
  }
  public static String bienvenidoEmpresa(String nom, String gen, String empresa) {
    String frase = bienvenido(nom, gen);
    frase += (" a " + empresa);
    return frase;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nombre;
    String genero;
    String saludo;
    String empresa;

    System.out.println("Como te llamas? ");
    nombre = sc.nextLine();
    System.out.println("Indica tu genero (M/F): ");
    genero = sc.nextLine();
    // saludo = bienvenidoCasa (nombre, genero);
    // System.out.println(saludo);
    System.out.println("Como se llama tu empresa?");
    empresa = sc.nextLine();
    saludo = bienvenidoEmpresa (nombre, genero, empresa);
    System.out.println(saludo);

  }

}
