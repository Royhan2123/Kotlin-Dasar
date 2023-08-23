fun main() {

    /**
     * PERULANGAN WHILE LOOP SAMA SEPERTI BILANGAN WHILE PADA UMUM NYA,SAMA JUGA SEPERTI DI DART
     * DI SINI TIDAK MEMERLUKAN IN DAN RANGE
     * MEMERLUKAN OPERASI PERBANDINGAN SEPERTI >,<,DAN (++ <= UNTUK MENAMBAHKAN DATANYA)
     */

    var i = 0
    while (i <= 10){
        println("ini adalah perulangan ke $i")
        i++
    }

    println()

    /**
     * PERULANGAN FOR DARI 0 - 10
     */

    for (i in 0..10){ // <= kalau for menggunakan IN DAN RANGE UNTUK MELAKUKAN PERULANGAN
        println("Ini adalah perulangan ke $i")
    }
}