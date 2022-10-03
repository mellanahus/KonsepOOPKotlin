package latihanKotlin

// Contoh Penerapan Primary Constructor

class City(var _namaKota: String, var _julukan: String) {
    var namaKota: String = ""
    var julukan: String = ""
    init {
        namaKota = _namaKota
        julukan = _julukan
    }
}

fun main() {
    val k1 = City("Bengkalis","Kota Terubuk")

    println("Nama Kota : " + k1.namaKota)
    println("Julukan : " + k1.julukan)

}