package quiz

/* program sederhana untuk perhitungan LUAS dan KELILING Bidang Datar
menggunakan WHEN */

// Bagian a

fun main() {
    print("Masukkan nilai : ")
    val nilai = readLine()!!.toInt()

    when (nilai) {
        1 -> {
            println("Kamu memilih menghitung bidang persegi panjang")
            print("Masukkan nilai panjang : ")
            val np = readLine()!!.toInt()

            print("Masukkan nilai lebar : ")
            val nl = readLine()!!.toInt()

            var luasPP: Int = np * nl
            var kelilingPP: Int = 2 * ( np + nl)

            println("Luas persegi panjang = " + luasPP)
            println("Keliling persegi panjang = " + kelilingPP)
        }

        2 -> {
            println("Kamu memilih menghitung bidang lingkaran")
            print("Masukkan nilai jari-jari : ")
            val r = readLine()!!.toInt()

            var luasL: Double = 3.14 * r * r
            var kelilingL: Double = 2 * 3.14 * r

            println("Luas persegi panjang = " + luasL)
            println("Keliling persegi panjang = " + kelilingL)

        }

        3 -> {
            println("Kamu memilih menghitung bidang segitiga")
            print("Masukkan nilai alas : ")
            val a = readLine()!!.toInt()

            print("Masukkan nilai tinggi : ")
            val t = readLine()!!.toInt()

            print("Masukkan nilai sisi : ")
            val s = readLine()!!.toInt()

            var luasS: Double = 0.5 * a * t
            var kelilingS: Int = 3 * s

            println("Luas segitiga = " + luasS)
            println("Keliling segitiga = " + kelilingS)
        }
        else -> {
            print("Inputan yang dimasukkan tidak valid")
        }
    }
}