/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetsaldotabungan;

/**
 *
 * @author Frda
 * KELAS : PBO 2
 * NIM : 10116415
 * Deskripsi program: program ini berisi program untuk menampilkan hasil
 * saldo tabungan
 
 */
public class TargetsaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int i = 1;
        int saldoAwal = 3500000;
        double bunga = 0.08;
        int saldoBulanan;
        
        do{
            saldoBulanan = (int) (bunga * saldoAwal);
            saldoAwal = (saldoAwal + saldoBulanan);
            System.out.println("Saldo di bulan ke- "+ i + " Rp " + saldoAwal);
            i++;
        } while (i<=8);      
    }
    
}
