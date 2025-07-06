public class Scene {
    String description; //Deskripsi adegan
    String choiceA, choiceB, choiceC; //Deskripsi pilihan A, pilihan B, pilihan C
    Scene nextSceneA, nextSceneB, nextSceneC; //Adegan selanjutnya untuk pilihan A, pilihan B, pilihan C
    int damageA, damageB, damageC; //Damage point jika pilihan A di pilih (bisa 0), jika pilihan B di pilih (bisa 0), jika pilihan C di pilih (bisa 0)
    int XPA, XPB, XPC; //XP point jika pilihan A di pilih (bisa 0), jika pilihan B di pilih (bisa 0), jika pilihan C di pilih (bisa 0)

    //Menginisialisasi deskripsi dan pilihan adegan
    public Scene(String description, String choiceA, Scene nextSceneA, int damageA, int XPA, String choiceB, Scene nextSceneB, int damageB, int XPB, String choiceC, Scene nextSceneC, int damageC, int XPC) {
        this.description = description;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.nextSceneA = nextSceneA;
        this.nextSceneB = nextSceneB;
        this.nextSceneC = nextSceneC;
        this.damageA = damageA;
        this.damageB = damageB;
        this.damageC = damageC;
        this.XPA = XPA;
        this.XPB = XPB;
        this.XPC = XPC;
    }

    //Menampilkan deskripsi dan pilihan adegan.
    public void displayScene() {
        System.out.println("\n" + description);
        System.out.println("A: " + choiceA);
        System.out.println("B: " + choiceB);
        System.out.println("C: " + choiceC);
        System.out.println("Ketik 'INFO' untuk melihat status karakter.");
    }

    //Mengembalikan nextSceneA untuk "A" (atau "a"), nextSceneB untuk "B" (atau "b"), dan null untuk input yang tidak valid
    public Scene makeChoice(String choice, Character player) {
        
        switch (choice.toUpperCase()) {
            case "A":
                player.takeDamage(damageA);
                player.addXP(XPA);
                return nextSceneA;
            case "B":
                player.takeDamage(damageB);
                player.addXP(XPB);
                return nextSceneB;
            case "C":
                player.takeDamage(damageC);
                player.addXP(XPC);
                return nextSceneC;
            default:
                System.out.println("Pilihan tidak valid!");
                return null; // Tidak ada scene berikutnya
        }
    }
}

