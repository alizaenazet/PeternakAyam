package Repository;

import java.util.List;

import Entitas.Ayam;
import Entitas.User;

public interface UserRepository {
    void add(User user);
    void addLagu(int jumlah);
    void beliVitamin(int jumlaj);
    User getInfo();
    void setNetWorth(List<Ayam> ayams, int telur);
    

}
