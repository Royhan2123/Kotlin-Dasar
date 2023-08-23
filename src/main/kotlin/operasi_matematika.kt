fun main() {
    // OPERASI PEMBAGIAN
    val pembagian:Double = 10.0 / 2.0
    println(pembagian)

    // OPERASI PERKALIAN
    val perkalian:Int = 10 * 2
    println(perkalian)

    // OPERASI PERTAMBAHAN
    val pertambahan:Int = 10 + 2
    println(pertambahan)

    // OPERASI PENGURANGAN
    val pengurangan:Int = 10 - 2
    println(pengurangan)

    /**
     * PEROPERASIAN AUGMENTED ASSIGNMENTS
     */

    var barang = 100
    val barang1 = 200

    // print(barang + barang1) // <= agak lebih lama.
    barang+=barang1
    println(barang)

    /**
     * UNARY OPERATOR
     */
    var harga = 0
    println(harga++) // <= otomatis harga = 0 menjadi 1,karena menggunakan ++
    var harga1 = 1
    println(harga1) // <= otomatis harga = 1 menjadi 0,karena menggunakan --

}