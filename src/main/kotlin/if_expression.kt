fun main() {
    /**
     * Disini kita akan mencoba if tennary dalam KOTLIN walapun tidak ada
     *
     */

    // if tennary dalam DART
    // void main(){
    // int nilaiTugas = 20
    // var total = nilaiTugas >= 10 ? "SELAMAT ANDA LULUS " : "MAAF ANDA GAGAL"
    // print(total) <= otomatis hasiilnya "SELAMAT ANDA LULUS"
    // }

    // dalam kotlin
    var nilaiTugas:Int = 20
    var hasil = if (nilaiTugas >= 10) "SELAMAT ANDA LULUS" else "MAAF ANDA GAGAL"
    print(hasil)
}