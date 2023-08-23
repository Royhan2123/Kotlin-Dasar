/**
 * JADI DI SINI KITA AKAN MEMBUAT SEBUAH SINGLE EXPRESSION,ATAUPUN DALAM DART NAMA NYA SHORT EXPRESSION
 * BIASANYA KITA INGIN MENGEMBALIKAN NILAI FUN TERSEBUT,HARUS MENGGUNAKAN RETURN
 * KALAU DI DALAM DART,BIASANYA MENGGUNAKAN (=>) <= LANGSUNG TERUS MENGISI DATANYA,TANPA MEMBUAT RETURN
 * JADI DISINI KITA AKAN MEMBUAT SINGLE EXPRESSION,SEPERTI CONTOH KODE BERIIKUT :
 */

fun pertambahan(a:Int,):Int = a + 8// <= contoh single expression hanya satu data saja
// yang bisa di masukkan.milsanya di atas kita membuat tipe data Int:a -> yang dimana a
// nya itu bersifat dinamis,sedangakan kita ingin menambahkan angka lagi
// jadi tinggal kita tambahkan saja angka nya berapapun itu.seperti contoh di atas. a + 8
// kalau ingin di tambahkan lagi setelah 8 juga bisa,a + 8 + 10 <= juga boleh
// yang penting data nya harus cuman satu terisi,jadi kita tidak memerlukan kurung kurawal lagi {}

/**
 * KALAU UNTUK STRING BAGAIMANA,SAMA SEPERTI SEBELUMNYA,CUMAN BISA MEMASUKKAN SATU DATA SAJA
 * TETAPI KALAU STRING,LANGSUNG BUAT PRINTLN DI DALAMNYA
 * SEPERTI CONTOH KODE BERIKUT :
 */
 public fun iniString(name: String): String {
    return  "nama saya adalah $name"
}
// seperti contoh kode di atas,kita tidak perlu lagi memasukkan tipe data :String <= di samping kurung.
// karena otomatis String itu bawaan dari return Unit yang terdefault.
// jadi langsung saja masukkan println nya.di karenakan emang udah memasukkan return UNIT nya

fun main() {
    println(pertambahan(10)) // <= otomatis akan terisi 18
    iniString("Royhan") // <= otomatis akan terisi nama Royhan dari data fun iniString
}