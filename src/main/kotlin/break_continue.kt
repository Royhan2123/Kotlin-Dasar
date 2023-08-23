fun main() {
    var i = 1

    while (true){ // <= while mengambil nilai data TRUE yang dimana otomatis akan berjalan tanpa henti.
        //lalu kita buat i++ <= yang dimana data i yaitu 0 akan berjalan terus tanpa henti

        println("Perulangan ini akan berhenti di $i")
        i++
        //lalu kita buat logika perbandingan disini untuk mengentikan data i itu ke berapa dia terhenti
        if (i > 10){ // <= jika i nya sudah mencukupi 100 maka dia akan terhenti.
            break // <= kata kunci break untuk menghentikan perulangan tersebut,
                 // jadi kita otomatis tidak memerlukan banyak kode untuk membuat sebuah perulangan.
        }
    }
    /**
     * CONTOH PENGGUNAAN CONTINUE,DIA AKAN MENGENTIKAN SATU BARIS ATAUPUN SATU BLOC
     * SEPERTI CONTOH KODE BERIKUT :
     */
    println()
    for (i in 1..10){ // <= DISINI KITA AKAN MEMBUAT SEBUAH FOR DARI 1..10
        if (i % 2 ==0){     //LALU KITA KASIH DIA I YANG DIMANA ADALAH
            // 1 SISABAGI 2 = % == 0 <- SAMA DENGAN 0.
            continue // <- MAKA DI CONTINUE YANG BUKAN SISA BAGI DARI ATAS YAITU 2
        } 
        println(i) // LALU KETIKA DI JALANKAN OTOMATIS YANG BILANGAN NYA GENAP AKAN HILANG.
    }
}