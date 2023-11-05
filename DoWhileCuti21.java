import java.util.Scanner;

/**
 * DoWhileCuti21
 */
public class DoWhileCuti21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = sc.nextInt();

        do { 
            System.out.println("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti :"+ jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi,ulangi jumlah masukkan cuti anda !!! ");
                    continue;
                }
            } else {
                break;
            }

        } while (jatahCuti > 0);
    }
}