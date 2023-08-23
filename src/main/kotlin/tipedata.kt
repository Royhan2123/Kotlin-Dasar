fun main(){
    //di dalam kotlin,untuk memanggil integer,variabel nya dluan di panggil baru nama tipe datanya
    // contoh nya seperti var umur:int <= disitu saya membuat sebuah variabel
    // umur:(: titik dua adalah memanggil tipe datanya)jadi,umur:int,saya panggil tipe data int ke var umur
    //seperti contoh di bawah:

    val umur:Int = 19
    print("Umur saya adalah ")
    print(umur)

    println("")

    val tinggiBadan:Double = 168.5
    print("Tinggi badan saya iala ")
    print(tinggiBadan)

    println("")
    println("")

    //oke untuk di kotlin,dia ada bilangan hexadecimal dan bilangan biner 01
    //berikut contoh penggunaanya :

    var intbiasa:Int = 10
    var hexadecimal:Int = 0xff
    var binarydecimal:Int = 0b001010101

    println(intbiasa)
    println(hexadecimal)
    println(binarydecimal)

    println("")

    //di dalam kotlin dan java,mereka bisa menambahkan underscore ke isi tipe data nya,contohnya seperti:
    //disini kita akan membuat var a = 1000000000 <= 1 miliar,tetapi kita susah bacanya bukan ?
    //nah underscore tersebut membuat kita lebih gampang membaca berapa data int nya:

    /**
     * SEBELUM DIKASIH UNDERSCORE *
     */
    var a:Int = 1000000000
    /**
     * Sesudah dikasih Underscore,tidak ada efeknya.cuman lebih mudah di baca saja.
     */
    a = 1000_000_000
    print(a)

    println("")
    println("")
    /**
     * Untuk mengkonversi bilangan int ke double misalnya gampang saja tinggal
     * (nama var):(namaTipedata)=(nama bar).to(namaTipedata)
     * contohnya seperti dibawah :
     */
    var number:Int = 100
    var inttoDouble:Double = number.toDouble()
    print(inttoDouble)
    println("")
    println("")

    //penggunaan tipe data number jika menggunakan logika perbandingan:

    //penggunaan tipe data number jika menggunakan logika perbandingan:

    if (umur <= 18){
        println("Umur anda di bawah " + umur + "Tahun")
    }else{
        println("Umur anda di atas " + umur + " Tahun")
    }
}