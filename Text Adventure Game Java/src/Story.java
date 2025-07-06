import java.util.Scanner;

public class Story {
    Scene startScene; //Adegan awal permainan
    Character player; //Objek karakter pemain
    Scanner scanner; //Objek untuk menerima input dari pemain

    //Menginisialisasi startScene dan player
    public Story(Scene startScene, Character player) {
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    //Memulai permainan dengan memanggil metode play().
    public void start() {
        play();
    }

    public void play() {
        Scene currentScene = startScene; //Menginisialisasi currentScene dengan startScene
        
        while (currentScene != null) {
            currentScene.displayScene();
            System.out.println("Ketik A, B, atau C untuk memilih tindakan.");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("INFO")) {
                System.out.println("Nama: " + player.getName());
                System.out.println("Health: " + player.getHealth());
                System.out.println("XP: " + player.getXP());
                continue;
            }

            Scene nextScene = currentScene.makeChoice(input, player);

            if (nextScene == null) {
                System.out.println("Permainan Berakhir.");
            }
            else {
                currentScene = nextScene;
            }
        }
        System.out.println("Permainan berakhir.");
    }
}
