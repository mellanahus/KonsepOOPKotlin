package latihanKotlin

class People {
    var umur = 0
    var semester = ""
}

fun myFunction2(umur: Int, semester: String) {
    println("Umur dia sekarang " + umur + " Tahun. " +
            "Dan sekarang berada di semester " + semester)

}

fun main() {
    val people = People()
    people.umur = 19
    people.semester = "Lima"

    val people2 = People()
    people2.umur = 21
    people2.semester = "Tujuh"

    println(people.umur)
    println(people.semester)
    println(people2.umur)
    println(people2.semester)

    // Perintah memanggil method yang berada di class Person dan Community

    myFunction1()
    myFunction3(215)

    val p1 = Person("Husna", "Wanita")
    println("Haii " + p1.nama + ", Tetap Jadi Pejuang " + p1.jk + " yang Hebat yaa" )

    val c2 = Community()
    c2.grup = "Mahasiswa Peduli Lingkungan"
    c2.masa = "Sudah berjalan 3 Tahun"
    println("Selamat Bergabung di Komunitas " + c2.grup + " yang " + c2.masa)



}