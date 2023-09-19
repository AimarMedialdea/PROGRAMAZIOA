public class ExtractDigits {
    public static void main(String[] args) {
        int n = 1234;
        int nuevo = 0;

        while (n > 0){
            int digito = n % 10; // Extract the least-significant digit
            System.out.print(digito + " ");
            n = n / 10; // Drop the least-significant digit and repeat the loop
            nuevo += digito;
        }
        System.out.println(nuevo);
    }
}
