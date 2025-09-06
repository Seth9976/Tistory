package androidx.compose.material3;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0003\u001A\u00020\u00022\n\u0010\u0006\u001A\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"androidx/compose/material3/DatePickerStateImpl$Companion", "", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/q7;", "Saver", "(Landroidx/compose/material3/SelectableDates;Ljava/util/Locale;)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DatePickerStateImpl.Companion {
    public DatePickerStateImpl.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public final Saver Saver(@NotNull SelectableDates selectableDates0, @NotNull Locale locale0) {
        p7 p70 = new p7(selectableDates0, locale0, 0);
        return ListSaverKt.listSaver(u4.D, p70);
    }
}

