package quiz

fun main() {
    var i: Int = 0
    while (i < 15) {
        print("$i ")
        i++
        if (i == 10) {
            continue
        } else if (i == 13){
            break
        }

    }
}