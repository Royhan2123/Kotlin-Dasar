
/**
 * JADI DISINI KITA AKAN MEMBUAT SEBUAH INFIX FUNCTION
 * YANG DIMANA,INFIX INI SAMA SEPERTI EXTENSION FUNCTION YA,
 * MENGGUNAKAN (.) UNTUK PENGGUNAANNYA,TETAPI DI AWAL SEBELUM FUN,KITA AKAN MENAMBAHKAN INFIX DULU
 * SEPERTI CONTOH KODE BERIKUT :
 */
infix fun String.to(name:String):String{ // <= contoh kode nya sama seperti extension function
    if (name == "Roy"){  // <= lalu disini kita kasih logika perbandingan
        // jika ada "Roy" maka $name nya akan di perbesar
        return  this.toUpperCase()
    }else{ // <= jika tidak maka akan di perkecil
        return  this.toLowerCase()
    }
}

fun main() {
    /**
     * CONTOH PEMANGGILAN INFIX IALAH,LANGSUNG MASUKKAN NAMA FUNC TERSEBUT.
     * KALAU MISALNYA FUNC EXTENSION KAN HARUS MEMERLUKA TITIK,SEDANGKAN INFIX TIDAK DI PERLUKAN LAGI
     * INFIX HANYA AKAN AKTIF KETIKA DIA HANYA MEMPUNYAI SATU PARAMETER DAN TIDAK DEFAULT.
     * SEPERTI CONTOHNYA KITA AMBIL DALAM RANGE
     * DOWNTO <= YANG DIMANA OTOMATIS AKAN MENURUN HASILNYA,TETAPI ITU ADALAH FUN DARI INFIX INT
     */
    println("Nama saya adalah Royhan" to "Roy") // <= Sedangkan ini ialah sebuah fun infix
    // yang menggunakan String dan logika perbandingan,jadi cara pemanggilannya seperti di atas.

    println(100 downTo  2) // <= sama seperti range
}