/**
 * RECURSIVE FUNCTION ADALAH FUNCTION YANG MEMANGGIL DIRINYA SENDIRI.
 */

// Contoh kode factorial Loop dengan menggunakan For looping
fun iniKali(a:Int):Int{
    var total = 1

    for (i in a downTo 1){ // <= disini kita membuat dari perkalian berapa menurun ke 1
        total*=i
    }
    return  total
}

/**
 * LALU KITA AKAN MEMBUAT SEBUAH RECURSIVE FUNCTION DENGAN LOGIKA FOR LOPPING SEPERTI DI ATAS
 * SEPERTI CONTOH KODE BERIKUT :
 */
fun iniRecursive(a:Int):Int{
    return  when(a){
    1 -> 1
        else -> iniRecursive(a-1) * a // <= jadi disini dia akan memanggil function nya sendiri
        // dengan data di dalamnya yaitu data dia sendiri
       // yaitu a:Int,- 1,setiap hasil yang sudah dikali maka dikurangkan - 1.
    }
}
fun main() {
    println(iniKali(5))
    println(iniRecursive(5))
}