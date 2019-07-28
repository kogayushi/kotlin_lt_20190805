package kotlin_lt.if_when_are_expression

fun loveIf(language: String): String {
    val result = if (language.equals("KOTLIN", ignoreCase = true)) {
        "❤️"
    } else {
        "💔"
    }
    return "$language $result"
}

fun loveWhen(language: String): String {
    val result = when (language.toUpperCase()) {
        "KOTLIN" -> "❤️"
        else -> "💔"
    }
    return "$language $result"
}
