package Repository;

import java.util.List;

import Entitas.Ayam;

public interface AyamRepository {
    
    boolean giftVitamint(int ayam);
    void menyanyikanLagu(int ayam); 
    void tambahAyam(Ayam ayam);
    boolean cekNyawa(int ayam);
    void bertelur(int ayam);
    Ayam getAyamInfo(int ayam);
    List<Ayam> getAllayam();
    void remove(int ayam);
}
