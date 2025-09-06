package androidx.compose.material3;

import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J/\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\u0010\u0006\u001A\u00060\u0007j\u0002`\b2\b\b\u0002\u0010\t\u001A\u00020\nH&¢\u0006\u0002\u0010\u000BJ%\u0010\f\u001A\u0004\u0018\u00010\u00032\b\u0010\r\u001A\u0004\u0018\u00010\u00052\n\u0010\u0006\u001A\u00060\u0007j\u0002`\bH&¢\u0006\u0002\u0010\u000Eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000FÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/DatePickerFormatter;", "", "formatDate", "", "dateMillis", "", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "forContentDescription", "", "(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;", "formatMonthYear", "monthMillis", "(Ljava/lang/Long;Ljava/util/Locale;)Ljava/lang/String;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface DatePickerFormatter {
    @Nullable
    String formatDate(@Nullable Long arg1, @NotNull Locale arg2, boolean arg3);

    static String formatDate$default(DatePickerFormatter datePickerFormatter0, Long long0, Locale locale0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatDate");
        }
        if((v & 4) != 0) {
            z = false;
        }
        return datePickerFormatter0.formatDate(long0, locale0, z);
    }

    @Nullable
    String formatMonthYear(@Nullable Long arg1, @NotNull Locale arg2);
}

