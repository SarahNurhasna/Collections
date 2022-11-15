/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package List;

/**
 *
 * @author Asus
 */
public class MahasiswaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.addMahasiswa("Sarah Nurhasna Khairunnisa", -1);
        mahasiswa.addMahasiswa("Harsa Farsali", -1);
        mahasiswa.addMahasiswa("Ziko Nirana", -1);
        mahasiswa.displayMahasiswa();
        System.out.println();
        mahasiswa.addMahasiswa("Leo Barker", 1);
        mahasiswa.sortMahasiswa();
        mahasiswa.displayMahasiswa();
    }  
}
