fun main() {

    /**
     * Di dalam dart array biasanya menggunakan List,sedangkan di kotlin menggunakan Array itu sendiri
     */
    // dalam Dart,List<String>member = ["Royhan","Rayhan","Rehan"],sedangkan dalam kotlin
    // harus masukkan lagi arrayof(masukkan data) <= lalu masukkan data tersebut.
    val members:Array<String> = arrayOf("Royhan","Rayhan","Rehan")
    // set ialah untuk mengubah data yang ada di dalam array,dengan cara ambil index berapa,terus ubah
    // seperti contoh di bawah tersebut.
    members.set(0, "Rizki")
    // [] untuk memunculkan satu data array,dengan memasukkan index nya,sama seperti Dart.
    println(members[0])
    //size adalah untuk melihat berapa banyak data di dalam array tersebut.biasanya menggunakan length
    println(members.size)

    /**
     * TIPE DATA ARRAY NULL
     */
    // jadi disini kita membuat sebuah array null,yang dimana tipedata di dalam array nya kita kasih ?
    // dan untuk arrayof nya dijadikan arrayofNull(meminta length) <= di dalam kurung meminta berapa data
    // lalu ketika panggil var array yaitu member,otomatis akan null,lalu bagaimana supaya yang null tadi
    // berisi menjadi sebuah data,tinggal kita panggil saja var array nya yaitu member[length] <=
    // terus kita isikan index ke berapa data tersebut seperti contoh di bawah:
    val member:Array<String?> = arrayOfNulls(4)
    // ini kita isikan member[0] = "Royhan" <= otomatis ketika di panggil index 0,maka muncul nama Royhan
    member[0] = "Royhan"
    //dan apabila memanggil index lain seperti :1,2,3 <= otomatis akan menjadi null,karena datanya kosong
    print(member[0])
    println()
    print(member[1])
}