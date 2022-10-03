package latihanKotlin

class Community {
    var grup = ""
    var masa = ""
}

fun myFunction3(jmember: Int) {
    println("Jumlah anggota seluruh komunitas sekarang ada " + jmember)
}

fun main() {
    myFunction3(321)

    val c1 = Community()
    c1.grup = "Mahasiswa Pecinta Alam"
    c1.masa = "Sudah berjalan 3 Tahun"

    val c2 = Community()
    c2.grup = "Mahasiswa Peduli Lingkungan"
    c2.masa = "Sudah berjalan 3 Tahun"


    // Perintah memanggil method yang berada di class Person dan People

    myFunction1()
    myFunction2(20,"Lima")

    val p2 = Person("Afel","Pria")
    println("Selamat bergabung " + p2.nama)
    println("Tetap semangat yaa jadi pejuang " + p2.jk + " yang hebat untuk Indonesia")

    val people2 = People()
    people2.umur = 21
    people2.semester = "Tujuh"
    println("Umur kamu " + people2.umur + " Tahun" )
    println("Sekarang kamu berada di semester " + people2.semester)

}