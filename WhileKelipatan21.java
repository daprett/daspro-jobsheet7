import java.util.Scanner;

/**
 * WhileKelipatan21
 */
public class WhileKelipatan21 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int kelipatan, counter=0, total=0;
        System.out.print("Masukkan bilangan kelipatan(1-9): ");
        kelipatan = scan.nextInt();
        
        int i = 1;
       while (i <= 50) {
        if (i % kelipatan == 0){
            total += i;
            counter++;
        }
        i++;
       }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n",  kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
    }
}