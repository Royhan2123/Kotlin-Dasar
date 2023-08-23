fun main() {
    /**
     * HAMPIR SAMA DENGAN DART,PENGGUNAAN STRING KETIKA INGIN LANGSUNG DI KASIH ENTER TANPA MENAMBAHKAN
     * PRINT,YAITU MENGGUNAKAN """ """ <= ADA 3 STRING NYA,KALAU DI DART ''' ''' <= DART
     */
    var firstname:String = "Royhan"
    var alamat:String = "Medan"

    print("Nama Saya adalah ")
    print(firstname)
    println("")
    print("Alamat Saya di ")
    print(alamat)

    println("")
    println("""Uzumaki Naruto 
        |&
Uciha Sasuke
    """.trimMargin())

    println("")
    println("")

    var nama:String = "Royhan"
    var umur:Int = 19

    var desc = "Nama Saya adalah ${nama},dan umur saya adalah ${umur},total nama saya ada ${nama.length}"
    print(desc)
}