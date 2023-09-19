public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int bajo = 1;
        final int alto = 100;
        double cantNumeros = 0;
        double media = 0;
        int suma = 0;

        for(int i = bajo; i <= alto; i++, cantNumeros++){
            suma += i;
        }
        media = suma / cantNumeros;
        System.out.println("The sum of " + bajo + " to " + alto + " is: " + suma);
        System.out.println(media);

    }
}
