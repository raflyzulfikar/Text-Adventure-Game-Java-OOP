public class Main {
    public static void main(String[] args) {
        //Membuat karakter pemain
        Character player = new Character("Rafly Zulfikar AlKautsar", 100);

        //Membuat scene (minimal 10)
        Scene scene10 = new Scene("Kamu telah memecahkan misteri Kota Hilang dan menemukan harta karun tersembunyi.",
                "Gunakan harta untuk kebaikan", null, 0, 0,
                "Simpan harta untuk dirimu sendiri", null, 0, 0,
                "Tinggalkan harta dan pergi", null, 0, 0);

        Scene scene9 = new Scene("Kamu bertemu dengan roh kuno yang menjaga kota.",
                "Bernegosiasi dengannya", scene10, 0, 10,
                "Melawannya dengan senjata", scene10, 20, 15,
                "Mencari jalan lain", scene10, 10, 7);
        
        Scene scene8 = new Scene("Kamu menemukan ruang bawah tanah yang penuh dengan teka-teki.",
                "Pecahkan teka-teki", scene9, 0, 10,
                "Gunakan kekuatan untuk menghancurkan penghalang", scene9, 15, 0,
                "Cari jalan lain", scene9, 10, 5);
        
        Scene scene7 = new Scene("Kamu menghadapi prajurit terkutuk yang menjaga artefak.",
                "Bertarung dengannya", scene8, 20, 15,
                "Menghindari pertempuran dan mencuri artefak", scene8, 10, 5,
                "Bernegosiasi dengan prajurit", scene8, 0, 10);
        
        Scene scene6 = new Scene("Kamu menemukan Prof. Brahma yang terjebak di ruang bawah tanah kuil.",
                "Menyelamatkannya dan mencari artefak", scene7, 7, 10,
                "Fokus mencari Permata Cahaya", scene7, 0, 10,
                "Keluar dan kembali nanti", scene7, 0, 0);
        
        Scene scene5 = new Scene("Kamu tiba di gerbang Kota Ardhana yang terkunci dengan segel mistis.",
                "Mencari empat simbol kuno", scene6, 7, 15,
                "Mencoba membuka segel dengan paksa", scene6, 15, 5,
                "Menunggu dan mengamati", scene6, 0, 7);
        
        Scene scene4 = new Scene("Kamu masuk ke Goa Rahasia dan menemukan patung raksasa.",
                "Memecahkan teka-teki kuno", scene5, 5, 15,
                "Melewati jebakan mekanis", scene5, 15, 5,
                "Menghadapi penjaga roh kuno", scene5, 15, 10);
        
        Scene scene3 = new Scene("Kamu bertemu dengan penduduk desa yang memiliki informasi tentang Kota Hilang.",
                "Bertanya lebih lanjut", scene4, 0, 7,
                "Membayar mereka untuk informasi", scene4, 0, 10,
                "Meninggalkan desa tanpa bertanya", scene4, 5, 0);
        
        Scene scene2 = new Scene("Kamu masuk ke Hutan Mistis yang penuh bahaya.",
                "Mengikuti jejak kaki", scene3, 5, 8,
                "Menyelidiki reruntuhan candi", scene3, 9, 10,
                "Beristirahat dan menyusun strategi", scene3, 0, 5);
        
        Scene scene1 = new Scene("Awal petualangan dimulai. Kamu berada di kota dan mendengar tentang Legenda Kota Hilang.",
                "Mencari peta kuno", scene2, 5, 10,
                "Bertanya kepada penduduk", scene2, 0, 7,
                "Langsung pergi tanpa persiapan", scene2, 10, 2);

        //Memulai permainan
        Story story = new Story (scene1, player);
        story.start();
    }
}