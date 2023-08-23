/**
 * DISINI KITA AKAN MEMBUAT SEBUAH FUNCTION RETURN IF DAN WHEN
 * BIASANYA UNTUK MENGGUNAKAN IF,DI SETIAP IF DAN ELSE NYA HARUS DI RETURN
 * TETAPI KITA TIDAK AKAN MERETURN DI KEDUA NYA LAGI,HANYA DI IF SAJA
 * JADI RETURN IF,SEPERTI CONTOH KODE BERIKUT :
 */

/**
 * JADI DISINI KITA AKAN MENCARI NILAIABSEN DAN NILAITUGAS DENGAN LOGIKA PERBANDINGAN
 */
fun iniIf(nilaiAbsen:Int,nilaiTugas:Int):String{ // <= jadi disini kita membuat datanya menggunakan int
    return  if (nilaiAbsen >= 80 && nilaiTugas >=80){ // <= lalu tinggal kita buat aja return nya langsung ke if
        "Selamat Anda Lolos" // <= supaya tidak di isi disini return nya,karena berupa String tipedatanya
    }else{
        "Maaf Anda Gagal" // <= disini juga tidak menggunakan return lagi.
    }
}

/**
 * LALU BAGAIMANA DENGAN WHEN,YAK SAMA SEPERTI IF JUGA.
 * SEPERTI CONTOH BERIKUT.
 */

fun iniWhen(nilaiAbsen :String):String{
    return when(nilaiAbsen){
       "A","B","C" -> "Selamat Anda Lolos"
        else -> "Maaf Anda Gagal"
    }
}
fun main() {
    println(iniIf(85,90)) // <= otomatis akan berhasil,karena fun nya meminta >= 80
    println(iniWhen("C")) // <= otomatis akan berhasil,karena nilai nya ada di func iniWhen
}