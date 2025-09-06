package androidx.compose.material3.internal;

import android.text.format.DateFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\u001A\u0014\u0010\u0000\u001A\u00020\u00012\n\u0010\u0002\u001A\u00060\u0003j\u0002`\u0004H\u0000\u001A8\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u00062\n\u0010\u0002\u001A\u00060\u0003j\u0002`\u00042\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000BH\u0000¨\u0006\r"}, d2 = {"createCalendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "formatWithSkeleton", "", "utcTimeMillis", "", "skeleton", "cache", "", "", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCalendarModel.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModel.android.kt\nandroidx/compose/material3/internal/CalendarModel_androidKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,67:1\n361#2,7:68\n*S KotlinDebug\n*F\n+ 1 CalendarModel.android.kt\nandroidx/compose/material3/internal/CalendarModel_androidKt\n*L\n57#1:68,7\n*E\n"})
public final class CalendarModel_androidKt {
    @NotNull
    public static final CalendarModel createCalendarModel(@NotNull Locale locale0) {
        return new CalendarModelImpl(locale0);
    }

    @NotNull
    public static final String formatWithSkeleton(long v, @NotNull String s, @NotNull Locale locale0, @NotNull Map map0) {
        String s1 = "S:" + s + locale0.toLanguageTag();
        String s2 = map0.get(s1);
        if(s2 == null) {
            s2 = DateFormat.getBestDateTimePattern(locale0, s);
            map0.put(s1, s2);
        }
        return CalendarModelImpl.Companion.formatWithPattern(v, s2.toString(), locale0, map0);
    }
}

