import java.util.Scanner;

public class dia3_bucles{
  public static void bucleContrasenia(String contri){
    Scanner sc = new Scanner(System.in);
    String confirm;

    /*
    confirm = "";
    for (; !contri.equals(confirm) ;){
      System.out.println("Escribe la confirmacion de la contrasenia: ");
      confirm = sc.nextLine();
    }
    */

    /*
    confirm = "";
    while (!contri.equals(confirm)){
      System.out.println("Escribe la confirmacion de la contrasenia: ");
      confirm = sc.nextLine();
    }
    */

    do {
      System.out.println("Escribe la confirmacion de la contrasenia: ");
      confirm = sc.nextLine();
    } while (!contri.equals(confirm));
  }
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
  public static void bucleContadorDe2En2HastaNumero(int num){
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un numero: ");
    num = sc.nextInt();

    for (int i = 0; i <= num; i += 2) {
      System.out.println(i);
    }
  }
  public static void bucleContadorDe100AlNumero(int num){
    if (num < 100) {
      for (int i = 100; i >= num; i--) {
          System.out.println(i);
      }
    } else {
      System.out.println("El numero debe ser menor que 100");
    }
  }
  public static void bucleContadorDe100AlNumeroV2(int num){
    if (num>100){
      num = 0;
    }
    for (int i=100 ; i>num ; i--){
      System.out.println(i);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String contrasenia;
    int numero;

    System.out.println("Introduce un numero: ");
    numero = Integer.parseInt(sc.nextLine());
    //bucleContador(numero);
    //bucleContadorDe100AlNumeroV2(numero);
    //bucleContadorDe2En2HastaNumero(numero);
    System.out.println("Introduce una contrasenia: ");
    contrasenia = sc.nextLine();
    bucleContrasenia(contrasenia);

  }

}
