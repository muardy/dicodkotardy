/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println("""String result: $stringResult""")
    println("""Int result: $intResult """)
}

// TODO 1
fun <T> getResult(args: T): Int {


    if (args is String && args.length > 0) {
        return args.length
    }


    if (args is Int && args > 0) {
        return args*5
    }
    return 0
}