package View;

import java.time.Year;

import Entitas.Ayam;
import Entitas.User;
import Repository.AyamRepository;
import Repository.AyamRepositoryImpl;
import Repository.UserRepository;
import Repository.UserRepositoryImpl;
import Service.AyamService;
import Service.AyamServiceImpl;
import Service.UserService;
import Service.UserServiceImpl;
import Utilities.InputUtil;

public class PeternakAyam {

    AyamService ayamService;
    UserService userService;

    public PeternakAyam(AyamService ayamService, UserService userService) {
        this.ayamService = ayamService;
        this.userService = userService;
    }

    int choosedAyam;
    public void home() {
        addUser();
        while (true) {
            System.out.println("hi " + userService.getInfo().getName());
            System.out.println("jumlah ayam :       " + (ayamService.getAll().size() ));
            System.out.println("jumlah vitamin :        " + userService.getInfo().getVitamin());
            System.out.println("jumlah telur :      " + userService.getInfo().getTelur());
            System.out.println("jumlah lagu : " + userService.getInfo().getLagu());
            System.out.println("NetWorth :      " + userService.getNetWorth());
            System.out.println("\n\n\nmenu: ");
            System.out.println("1. tambah ayam\n2. interaksi dengan ayam\n3. tambah lagu dan vitamin");
            int pilihan = InputUtil.inputInt("\n\n\npilih input ");

            if (pilihan == 1) {
                tambahAyam();
            } else if (pilihan == 2) {
                if (ayamService.getAll().size() == 0) {
                    System.out.println("anda tidak punya ayam");
                } else {
                    showAyams();
                 choosedAyam = InputUtil.inputInt("pilih ayam : ") - 1;
                System.out.println("nama : " + ayamService.getInfo(choosedAyam).getName() + "\nhealth : "
                        + ayamService.getInfo(choosedAyam).getHealth() + "energi : "
                        + ayamService.getInfo(choosedAyam).getEnergy());
                    System.out.println("1.Nyanyikan lagu\n2.kasih vitamin\n3.buat telur\n4.exit");
                        int interaksi = new InputUtil().inputInt("pilih : ") ;

                        if (interaksi == 1) {
                            nyanyikanLagu();
                        }else if (interaksi == 2) {
                            giftVitamint();
                        }else if (interaksi == 3) {
                            buatTelur();
                        }else if (interaksi == 4) {
                            
                        }else { 
                            System.out.println("input tidak sesuai");
                        } 
                }
               
            }else if (pilihan == 3) {
            addVitamintNlagu();
            }

        }
    }

    public void addUser() {
        System.out.println("tambah user");
        String name = InputUtil.inputStr("masukan nama user : ");
        int jumlahVit = InputUtil.inputInt("masukan jumlah vitamin");
        int jumlahLagu = InputUtil.inputInt("masukan jumlah lagu");
        User user = new User(name, jumlahVit, jumlahLagu);
        userService.add(user);
    }

    public void tambahAyam() {
        String inputnama = InputUtil.inputStr("masukan nama : ");
        Ayam ayam = new Ayam(inputnama);
        ayamService.addAyam(ayam);
        userService.setNetWorth();
    }

    public void showAyams() {
        System.out.println("List ayam-ayam anda");
        for (int i = 0; i < ayamService.getAll().size(); i++) {
            System.out.println("No." + (i + 1) + " " + ayamService.getInfo(i).getName());
        }
    }

    public void showUserProfile() {
        System.out.println(userService.getInfo().getName());
    }

    public void addVitamintNlagu() {
        System.out.println("1.Tambah vitamin" + "\n2.tambah lagu");
        int choose = InputUtil.inputInt("masukan pilihan");
        if (choose == 1) {
            int inputVit = InputUtil.inputInt("masukan jumlah vitamin :");
            userService.buyVitamin(inputVit);
        } else if (choose == 2) {
            int inputVit = InputUtil.inputInt("masukan jumlah lagu :");
            userService.addLagu(inputVit);
        } else {
            System.out.println("input tidak sesuai");
        }

    }

    public void nyanyikanLagu() {
        if (userService.getInfo().getLagu() > 0) {
            
            ayamService.nyanyikan(choosedAyam);

        } else {
            System.out.println("lagu tidak cukup");
        }
    }

    public void buatTelur() {
        
        System.out.println("nama ayam :" + ayamService.getInfo(choosedAyam).getName());
        System.out.println("health ayam : " + ayamService.getInfo(choosedAyam).getHealth());
        System.out.println("energi ayam : " + ayamService.getInfo(choosedAyam).getEnergy());
        int jumlah = InputUtil.inputInt("jumlah telur");
        
        userService.getInfo().setTelur(ayamService.bertelur(choosedAyam, jumlah));
        userService.setNetWorth();
    }

    public void giftVitamint() {
        ayamService.giftVitamint(choosedAyam);
    }

}
