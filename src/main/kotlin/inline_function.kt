/**
 * INLINE ADALAH SEBUAH FUNCTION YANG SEBENARNYA GUNA NYA MEMPERKECIL BYTE KODE KETIKA DI JALANKAN
 * SEPERTI CONTOH BERIKUT,KITA MEMBUAT SEBUAH KODE,LALU KETIKA KITA DECOMPILE KODE TERSEBUT,CUKUP
 * LUMAYAN BESAR BYTE DALAM PENGGUNAAN KODE NYA,TETAPI KETIK KITA KASIH INLINE SEPERTI DI BAWAHNYA LAGI
 * KETIKA DECOMPILE KODE TERSEBUT BYTE NYA SANGATLAH KECIL KARENA MENGGUNAKAN INLINE FUNC
 * INI BISA MEMPERCEPAT JALANNYA PEFORMA APLIKASI KITA.
 */
fun lambda(name:() -> String ):String{
    return "your name ${name()}"
}

inline fun lambdas(names:() -> String ):String{
    return "your name ${names()}"
}
fun main() {
    println( lambda { "Royhan" } ) // <= tidak ada yang beda di jalankan,
    // yang membedankan hanyalah besaran byte nya
    println( lambdas { "Reyhan" } )
}