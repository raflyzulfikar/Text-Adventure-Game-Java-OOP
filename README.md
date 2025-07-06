# Text Adventure Game: Legend of the Lost City
## Project Description
This project implements a simple Java-based text adventure game. Designed as a “mini project” for Junior Game Developers at 'SiTelu Studios', the game challenges the player, Rafly Zulfikar AlKautsar, to explore the long-lost legendary city of Ardhana. The player will face various challenges, make crucial choices that affect character attributes (health and experience points), and finally uncover the mystery behind the Gem of Light and the lost city.
This project aims to demonstrate the understanding and application of Object Oriented Programming (OOP) principles, player input management, and gameplay logic in an interactive environment.
*(Please note: Some parts of the codebase, including variable names and comments, are written in Indonesian for clarity among local developers.)*
## Short Storyline: The Legend of the Lost City
The main character, Rafly Zulfikar AlKautsar, begins his adventure in a city, hearing about rumors of the lost City of Ardhana. His journey takes him through the Mystical Forest, Secret Caves, facing ancient traps, puzzles, and guardian creatures. Every choice Rafly Zulfikar AlKautsar makes will determine the continuation of the story, the risks faced, and the *reward* earned, until the ultimate goal of finding the Gem of Light and unraveling the mystery of the Lost City.
## Scene and Storyline Details
Here is a summary of each scene in the game and how the player's choices will lead them to the next scene:
| Scene | Description                                                     | Choices & Next Scene Connections                                                       |
| :---- | :-------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1     | The adventure begins. You are in the city and hear about the Legend of the Lost City. | Choices: search for an ancient map (2), ask the locals (2), leave without preparation (2)                                                                                                                                                                |
| 2     | You enter the Misty Forest, full of dangers.                    | Choices: follow footprints (3), investigate temple ruins (3), rest and strategize (3)                                                                                                                                                                    |
| 3     | You meet villagers who have information about the Lost City.    | Choices: ask further (4), pay them for information (4), leave the village without asking (4)                                                                                                                                                             |
| 4     | You enter a Secret Cave and find a giant statue.                | Choices: solve an ancient riddle (5), pass mechanical traps (5), face an ancient spirit guardian (5)                                                                                                                                                     |
| 5     | You arrive at the gates of Ardhana City, locked with a mystical seal. | Choices: search for four ancient symbols (6), try to break the seal by force (6), wait and observe (6)                                                                                                                                                   |
| 6     | You find Prof. Brahma trapped in the temple's dungeon.          | Choices: rescue him and search for artifacts (7), focus on finding the Light Gem (7), exit and return later (7)                                                                                                                                        |
| 7     | You face a cursed warrior guarding an artifact.                 | Choices: fight him (8), avoid combat and steal the artifact (8), negotiate with the warrior (8)                                                                                                                                                          |
| 8     | You discover an underground room full of puzzles.               | Choices: solve the puzzle (9), use force to destroy the barrier (9), find another way (9)                                                                                                                                                                |
| 9     | You encounter an ancient spirit guarding the city.              | Choices: negotiate with it (10), fight it with weapons (10), find another way (10)                                                                                                                                                                       |
| 10    | You have solved the mystery of the Lost City and found the hidden treasure. | Final Choices: use the treasure for good, keep the treasure for yourself, leave the treasure and depart. (This scene is the end of the main storyline, choices do not lead to further scenes.) |
## OOP Concepts Applied
This project effectively applies some basic principles of Object Oriented Programming (OOP):
* **Encapsulation:** Each class (`Character`, `Scene`, `Story`) has `private` attributes that can only be accessed or modified through `public` methods (such as *getter* and *setter*). This maintains data integrity and restricts unnecessary access.
* **Abstraction:** Classes are designed to represent real-world entities (characters, scenes, stories) by hiding internal implementation details and exposing only relevant functionality to the user or other classes.
* **Composition:** The `Story` class “owns” the `Character` and `Scene` objects (`startScene`, `currentScene`). The `Scene` class also “owns” references to other `Scene` objects (`nextSceneA`, `nextSceneB`, `nextSceneC`), forming a branching storyline.
* **Modularity:** The code is divided into classes that have specific responsibilities, making the code more structured, readable, and manageable.
## Core Class Structure
The project is built on four core classes, as per the minimum specification:
### `Character.java`
* **Purpose:** Represents the player character.
* **Attributes:** `name` (String), `health` (int), `XP` (int), `item` (String).
* **Constructor:** `Character(String name, int health)`.
* **Methods:** `takeDamage(int damage)`, `addXP(int additionalXP)`, `getName()`, `getHealth()`, `getXP()`, `getItem()`, `setItem(String item)`.
### `Scene.java`
* **Purpose:** Represents a scene or location in the game, including a description of the situation and available interactive options.
* **Attributes:** `description` (String), `choiceA/B/C` (String), `nextSceneA/B/C` (Scene), `damageA/B/C` (int), `XPA/B/C` (int).
* **Constructor:** `public Scene(String description, String choiceA, Scene nextSceneA, int damageA, int XPA, String choiceB, Scene nextSceneB, int damageB, int XPB, String choiceC, Scene nextSceneC, int damageC, int XPC)`.
* **Methods:** `displayScene()`, `makeChoice(String choice, Character player)`.
### `Story.java`
* **Purpose:** Manages the overall game flow and handles player interaction.
* **Attributes:** `startScene` (Scene), `player` (Character), `scanner` (Scanner).
* **Constructor:** `public Story(Scene startScene, Character player)`.
* **Methods:** `start()`, `play()` (display scene, accept input, process options, update scene, display character status info).
### `Main.java`
* **Purpose:** The main entry point of a Java program. Initializes the main objects and starts the game.
* **Main Content:** Creates a `Character` object, creates at least 10 interconnected `Scene` objects, creates a `Story` object, and calls `story.start()` to start the game.
## Project Structure
This project is organized with the standard Java folder structure:
```
.
├── src/
│   ├── Character.java
│   ├── Scene.java
│   ├── Story.java
│   └── Main.java
└── README.md
```
## How to Run the Project
To run this text adventure game, you need to have the Java Development Kit (JDK) installed on your system.
1.  **Prepare Files**
    Make sure all your `.java` files (`Character.java`, `Scene.java`, `Story.java`, `Main.java`) are inside the `src/` folder inside your project directory.
