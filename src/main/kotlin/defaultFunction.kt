fun helloWorld(name:String,lastname:String= ""){ // <- MEMBUAT STRING DARI LASTNAME = NULL
    // BISA JUGA YANG NULL ITU MENJADI SEBUAH DATA KOSONG SEPERTI LASTNAME:STRING = ""
    if (lastname == null){ // <- JIKA LASTNAME = NULL / KOSONG ?
        println("nama anda adalah $name") // <- MAKA HANYA MENAMPILKAN PARAMETER $NAME SAJA
    }else{ // <- JIKA TIDAK
        println("Nama Anda adalah $name $lastname") // <- AKAN MENAMPILKAN DUA PARAMETER.
    }
}

fun main() {
    helloWorld("Royhan") // <- parameter LASTNAME TIDAK DI ISI DAN OTOMATIS AKAN MENJALANKAN $NAME
    helloWorld("Royhan","han") // <- DUA PARAMETER DI ISI OTOMATIS SEKALI DUA TERISI
}