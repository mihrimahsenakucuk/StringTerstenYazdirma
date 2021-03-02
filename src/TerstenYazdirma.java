
import java.util.Scanner;

public class TerstenYazdirma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Kelimeniz:");
        String kelime;

        kelime=scan.next().toUpperCase(); // Tersine çevirilmiş kelime büyük harflerle yazılır.

        for(int i= kelime.length()-1 ; i >= 0 ; i--)
        {
            System.out.print(kelime.charAt(i));
        }

    }


}
