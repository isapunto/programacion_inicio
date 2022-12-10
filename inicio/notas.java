//Pedir a una persona su nombre y notas y decirle si esta suspenso, suficiente,
//bien, notable o sobresaliente
import java.util.Scanner;

public class notas {
  public static String calcularNotaFinal(double nota){
    String notaFinal;
    if (nota < 5) {
      notaFinal = "suspenso";
    } else if (nota < 6){
      notaFinal = "suficiente";
    } else if (nota < 7){
      notaFinal = "bien";
    } else if (nota < 9){
      notaFinal = "notable";
    } else {
      notaFinal = "sobresaliente";
    }
    return notaFinal;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nombre;
    String salida = "n";
    double nota = 0;

    System.out.println("Dime tu nombre: ");
    nombre = sc.nextLine();
    while(salida.equals("n")){
      System.out.println("Dime tu nota: ");
      nota = Double.parseDouble(sc.nextLine());
      System.out.println(nombre + ", tu nota es: " + nota);
      System.out.println(calcularNotaFinal (nota));
      System.out.println("Quieres salir? y/n: ");
      salida = sc.nextLine();
    }

  }

}
