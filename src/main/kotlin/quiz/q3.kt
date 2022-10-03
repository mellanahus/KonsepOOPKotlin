package quiz

/* program sederhana untuk perulangan mundur berdasarkan dengan INPUTAN
menggunakan Do – While Loop atau For Loop */

fun main() {

    print("Masukkan nilai awal : ")
    var i = readLine()!!.toInt()
//    var i: Int = 50
    do {
        print("$i ")
        i--
    }
    while (i >= 40)
}
