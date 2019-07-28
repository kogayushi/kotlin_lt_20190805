package kotlin_lt;

import kotlin.jvm.internal.Intrinsics;
import kotlin_lt.operator_overload.ExpirationDate;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public final class CurrentDate {
    @NotNull
    private final LocalDate value;

    public final int compareTo(ExpirationDate value) {
        Intrinsics.checkParameterIsNotNull(value, "value");
        return this.value.compareTo((ChronoLocalDate) value.getValue());
    }

    @NotNull
    public final LocalDate getValue() {
        return this.value;
    }

    public CurrentDate(LocalDate value) {
        Intrinsics.checkParameterIsNotNull(value, "value");
        this.value = value;
    }
}
