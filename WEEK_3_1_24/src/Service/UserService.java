package Service;

import Entitas.User;
import Repository.AyamRepository;
import Repository.AyamRepositoryImpl;
import Repository.UserRepository;
import Repository.UserRepositoryImpl;

public interface UserService {
    void add(User user);
    void addLagu(int lagu);
    void buyVitamin(int jumlah);
    void setNetWorth();
    int getNetWorth();
    User getInfo();
}
