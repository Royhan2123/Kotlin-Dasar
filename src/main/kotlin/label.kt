/**
 * LABEL ADALAH SEBUAH PENANDA UNTUK KODE YANG KITA BUAT,CONTOH LABEL ADALAH BERUPA @ <= SAMA SEPERTI DI PHP
 * BERIKUT CONTOH PENGGUNAANYA :
 */

/**
 * DISINI KITA MEMBUAT SEBUAH PERULANGAN DARI PERKALIAN 1 - 10 DENGAN DUA PERULANGAN
 * LALU KITA INGIN MENGHENTIKAN SALAH SATU PERULANGAN TERSEBUT,BAGAIMANA CARANYA ?
 * DENGAN CARA KITA KASIH PENANDA DULU DI AWAL SEBELUM TIPE DATA NYA.YAITU @
 * SEPERTI CONTOH KODE BERIKUT ::
 */
fun test(name:String,param:(String) -> (Unit)):Unit = param(name)

fun main() {
    loopi@ for (i in 1..10) { // <= adalah sebuah penanda,jadi kita bisa pangill penanda ini
        loopj@ for (j in 1..10) {
            println("$i x $j = ${j * i}")
            if (j == 10) {   // <= bisa untuk kita buat break juga
                break@loopi // <= dengan penanda tersebut @nama_penanda
            }
        }
        test("Royhan") testlabel@{
            if (it == "Roy") {
                return@testlabel
            }
        }
    }
}
