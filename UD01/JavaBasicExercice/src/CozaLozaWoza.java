public class CozaLozaWoza {
    public static void main(String[] args) {
        final int bajo = 1;
        final int alto = 110;


        for(int i = bajo; i <= alto; i++){
            if(i % 11 == 0 ){                    //separa numeros por bloques de 11
                System.out.print(i + " ");
                System.out.println();
            }else if(i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
                System.out.print(i + " ");
            }

            if(i % 3 == 0 && i % 5 != 0 && i % 7 != 0){
                System.out.print("Coza ");
            }else if(i % 5 == 0 && i % 3 != 0 && i % 7 != 0){
                System.out.print("Loza ");
            }else if(i % 7 == 0 && i % 3 != 0 && i % 5 != 0){
                System.out.print("Woza ");
            }else if(i % 3 == 0 && i % 5 == 0 && i % 7 != 0){
                System.out.print("CozaLoza ");
            }else if(i % 5 == 0 && i % 7 == 0 && i % 3 == 0){
                System.out.print("LozaWoza");
    }
}
    }}
