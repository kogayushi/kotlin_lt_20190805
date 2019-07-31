package kotlin_lt.value_object

import java.time.LocalDate

data class ExpirationDate(val value: LocalDate) {
    init {
        if(value <= LocalDate.now()) {
            throw IllegalArgumentException("expiration date should be future date !")
        }
    }
}