2.  **Compile Code**
    Open your terminal or Command Prompt, navigate to the root directory of your project (the folder where `src/` and `README.md` are located), then compile all        Java files:
    ```
    javac src/*.java
    
    ```
3.  **Run the Program**
    Once successfully compiled, you can run the game:
    ```
    java -cp src Main
    ```
    The game will start on the console, and you can start making choices.
## Interaction Example (Console Output)
Here's a quick example of how an in-game interaction might look like:
Awal petualangan dimulai. Kamu berada di kota dan mendengar tentang Legenda Kota Hilang.
A: Mencari peta kuno
B: Bertanya kepada penduduk
C: Langsung pergi tanpa persiapan
Ketik 'INFO' untuk melihat status karakter.
Ketik A, B, atau C untuk memilih tindakan.
A

Kamu masuk ke Hutan Mistis yang penuh bahaya.
A: Mengikuti jejak kaki
B: Menyelidiki reruntuhan candi
C: Beristirahat dan menyusun strategi
Ketik 'INFO' untuk melihat status karakter.
Ketik A, B, atau C untuk memilih tindakan.
B

Kamu bertemu dengan penduduk desa yang memiliki informasi tentang Kota Hilang.
A: Bertanya lebih lanjut
B: Membayar mereka untuk informasi
C: Meninggalkan desa tanpa bertanya
Ketik 'INFO' untuk melihat status karakter.
Ketik A, B, atau C untuk memilih tindakan.
A

Kamu masuk ke Goa Rahasia dan menemukan patung raksasa.
A: Memecahkan teka-teki kuno
B: Melewati jebakan mekanis
C: Menghadapi penjaga roh kuno
Ketik 'INFO' untuk melihat status karakter.
Ketik A, B, atau C untuk memilih tindakan.
A

Kamu tiba di gerbang Kota Ardhana yang terkunci dengan segel mistis.
A: Mencari empat simbol kuno
B: Mencoba membuka segel dengan paksa
C: Menunggu dan mengamati
Ketik 'INFO' untuk melihat status karakter.
Ketik A, B, atau C untuk memilih tindakan.
A

Kamu menemukan Prof. Brahma yang terjebak di ruang bawah tanah kuil.
A: Menyelamatkannya dan mencari artefak
B: Fokus mencari Permata Cahaya
C: Keluar dan kembali nanti
Ketik 'INFO' untuk melihat status karakter.
Ketik A, B, atau C untuk memilih tindakan.
A

Kamu menghadapi prajurit terkutuk yang menjaga artefak.
A: Bertarung dengannya
B: Menghindari pertempuran dan mencuri artefak
C: Bernegosiasi dengan prajurit
Ketik 'INFO' untuk melihat status karakter.
Ketik A, B, atau C untuk memilih tindakan.
B

Kamu menemukan ruang bawah tanah yang penuh dengan teka-teki.
A: Pecahkan teka-teki
B: Gunakan kekuatan untuk menghancurkan penghalang
C: Cari jalan lain
Ketik 'INFO' untuk melihat status karakter.
Ketik A, B, atau C untuk memilih tindakan.
A

Kamu bertemu dengan roh kuno yang menjaga kota.
A: Bernegosiasi dengannya
B: Melawannya dengan senjata
C: Mencari jalan lain
Ketik 'INFO' untuk melihat status karakter.
Ketik A, B, atau C untuk memilih tindakan.
B

Kamu telah memecahkan misteri Kota Hilang dan menemukan harta karun tersembunyi.
A: Gunakan harta untuk kebaikan
B: Simpan harta untuk dirimu sendiri
C: Tinggalkan harta dan pergi
Ketik 'INFO' untuk melihat status karakter.
Ketik A, B, atau C untuk memilih tindakan.
A
Permainan Berakhir.

Kamu telah memecahkan misteri Kota Hilang dan menemukan harta karun tersembunyi.
A: Gunakan harta untuk kebaikan
B: Simpan harta untuk dirimu sendiri
C: Tinggalkan harta dan pergi
Ketik 'INFO' untuk melihat status karakter.
Ketik A, B, atau C untuk memilih tindakan.
INFO
Nama: Rafly Zulfikar AlKautsar
Health: 37
XP: 97
## Important Notes and Development Potential
* **Game Over Condition:** Currently, the game ends when `makeChoice()` returns `null` (e.g. due to invalid input or `nextScene` being set to `null` at the end of the story path). However, the game does not explicitly stop when `player.getHealth()` reaches 0. It is strongly recommended to add a condition in `Story.play()` to check the player's health and display a “Game Over” message if health reaches 0, then end the game.
* **Use of Items:** The `item` attribute in the `Character` class already exists, but has not been used in the game logic to affect the storyline or player state. This could be a future development area to add item interaction features.
**Scene Complexity:** The `Scene` constructor has many parameters. For larger or more dynamic games, managing scenes from external data (e.g. JSON/XML files) or using design patterns like the *Builder Pattern* could be a better solution.
* **Input Handling:** Player input currently only checks `A`, `B`, `C`, or `INFO`. Consider adding more robust *error* handling for unexpected inputs, to make the game more resilient.
