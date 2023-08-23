fun main() {
    /**
     * DISINI KITA AKAN MEMBUAT SEBUAH TIPE DATA RANGE
     */
    // yang di bawah ialah dari 0 ke 1000
    val range = 0..1000 step 2
    // yang di bawah ialah dari 1000 ke 0
   val ranges = 1000 downTo  0 step 2
    println(range)
    /**
     * COUNT UNTUK MELIHAT HASIL KESELURUHAN RANGE TERSEBUT YAITU : 1001
     */
    println(range.count())
    /**
     * CONTAINS ADALAH DATA YANG ADA DI DALAM RANGE.CONTOH RANGE 1000,CONTAINS(30) <= OTOMATIS ADA
     * BERARTI TRUE. <= HANYA BERSIFAT BOOLEAN SAJA
     */
    println(range.contains(30))
    /**
     * CONTAINS ADALAH DATA YANG ADA DI DALAM RANGE.CONTOH RANGE 1000,CONTAINS(1001) <= OTOMATIS GADA
     * BERARTI FALSE. <= HANYA BERSIFAT BOOLEAN SAJA
     */
    println(range.contains(1001))
    /**
     * AWALAN DARI RANGE 1000 YAITU 0,KARENA DATA AWAL RANGE IALAH = 0..1000 <= OTOMATIS 0
     */
    println(range.first())
    /**
     * AKHIRAN DARI RANGE 1000 YAITU 1000,KARENA DATA AKHIR RANGE IALAH = 0..1000 <= OTOMATIS 1000
     */
    println(range.last())
    /**
     * DIKIRA PER/STEP YAITU 1,
     *
     */
    println(range.step)
}