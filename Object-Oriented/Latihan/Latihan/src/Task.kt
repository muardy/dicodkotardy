/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */


class Cat(private val name: String) {
    // TODO 1
    var sleep: Boolean = false
        get() {
            print("Fungsi getter dipanggil\n")
            return field
        }
        set(value) {
            field = value
            print("Fungsi setter dipanggil\n")
        }
    fun toSleep() {
        if (sleep) {
            println("$name, sleep!")
        } else {
            println("$name, let's play!")
        }
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}