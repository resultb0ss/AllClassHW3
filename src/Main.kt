fun main() {

    operation("1", 'i')
    operation("234", 'l')
    operation(1, 'c')

}

fun <T> operation(value: T, ch: Char){
    when (ch) {
        'i' -> println("{${value as Int}}")
        'l' -> println(value as List<*>)
        's' -> println("[${value as String}]")
        'c' -> println("(${value as Char})")
    }

}