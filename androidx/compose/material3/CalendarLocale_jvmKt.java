package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A1\u0010\u0006\u001A\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007*\n\u0010\t\"\u00020\b2\u00020\b¨\u0006\n"}, d2 = {"", "minDigits", "maxDigits", "", "isGroupingUsed", "", "toLocalString", "(IIIZ)Ljava/lang/String;", "Ljava/util/Locale;", "CalendarLocale", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCalendarLocale.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarLocale.jvm.kt\nandroidx/compose/material3/CalendarLocale_jvmKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,61:1\n361#2,7:62\n*S KotlinDebug\n*F\n+ 1 CalendarLocale.jvm.kt\nandroidx/compose/material3/CalendarLocale_jvmKt\n*L\n53#1:62,7\n*E\n"})
public final class CalendarLocale_jvmKt {
    public static final WeakHashMap a;

    static {
        CalendarLocale_jvmKt.a = new WeakHashMap();
    }

    @NotNull
    public static final String toLocalString(int v, int v1, int v2, boolean z) {
        String s = v1 + '.' + v2 + '.' + z + '.' + Locale.getDefault().toLanguageTag();
        WeakHashMap weakHashMap0 = CalendarLocale_jvmKt.a;
        NumberFormat numberFormat0 = weakHashMap0.get(s);
        if(numberFormat0 == null) {
            numberFormat0 = NumberFormat.getIntegerInstance();
            numberFormat0.setGroupingUsed(z);
            numberFormat0.setMinimumIntegerDigits(v1);
            numberFormat0.setMaximumIntegerDigits(v2);
            weakHashMap0.put(s, numberFormat0);
        }
        return numberFormat0.format(v);
    }

    public static String toLocalString$default(int v, int v1, int v2, boolean z, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v1 = 1;
        }
        if((v3 & 2) != 0) {
            v2 = 40;
        }
        if((v3 & 4) != 0) {
            z = false;
        }
        return CalendarLocale_jvmKt.toLocalString(v, v1, v2, z);
    }
}

