
/**
 * EXTENSION FUN ADALAH SEBUAH METHOD TAMBAHAN,
 * CONTOH NYA KITA MEMBUAT SEBUAH FUN DENGAN TIPE DATA STRING
 * LALU KITA AKAN MEMBUAT SEBUAH EXTENSION NYA MENGGUNAKAN (.)
 * CONTOH SEPERTI BERIKUT :
 */

fun String.iniString():String = "Hello $this" // <= disini awalan nya harus menggunakan tipe data.
// lalu kita kasihkan $this,yang dimana $this itu adalah data yang ingin di tambahkan.
// seperti contoh kode nya yang ada di fun main(),kalau tidak menggunakan $this otomatis
// yang akan terpanggil hanya data dari fun iniString saja().
// lalu kita akan menambahkan method terbaru yaitu extension function dengan menggunakan titik.
// lalu kita isikan fun tersebut dengan data nya,seperti contoh di atas datanya adalah ROYHAN
fun main() {

    println("Nama saya Royhan".iniString()) // <= kira kira seperti cara pemanggilan nya
    // dia akan otomatis memanggil data iniString dlu,baru data dari println()
    // yang dimana datanya adalah seperti contoh di atas : "Hello nama saya Royhan"
    // iniString yang berupa hello otomatis akan terpindah ke awal.
}