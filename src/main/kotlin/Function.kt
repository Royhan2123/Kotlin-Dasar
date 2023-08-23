
/**
 * DISINI KITA MENAMBAHKAN PARAMETER BERUPA STRING DAN INT.
 * BERIKUT ADALAH CONTOH PENGGUNAANYA :
 * JADI SAYA MEMBUAT VAR NAME -> STRING,DAN VAR UMUR -> INT
 * LALU DI DALAM FUNC TERSEBUT SAYA MENAMBAHKAN
 * PRINTLN(NAMA SAYA ADALAH $NAME) <- OTOMATIS NNTI KETIKA DI PANGGIL DI MAIN FUNC
 * AKAN MENAMBAHKAN PARAMETER SI VAR STRING NAME <-,KITA AKAN MENGISI DATANYA KETIKA DATANYA DI PANGGIL
 * SAMA SEPERTI VAR UMUR -> INT JUGA OTOMATIS SEKALI DUA HARUS DI ISI,YAITU (NAME:STRING)DAN (UMUR:INT)
 */
fun namasaya(name:String,nameLast:String?,umur:Int){ // <- Peletakan parameter nya ada di dalam kurung function nya
    if (nameLast == null){ // <- disini kita membuat sebuah parameter nya berupa NULL,sehingga kita buat
        // logika perbandingan seperti di atas.
        print("Nama Saya : $name dan ") // <- jika nameLast nya null,
        // maka dia hanya menampilkan 2 parameter saja
        print("Umur saya : $umur")
        println()
    }else{
        println("Nama Saya : $name ") // <- jika tidak maka dia akan menampilkan 3 parameter seperti berikut:
        println("Nama belakang  saya : $nameLast")
        println("Umur saya : $umur")
    }
}

fun main() {

    /**
     * JADI DISINI KITA AKAN MEMBUAT SEBUAH FUNCTION()
     * YANG DIMANA DI DALAM DART MEMBUAT SEBUAH FUNCTION MENGGUNAKAN VOID
     * TETAPI DI DALAM KOTLIN MENGGUNAKAN YANG NAMA NYA fun
     * FUN MAIN() <= MAIN ADALAH FUNCTION YANG MENGEKSEKUSI PROGRAM KOTLIN UNTUK DI JALANKAN
     * DAN FUN ADALAH NAMA FUNCTION NYA.
     * CONTOH PENGGUNAAN SEPERTI BERIKUT .
     */

    namasaya("Royhan","Han",19)
    namasaya("Rayhan",null,17)
    namasaya("Reyhan","Han",18)
}