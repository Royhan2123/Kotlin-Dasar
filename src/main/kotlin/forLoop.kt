fun main() {
    /**
     * PENGGUNAAN FOR LOOP PADA KOTLIN,PADA DART BIASANYA MENGGUNAKAN STATEMENT LAGI
     * CONTOH KODE DART :
     * FOR(INT I=1; I<10 I++){
     * PRINT(I); <= OTOMATIS AKAN ADA HASIL 1 - 10 TURUN KEBAWAH
     * }
     * KALAU DALAM KOTLIN TIDAK ADA SEPERTI ITU
     * LEBIH MUDA DAN LEBIH SIMPLE
     * SEPERTI CONTOH KODE BERIIKUT :
     *
     */

    val iniFor:Array<String> = arrayOf("Royhan","Rehan","Rayhan")

    var total = 0
    for (name in iniFor){ // <= harus di kasih variabel baru dulu
        // terus IN <= di dalam (nama var yang ingin di loop)
        println(name)
        total++ // <= berupa seperti .length / pun .size dalam array,ini untuk menghitung berapa
               // perulangan yang terjadi
    }
    println("Perulangan yang kamu lakukan saat ini ada $total")

    println()

    /**
     * untuk menghitung berapa perulangan cntoh seperti perulangan 1 - 100
     * kita hanya memerluka tipedata range 0..0
     * kalau misalnya dalam pemograman lain harus menggunakan tipe data perbandingan <,>,<=,>=
     * kalau di kotlin sangat mudah hanya menggunakan range
     * contoh kode seperti berikut :
     */

    for (i in 0..10){ // <= pertama kita hanya memerlukan sebuah var baru didalam "IN" 0..10 <- range
        println(i) // <- lalu di println supaya otomatis langsung ke bawah,tidak ke kanan.
    }

    println()

    for (j in 2..10 step 2){  // step menggunakan beberapa langkah untuk menuju ke bilangan 10
        println(j) // contoh di atas dari 2 -> 10 menggunakan step 2,yang otomatis ada 2,4,6,8,10
    }


    println()

    /**
     * LALU BAGAIMANA KETIKA MELAKUKAN REVERT,DARI 10 KE 2,ATAUPUN DARI 10 KE 1
     * DISINI KITA AKAN MENGGUNAKAN DOWN TO
     * CONTOH NYA SEPERTI :
     */

    for (x in 10 downTo  1 step 2){
        println(x)
    }

    println()

    /**
     * CARA MELAKUKAN PERULANGAN DENGAN CARA MENGAMBIL DATA ARRAY MENGGUNAKAN GETINDEX()
     * SEPERTI CONTOH BERIKUT :
     */

    val array:Array<String> = arrayOf("Royhan","Reyhan","Rizki")
    val arraylength = array.size - 1
    for (b in 0..arraylength){
        println("Index $b = ${array.get(b)}")
    }
}