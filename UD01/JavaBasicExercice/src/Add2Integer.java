import java.util.Scanner;

public class Add2Integer {
    public static void main(String[] args) {
    
        int numero1;
        int numero2;
        int suma;

      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      System.out.print("Mete el primer numero: ");  // No newline for prompting message
      numero1 = in.nextInt();
      System.out.print("Mete el segundo numero");
      numero2 = in.nextInt();
      in.close();

      suma = numero1 + numero2;

      System.out.println("Lasuma entre " + numero1 + " y " + numero2 + " es: " + suma);


    }
}
