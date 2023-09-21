import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {

        double radio;
        double diametro;
        double circunferencia;
        double area;


        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Mete el radio: ");  // No newline for prompting message
        radio = in.nextDouble();
        in.close();

        diametro = radio * 2;
        circunferencia = Math.PI * diametro;
        area = Math.PI * (radio * radio);

        System.out.printf("El diametro es: %.2f%n", diametro);       
        System.out.printf("El circunferencia es: %.2f%n", circunferencia);
        System.out.printf("El area es: %.2f%n", area);



        
    }
}
