package Service;

import Entitas.User;
import Repository.AyamRepository;
import Repository.AyamRepositoryImpl;
import Repository.UserRepository;
import Repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService {

    UserRepository userRepository = new UserRepositoryImpl();
    AyamRepository ayamRepository = new AyamRepositoryImpl();

    
    public UserServiceImpl(UserRepository userRepository, AyamRepository ayamRepository) {
        this.userRepository = userRepository;
        this.ayamRepository = ayamRepository;
    }

    @Override
    public void add(User user) {
        userRepository.add(user);
    }

    @Override
    public void addLagu(int lagu) {
        userRepository.getInfo().setLagu(lagu);
    }

    @Override
    public void buyVitamin(int jumlah) {
        userRepository.beliVitamin(jumlah);
    }

    @Override
    public void setNetWorth() {
        userRepository.setNetWorth(ayamRepository.getAllayam(), userRepository.getInfo().getTelur());
    }

    @Override
    public int getNetWorth() {
        return userRepository.getInfo().getNetWorth();
    }

    @Override
    public User getInfo() {
      return  userRepository.getInfo();
    }
    
}
