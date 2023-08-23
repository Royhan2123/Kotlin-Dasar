/**
 * CONST dan val adalah dua hal yang sama,yang membedakan ialah val hanya untuk kelas itu sendiri
 * sedangakan Const bersifat global yang dimana bisa mengambil nya dari luar kelas tersebut.
 * untuk code const di letakkan di luar function main(){} bukan di dalam,seperti berikut :
 */

// const nya harus disikan dengan nilai val yang tidak bisa di ubah,lalu kita panggil dia ke dalam
// func main(){} dan otomatis berhasil,seperti contoh berikut :
// dipaling bawah contoh const :
const val version = "1.8.0"
const val  laptop = "Asus"

fun main() {
    // ada dua jenis Penampung data yaitu var dan val
    /**
     * Var adalah sebuah tempat penampungan data yang bisa di ubah ubah data nya
     * Val adalah sebuah tempat penampungan data yang data nya tidak bisa di ubah
     * dalam js,dart,dsb. val seperti const
     * contoh penggunaannya :
     */

    // pertama kita membuat sebuah var name adalah nama Royhan
    var name = "Royhan"
    // lalu data dari name tadi yang data nya royhan di ubah lagi menjadi Rayhan
    name = "Rayhan"
    // ketika di print otomatis,var name yang barusan di ubah yang terpanggil yaitu Rayhan bukan Royhan
    print(name)

    println("")
    // sedangkan val data yang tidak bisa diubah :
    val names = "Royhan"
    // names = "Rizki" <= otomatis error
    print(names)
    // dan yang terpanggil hanyalah Royhan,yang datanya tidak bisa di ubah.

    /**
     * PENGGUNAAN NULL
     */
    println("")
    val namae:String? = null
    print(namae)

    println("")
    println("")
    /**
     * CONTOH PENGGUNAAN CONST
     */
    print("Laptop Saya adalah $laptop versi $version")
}