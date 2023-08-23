/**
 * FUNCTION VARGS ADALAH VARIABEL ARUGEMENTS
 * JADI DISINI KITA AKAN MEMBUAT SEBUAH ARRAY DI DALAM FUNCION MENGGUNAKAN VARGS
 * SEPERTI CONTOH KODE BERIKUT :
 * DISINI KITA AKAN MEMBUAT SEBUAH FUNCTION MEMBUAT SEBUAH ARRAY TANPA MENGGUNAKAN VARGS
 */

fun iniarray(a:Array<Int>):Int{ // <= jadi disini kita membuat sebuah var a ke array<int>
var total = 0 // <= lalu kita membuat sebuah variabel total = 0
    for (value in a){ // <= yang dimana kita membuat sebuah perulangan,value in a
        total+=value // <= lalu kita akan menambahkan hasil total+= ke value,pertambahan yang dimulai dari 0
    }
    return  total // <= lalu kita kembalikan nilai total
}

/**
 * LALU BAGAIMANA KETIKA INGIN MEMBUAT SEBUAH ARRAY YANG MUDAH
 * KITA AKAN MENGGUNAKAN VARGS
 * SEPERTI CONTOH KODE BERIKUT.
 */

fun iniData(vararg a:Int):Int{ // <= untuk awalan kita harus membuat sebuah vararg nya dulu.
    var total = 0 // <= lalu kita membuat sebuah variabel total = 0
    for (value in a){ // <= yang dimana kita membuat sebuah perulangan,value in a
        total+=value // <= lalu kita akan menambahkan hasil total+= ke value,pertambahan yang dimulai dari 0
    }
    return  total // <= lalu kita kembalikan nilai total
}
fun main() {
    var valeu = arrayOf(10,10,10) // <= cara pertama kita buat dlu var yang mengandung array
    var result = iniarray(valeu) // <= lalu kita buat juga var yang mengandung fun tersebut,dengan data var array tersebut.
    println(result) // <= lalu kita print hasilnya.

    println()

    /**
     * LALU KETIKA DI PRINT OTOMATIS KITA AKAN MENGISI NYA LANGSUNG DI FUN INIDATANYA LANGSUNG
     * SEPERTI BERIKUT :
     */

    println(iniData(10,20,30,40,50,60,70,80,90,100)) // <= seperti berikut.
    // otomatis akan menambahkan a + 0,yang dimana nilai a seperti di atas.
    // dengan hasilnya : 550
}