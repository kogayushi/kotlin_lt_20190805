package kotlin_lt.extension

fun String?.isNullOrEmpty(): Boolean {
    return this == null || this.isEmpty()
}
