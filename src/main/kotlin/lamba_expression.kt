/**
 * LAMBDA ADALAH SEBUAH FUNCTION YANG TIDAK MEMILIKI FUNCTION ITU SENDIRI,KITA HARUS MEMPUNYAI VAl
 * SEHINGGA LAMBDA EXPRESSION NYA AKAN AKTIF.
 * SEPERTI CONTOH KODE BERIKUT :
 */

fun main() {
    val iniLambda:(String,String) -> String = { firstname: String, lastname: String -> // <= isi datanya disini
    // kalau ingin menambahkan lebih dari satu,harus juga menambahkan tipe datanya
        // di samping nama lambda tersebut, -> lalu return ke tipedata String,baru masukkan data nya
        // seperti di atas
        val result = "nama kmu adalah $firstname dan nama belakang kmu adalah $firstname"
    result
    }

    /**
     * LAMBDA INT
     */
    val inilambdaInt:(Int,Double) -> String = {umur:Int,Tinggibadan:Double ->
        val string = "Umur saya adalah $umur dan tinggi badan saya adalah $Tinggibadan"
        string // <= tidak usah menambahkan return nya lagi.
    }

    /**'
     * KALAU LAMBDA NYA CUMAN TERISI SATU,OTOMATIS AKAN TERISI,TIDAK LAMBDA LAGI,DAN OTOMATIS LANGSUNG
     * MERETURN NILAI FUNCTION ITU SENDIRI,SEPERTI CONTOH KODE BERIKUT.
     */

    val iniLambdaIt:(String) -> String = {"Nama saya adalah $it"} // <= tidak mereturn nilai lambda lagi
    // hanya bisa mengakses satu data saja.

    /**
     * LALU BAGAIMANA KETIKA LAMBDA NYA INGIN MENGGUNAKAN FUNCTION.
     * SEPERTI CONTOH KODE BERIKUT :
     */
    println(iniLambda("Royhan","Rizki")) // <= baru tinggal masukkan saja disini
    // dia tidak akan ada terisi,firstname ataupun lastname ketika memasukkan lambda seperti func lainnya.
    println(inilambdaInt(19,175.0))
    println(iniLambdaIt("Royhan")) // <= otomatis akan berhasil.

    val lambda:(String) -> String = ::iniLambda // <= kita harus memerlukan :: setelah sama dengan untuk
            // menggabungkan function dari luar ke lambda

    println(lambda("Rayhan")) // <- lalu tinggal masukkan datanya di function lambda yang ada di fun main.
}
fun iniLambda(name:String):String = "nama kmu adalah $name" // <= di function tidak memerlukan kurawal lagi.
// langsung masukkan kode sesingkat ini saja,terus buat lagi fun lambda nya di function main.
