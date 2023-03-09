package Repository;

import java.util.List;

import Entitas.Ayam;
import Entitas.User;

public class UserRepositoryImpl implements UserRepository{

    User user;

    @Override
    public void add(User user) {
        this.user = user;
    }

    @Override
    public void addLagu(int jumlah) {
        user.setLagu(user.getLagu() + jumlah);
    }

    

    @Override
    public User getInfo() {
        return user;
    }

    @Override
    public void setNetWorth(List<Ayam> ayams, int telur) {
         user.setNetWorth((ayams.size() * 1000) + (telur * 5000));
    }

    @Override
    public void beliVitamin(int jumlaj) {
        user.setVitamin(user.getVitamin() + jumlaj);
    }

    
    
}
