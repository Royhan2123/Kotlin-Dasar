
/**
 * JADI DISINI KITA AKAN MEMBUAT FUNCTION RETURN VALUE,YANG DIMANA KITA AKAN MENAMBAHKAN TIPE DATA
 * SEBELUMNYA KITA SUDAH MEMBAHAS APA ITU UNIT,SEKARANG KITA AKAN MEMBUAT TIPE DATA DENGAN MENGEMBALIKAN
 * TIPE DATA TERSEBUT,SEPERTI CONTOH BERIKUT.
 */
fun pertambahan (a:Int,b:Int):Int{ // <= disini kita akan membuat tipe data INT
    var jumlah = a + b // <= disi kita akan membuat sebuah var untuk menampung datanya
    return  jumlah // <= lalu kita kembalikan var yang menampung data tersebut.
} // <= otomatis kalau datanya belum diisi ketika tipe data dimasukkan,otomatis akan error.

/**
 * JADI UNTUK STRING BAGAIMANA,YA TINGGAL GANTI AJA YANG INT -> STRING
 * SEPERTI CONTOH BERIKUT :
 */
fun iniString (a:String,b:String):String{
    return  "Hi nama Saya adalah $a umur saya adalah $b" // <= return langsung ke String ""
}

/**
 * LALU MENGGUNAKAN LOGIKA PERBANDINGAN,SEPERTI IF ELSE,AKAN KITA BUAT CONTOHNYA MENGGUNAKAN INT
 * SEPERTI KODE BERRIKUT.
 */
fun pembagian(a:Int,b:Int):Int{
    if (b == 0 && a == 0){ // <= disini kita akan membuat jika a dan b di bagi 0 maka hasilnya 0
        return  0 // <= maka hasilnya 0,akan return ke 0
    }else{ // <= jika tidak
        var hasil = a / b // <- maka kita akan membagikan a & b
        return  hasil // <= lalu kita returkan nama variabel tersebut.
    }
}


fun main() {
    println(pertambahan(20,20)) //<= lalu ketika kita panggil,sama seperti biasa,kita langsung mengisikan datanya
    println(iniString("Royhan","14")) // <= tinggal panggil fun String,dan isi data berupa String.
    println(pembagian(0,12)) // <= ketika kita membuat pembagian 0,maka akan mereturn 0
    println(pembagian(12,12)) // <= jika tidak maka akan terjadi pembagian
}