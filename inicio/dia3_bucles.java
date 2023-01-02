import java.util.Scanner;

public class dia3_bucles{
  public static void bucleContador(int numero){
    // for  (creamos el contador. Solo una vez ; Condición ; Lo que
    //      queremos que ocurra en cada iteración.)
    System.out.println("Imprimimos bucle FOR de contador: ");
    for (int i=0;i<numero;i++){
      System.out.println(i);
    }
    // Solo tenemos la condición, por lo que tenemos que inicializar
    // el contador e incrementar de "forma manual".
    System.out.println("Imprimimos bucle WHILE de contador: ");
    int i=0;
    while (i<numero){
      System.out.println(i);
      i++;
    }
    // Igual que el while pero simpre se ejecuta al menos una vez.
    System.out.println("Imprimimos bucle DO WHILE de contador: ");
    i=0;
    do {
      System.out.println(i);
      i++;
    } while(i<numero);
    //En este caso lo ideal es utilizar el BUCLE FOR.

  }
  // Bucle creciente de 0 hasta el número introducido, de dos en dos.
  public static void bucleContadorDe2En2HastaNumero(int numero){}
  // Bucle decreciente de 100 al número menor que 100 introducido.
  // EXTRA: Controlar que el número sea menor que 100.
  public static void bucleContadorDe100AlNumero(int numero){}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.println("Introduce un numero: ");
    numero = Integer.parseInt(sc.nextLine());
    bucleContador(numero);

  }

}
