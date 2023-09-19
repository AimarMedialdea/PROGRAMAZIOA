import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int numero3;
        int suma;
        int multiplicacion;
        int media;


        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Mete el primer numero: ");  // No newline for prompting message
        numero1 = in.nextInt();
        System.out.print("Mete el segundo numero");
        numero2 = in.nextInt();
        System.out.print("Mete el tercer numero");
        numero3 = in.nextInt();
        in.close();

        suma = numero1 + numero2 + numero3;
        multiplicacion = numero1 * numero2 * numero3;
        media = (numero1 + numero2 + numero3)/3;
        minimo


        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + multiplicacion);
        System.out.println("La media es: " + media);



        
    }
}
