/**
 * HIGHER ORDER FUNCTION IALAH,MENAMBAHKAN DUA FUNCTION DALAM SATU DATA YANG INGIN DIPANGGIL.
 * PERTAMA TAMA KITA BUAT DLU SCOPE FUNCTION,SEPERTI CONTOH KODE BERIKUT:
 */
fun main() {
    // kita buat parameter nya terlebih dahulu,utmakan ketika kita ingin membuat higher order nya
    // pastikan kita kasih tipe data nya kurung biasa () -> lalu return ke nilai tipe data nya
    // seperti contoh kode berikut ini :
    fun hello(name:String,value:(String) -> (String)):String{
        // nama func nya hello dengan parameter name,dan function value yang berupa (string)
        // lalu di kembalikan ke nilai -> (String),lalu tipe data functionya yaitu string
        val iniHello = value(name)
        // lalu disini kita buat val nama_val = value(name) <= value adlaah nama func nya,yang mengandung name
        return  "nama saya adalah $iniHello"
        // lalu kita kembalikan langsung ke string ""
        // "nama saya adalah ($nama_val)"
    }
    // lalu kita buatkan lambda expression nya,cara buatnya gampang sekali,kita cuman memerlukan kurawal saja
    // lalu isi datanya seperti biasa :
    val lambda = {value:String -> value.toUpperCase()}
    // value:String -> value.toUppercase() <= value return ke nilai value tadi.value.toUppercase()
    println(hello("Royhan",lambda)) // <= lalu disini tinggal kita panggil saja nama function scope nya
    // lalu kalau misalnya kita cuman satu otomatis error,karena memasukkan satu func lagi di dalam func hello
    // di samping name:String,kita memasukkan val lambda yang membuat value nya itu sendiri jadi huruf kapital.
    // jadi otomatis,name:String <- yang kita isi akan mereturn ke value yang akan menjadi huruf kapital.

    /**
     * ADA JUGA YANG NAMANYA TRAILING LAMBDA MENGGUNAKAN HIGHER ORDER FUNCTION YANG DIMANA,
     * PEMBUATANYA LEBIH SIMPLE DAN LEBIH MUDAH DIBACA.
     * SEPERTI CONTOH KODE BERIKUT.
     */

    val result = hello("Rizki") {value:String -> value.toLowerCase()}
    println(result)
    // kita tinggal membuat sebuah val baru,lalu masukkan scope function nya,
    // lalu di samping itu,kita membuat lambda baru nya dengan cara menggunakan kurung kurawal
    // lalu isinya kita buat sama seperti contoh kode di atas.
    // lalu kita printkan val nama_val <- nya,dan otomatis data dari scope function itu,akan mengisi
    // data dari lambda tersebut,
}