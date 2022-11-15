/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;
import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class Mahasiswa {
    private ArrayList<String> namaMahasiswa = new ArrayList();
    
    public void addMahasiswa(String namaMahasiswa, int idx){
        if(idx == -1)
            this.namaMahasiswa.add(namaMahasiswa);
        else
            this.namaMahasiswa.add(idx, namaMahasiswa);
    }
    
    public void removeMahasiswa(String namaMahasiswa){
        this.namaMahasiswa.remove(namaMahasiswa);
    }
    
    public void displayMahasiswa(){
        int i = 0;
        for(String mahasiswa: namaMahasiswa){
            System.out.println("ID: " + (i+1) + "\tNama Mahasiswa " + mahasiswa);
            i++;
        }
    }
    
    public void sortMahasiswa(){
        Collections.sort(namaMahasiswa);
    }
}
