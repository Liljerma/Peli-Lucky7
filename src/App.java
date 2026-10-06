import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner in  = new Scanner(System.in);
        Random r = new Random();

        int raha = 5;
        String uudestaan; 
        int heitto = 0;

    
    System.out.println("Pelataan peliä Lucky7!");
    System.out.println("Saldo tällä hetkellä " + raha + " euroa");
    System.out.println("  ");
    System.out.println("Heitä noppaa enter näppäimellä!");
    
    in.nextLine(); 

    do {
        if (raha == 0) {
            System.out.println("Ei rahaa pelaamiseen");
            break;
        }
        heitto++;
        raha-=2; 

        for (int i = 0; i < 3; i++) {
        int arvonta = r.nextInt(10)+1;
        System.out.println(arvonta);

            if (arvonta == 7) {
                System.out.println("Voitit pelin saamalla numeron 7!");
                System.out.println("      "); 
                raha+=3;
                } 
        }
        System.out.println("Heittojesi määrä on " + heitto);
        System.out.println("Haluatko pelata uudestaan?");
        uudestaan = in.nextLine();
        } while (uudestaan.equalsIgnoreCase("k"));
                System.out.println("Kiitos pelaamisesta!");
                System.out.println("Saldosi pelin päättyessä on " +raha + " euroa");
            
}
}