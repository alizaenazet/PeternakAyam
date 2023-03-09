package Service;

import java.util.List;

import Entitas.Ayam;
import Repository.AyamRepository;
import Repository.AyamRepositoryImpl;

public class AyamServiceImpl implements AyamService {
    AyamRepository ayamRepository = new AyamRepositoryImpl();

    
    public AyamServiceImpl(AyamRepository ayamRepository) {
        this.ayamRepository = ayamRepository;
    }

    @Override
    public void giftVitamint(int ayam) {
            ayamRepository.giftVitamint(ayam);
    }

    @Override
    public void addAyam(Ayam ayam) {
        ayamRepository.tambahAyam(ayam);
    }

    @Override
    public void nyanyikan(int ayam) {
        ayamRepository.menyanyikanLagu(ayam);
    }

    @Override
    public int bertelur(int ayam, int jumlah) {
        int jumlahTelur = 0;
       if (ayamRepository.getAyamInfo(ayam).getEnergy() >= jumlah) {
        if (ayamRepository.getAyamInfo(ayam).getHealth() >= jumlah && ayamRepository.getAyamInfo(ayam).getEnergy() >= jumlah) {
           jumlahTelur = jumlah;
           for (int i = 0; i < jumlah; i++) {
            
               ayamRepository.bertelur(ayam);
           }
           if ((ayamRepository.getAyamInfo(ayam).getHealth() - jumlah ) <= 0) {
            System.out.println("ooh tidak ayam kamu mati");
            ayamRepository.remove(ayam);
           }
            return jumlahTelur;
            
        }
       } else {
        jumlahTelur = 0;
        System.out.println("energi tidak cukup untuk " + jumlah + " telur");
       }
       System.out.println("jumlah telor cuy " + jumlahTelur);
    return jumlahTelur;
    }

    @Override
    public List getAll() {
        return ayamRepository.getAllayam();
    }

    @Override
    public Ayam getInfo(int ayam) {
        return ayamRepository.getAyamInfo(ayam);
    }
    
}
