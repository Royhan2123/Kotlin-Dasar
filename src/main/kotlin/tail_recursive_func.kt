/**
 * PADA RECURSIVE FUNCTION,KITA TIDAK BISA MEMBUAT BANYAK BANYAK PEMANGGILAN RECURSIVE FUNCTIONNYA
 * DIKARENAKAN NNTI AKAN ADA ERROR(STACKOVERFLOW ERROR)
 * BERIKUT CONTOH KODE YANG AKAN KITA BUAT ERROR STACKOVERFLOW :
 */

fun iniRecusiveError(value:Int){
    println("data ke $value")
    if (value > 0){
        iniRecusiveError(value - 1)
    }
}

/**
 * UNTUK MEMBUAT NYA SUPAYA TIDAK ERROR DALAM PEMANGGILAN FUNCTION ITU SENDIRI / RECURSIVE FUNCTION
 * KITA TAMBAHKAN DENGAN TAILREC -> TAILRECURSVIE
 * OTOMATIS DATANYA TIDAK AKAN ERROR,BERIKUT CONTOH KODE NYA KITA AMBIL DARI KODE DI ATAS.
 */

tailrec fun iniTailRecursive(a:Int){ // <= sama seperti infix,tailrec diisi sebelum function.
 println("Data ke $a")
    if (a > 0){
     iniTailRecursive(a - 1)
 }
}
fun main() {

     // iniRecusiveError(10000 )// <= otomatis akan error,karena recursive function terbatas.
        iniTailRecursive(10000) // <= otomatis akan berhasil,dikarenakan ada penggunaan tailrec
}