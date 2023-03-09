package Service;

import java.util.List;

import Entitas.Ayam;

public interface AyamService {
    void giftVitamint(int ayam);
    void addAyam(Ayam ayam);
    void nyanyikan(int ayam);
    int bertelur(int ayam, int jumlah);
    List getAll();
    Ayam getInfo(int ayam);
}
