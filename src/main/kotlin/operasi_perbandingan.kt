fun main() {

    /**
     * OPERATOR PERBANDINGAN
     */

    // disini kita akan mencari lulus atau tidak nilai kelulusan dan nilai tugas

    val nilaiTugas = 80
    val nilaiAbsen = 70

    if (nilaiTugas >= 75 && nilaiAbsen >= 75){
        println("SELAMAT ANDA LULUS")
    }else{
        println("MAAF ANDA GAGAL")
    }

    val a = 20
    val b = 21

    if (a == b){
        println(true)
    }else{
        println(false)
    }

    if (a != b){
        println(true)
    }else{
        println(false)
    }
}