package quiz

// Program sederhana untuk penerapan array multidimensi
fun main() {
    var gkt = arrayOf<Array<Array<Int>>>()
    for (i in 0..2) {
        var ruang = arrayOf<Array<Int>>()
        for (j in 0..5) {
            var array = arrayOf<Int>()
            for (k in 0..6) {
                array += 0
            }
            ruang += array
        }
        gkt += ruang
    }
    gkt[1][2][3] = 1
    var lantai = 1
    for (ruang in gkt) {
        println("Lantai: $lantai")
        lantai += 1
        for (array in ruang) {
            for (value in array) {
                print("$value ")
            }
            println()
        }
        println("-----------------")
    }

}
