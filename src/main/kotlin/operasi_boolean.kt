fun main() {
    val nilaiTugas = 80
    val nilaiAbsen = 70


    /**
     * && KETIKA ADA SATU YANG FALSE MAKA SEMUA FALSE
     */
    if (nilaiTugas >= 75 && nilaiAbsen >= 75){
        println("SELAMAT ANDA LULUS")
    }else{
        println("MAAF ANDA GAGAL")
    }

    /**
     * || KETIKA ADA SATU YANG TRUE MAKA SEMUA TRUE
     */
    if (nilaiTugas >= 75 || nilaiAbsen >= 70){
        println("SELAMAT ANDA LULUS")
    }else{
        println("MAAF ANDA GAGAL")
    }

    
}