package kotlin_lt.operator_overload

import java.time.LocalDate

data class ExpirationDate(val value: LocalDate) {
    operator fun compareTo(value: CurrentDate): Int {
        return this.value.compareTo(value.value)
    }
}

class CurrentDate(val value: LocalDate) {
    operator fun compareTo(value: ExpirationDate): Int {
        return this.value.compareTo(value.value)
    }
}
