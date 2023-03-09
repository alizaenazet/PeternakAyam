import Entitas.User;
import Repository.AyamRepository;
import Repository.AyamRepositoryImpl;
import Repository.UserRepository;
import Repository.UserRepositoryImpl;
import Service.AyamService;
import Service.AyamServiceImpl;
import Service.UserService;
import Service.UserServiceImpl;
import View.PeternakAyam;

public class PeternakAyamApp {
    public static void main(String[] args) {
        AyamRepository ayamRepository = new AyamRepositoryImpl();
        UserRepository userRepository= new UserRepositoryImpl();
        AyamService ayamService = new AyamServiceImpl(ayamRepository);
        UserService userService = new UserServiceImpl(userRepository, ayamRepository);
        PeternakAyam peternakAyam =new PeternakAyam(ayamService, userService);

        peternakAyam.home();
        
    }
}
