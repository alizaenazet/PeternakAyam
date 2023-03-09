package Repository;

import java.util.ArrayList;
import java.util.List;

import Entitas.Ayam;

public class AyamRepositoryImpl implements AyamRepository {
    List<Ayam> dataAyam = new ArrayList<>();
    
    
   

    @Override
    public boolean giftVitamint(int ayam) {
        if (dataAyam.get(ayam).getEnergy() != 0) {
            dataAyam.get(ayam).setEnergy(dataAyam.get(ayam).getEnergy() + 5);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void menyanyikanLagu(int ayam) {
      dataAyam.get(ayam).setHealth(dataAyam.get(ayam).getHealth() + 5);
    }

    @Override
    public void tambahAyam(Ayam ayam) {
        dataAyam.add(ayam);
    }

    @Override
    public boolean cekNyawa(int ayam) {
        if (dataAyam.get(ayam).isBernyawa()) {
        return true;
        }else{
            return false;
        }
    }

    @Override
    public Ayam getAyamInfo(int ayam) {
        return dataAyam.get(ayam);
    }

    

    @Override
    public List<Ayam> getAllayam() {
        return dataAyam;
    }

    @Override
    public void remove(int ayam) {
        
        dataAyam.remove( ayam);
    }

    @Override
    public void bertelur(int ayam) {
        dataAyam.get(ayam).setEnergy(dataAyam.get(ayam).getEnergy() - 1);
        dataAyam.get(ayam).setHealth(dataAyam.get(ayam).getHealth() - 1);
    }
    
}
