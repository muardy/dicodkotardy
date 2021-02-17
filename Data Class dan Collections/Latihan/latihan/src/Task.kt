/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>("1" to "Motorcycle",
            "2" to "230Km/s",
            "3" to "10Ltr" )

    // TODO 2
    val type = vehicle["1"]
    val maxSpeed = vehicle["2"]
    val maxTank = vehicle["3"]

    // TODO 3
    println("Type: $type\nMaximal Speed: $maxSpeed\nMaximal Tank: $maxTank" )


}