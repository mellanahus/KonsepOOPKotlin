package latihanKotlin

class Person(_nama: String, _jk: String) {

    var nama: String = _nama
        get() = field
        set(value) {
            field = value
        }

    var jk: String = _jk
        get() = field
        set(value) {
            field = value
        }
}

fun myFunction1() {
    println("Selamat Bergabung di Komunitas Semangat Mahasiswa")
}


fun main() {
    val p1 = Person("Rey", "Pria")
    println("Nama : ${p1.nama}, Jenis Kelamin : ${p1.jk}")
    val p2 = Person("Ratih", "Wanita")
    println("Nama : ${p2.nama}, Jenis Kelamin : ${p2.jk}")

}