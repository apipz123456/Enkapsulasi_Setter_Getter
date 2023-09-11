/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pesertaujian;

/**
 *
 * @author Apipz
 */
public class PesertaUjian {
    private String nomorPeserta;
    private String nama;
    private String prodi;
    
//objek 
public PesertaUjian(String nomorPeserta, String nama, String prodi) {
        this.nomorPeserta = nomorPeserta;
        this.nama = nama;
        this.prodi = prodi;
        }
//Getter untuk nomorPeserta
 public String getNomorPeserta() {
        return nomorPeserta;
    }
 
 //setter untuk mengubah nomorpeserta
   public void setNomorPeserta(String nomorPeserta) {
        this.nomorPeserta = nomorPeserta;
        
    }
   
 // Getter untuk nama  
   public String getNama() {
        return nama;
    }
   
// Setter untuk nama
   public void setNama(String nama) {
        this.nama = nama;
    }
   
 // Getter untuk prodi
    public String getProdi() {
        return prodi;
    }
    
//setter
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
     public static void main(String[] args) {
        // Membuat objek peserta ujian
        PesertaUjian peserta1 = new PesertaUjian("432022611016", "Fuazan Afif Lutfiansah", "Teknik Informatika");

        // Menggunakan getter untuk mengakses informasi peserta ujian
        System.out.println("Nomor Peserta: " + peserta1.getNomorPeserta());
        System.out.println("Nama Peserta: " + peserta1.getNama());
        System.out.println("Program Studi: " + peserta1.getProdi());

        // Menggunakan setter untuk mengubah informasi peserta ujian
        peserta1.setNama("Natasya Willonteng");
        peserta1.setProdi("Teknik Informatika");

        System.out.println("\nData Peserta  (setelah perubahan):");
        System.out.println("Nomor Peserta: " + peserta1.getNomorPeserta());
        System.out.println("Nama Peserta: " + peserta1.getNama());
        System.out.println("Program Studi: " + peserta1.getProdi());
   
   
    
}
}
