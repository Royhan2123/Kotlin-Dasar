fun main() {
    /**
     * PENGGUNAAN WHEN,SAMA SEPERTI SWITH CASE,TAPI YANG INI LEBIH SIMPLE DAN LEBIH MUDAH SYNTAKNYA
     * CONTOH PENGGUNAANY SEPERTI BERIKUT:
     * KITA AKAN MENCARI HASIL DARI NILAIABSEN :
     */

    var nilaiAbsen = "A"
   val hasil = when(nilaiAbsen){ // HAMPIR SAMA SEPERTI SWITCH BUKAN ?
        "A" -> "Wah Kamu Jago Sekali!"  // YANG MEMBEDAKAN IALAH INI,KETIKA SUDAH DI DALAM KURUNG WHEN
        "B" -> "Wah Kamu jago juga!"   // PIHAK KOTLIN NYA LANGSUNG MEMINTA DATA NYA -> <= PENUNJUK HASIL
        "C" -> "Wah kamu lumayan ya!" // SEPERTI DI SAMPING:
        "D" -> "Tingakatkan lagi ya!"
       else -> "Maaf Kamu Gagal" // BIASANYA UNTUK PALING AKHIR MENGGUNAKAN DEFAULT :
       // TETAPI DALAM WHEN MENGGUNAKAN ELSE JUGA SEPERTI IF
    }
    println("Nilai absen kmu ialah $nilaiAbsen : $hasil")

    /**
     * ADA JUGA LANGSUNG MULTIPLE OPTION YANG LANSGUNG SEKALI BANYAK DATA NYA TERPILIH KE MANA
     * SEPERTI CONTOH BERIKUT
     */

    when(nilaiAbsen){ //BISA LANGSUNG BEBAS MEMASUKKAN DATA NYA,
                     // DENGAN SATU NILAI YANG SAMA UNTUK SEMUA DATA
        "A","B","C" -> println("Selamat Anda Telah Mencukupi Nilai Untuk Lulus")
        else -> println("Maaf Anda Gagal")
    }

    /**
     * PENGGUNAAN IN DAN !IN <= ADA DIDALAM DAN TIDAK ADA DI DALAM
     * CONTOH PENGGUNAAN NYA SEPERTI BERIKUT :
     */

    var nilaiAbsens = "A"
    // jadi kita membuat sebuah array yang dimana isinya adalah "A","B","C","D"
    val hasilNilai:Array<String> = arrayOf("A,B,C,D")
    // lalu kita buat when dengan data nilaiabsen yaitu "A"
    when(nilaiAbsens){
        // lalu di dalam IN(hasilNilai) <= yang dimana data dalamnya yaitu A,B,C,D => langsung print
        // "SELAMAT ANDA LULUS", otomatis true <= karena nilaiabsen nya adalah A,dan data dalam hasilnilai ada A
        // ketika tidak ada di dalam yaitu !IN <= maka otomatis akan false,dengan println("Maaf Anda Gagal")
        in hasilNilai -> println("Selamat Anda Lulus")
        !in hasilNilai -> println("Maaf Anda Gagal")
    }

    /**
<<<<<<< HEAD
     * CONTOH PENGGUNAAN IS DAN !IS
     * is <= adalah jadi dia akan memberi tau bahwa kode tersebut merupakan tipe data apa
     * CONTOH KODE NYA SEPERTI :
     */

    val nama = "Royhan"
    when(nama){
        is String ->  println("Berupa String")
        !is String -> println("Bukan String")
    }

    /**
     * CONTOH PENGGUNAAN LOGIKA PERBANDINGAN TANPA MENGGUNAKAN IF,
     */

    var nilaiTugas = 50
    when{
        nilaiTugas >= 80 -> println("Nilai Anda Mencukupi")
        nilaiTugas >= 70 -> println("Nilai Anda Cukup Mencukupi")
        nilaiTugas >= 60 -> println("Nilai Anda Hampir Mencukupi")
        else -> println("Maaf Anda Gagal")
    }

    /**
=======
>>>>>>> 373f23f6537f230d1151d2e6a99b901dc3475a01
     * CONTOH PENGGUNAAN DI DALAM INT
     */
    val nilai = 69

    val hasilNilais = when(nilai){

        in 90..100-> "A"  // <= kalau di sini berupa range 90..100 <= 90 ke 100 ialah "A"

        in 90..100 -> "A"  // <= kalau di sini berupa range 90..100 <= 90 ke 100 ialah "A"

        in 80..100 -> "B" // <= kalau di sini berupa range 80..100 <= 90 ke 100 ialah "B"
        in 70..100 -> "C" // sama seperti berikutnya
        in 60..100 -> "C"
        else -> "D" // untuk di bawah 50,langsung menggunakan ELSE juga boleh tanpa menggunakan !IN
    }
    println("Nilai Anda adalah $nilai dan Hasilnya adalah $hasilNilais")
}