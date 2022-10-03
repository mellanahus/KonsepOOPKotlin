package latihanKotlin

// Contoh Penerapan Secondary Constructor

class City2 {
    var namaKota: String = ""
    var julukan: String = ""

    constructor(_namaKota: String, _julukan: String) {
        namaKota = _namaKota
        julukan = _julukan
    }
}

    fun main() {
        val k1 = City2("Bengkalis","Kota Terubuk")
        println("Nama Kota :  ${k1.namaKota}")
        println("Julukan :  ${k1.julukan}")
    }
