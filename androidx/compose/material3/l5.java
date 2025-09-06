package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel_androidKt;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;

public final class l5 implements DatePickerFormatter {
    public final String a;
    public final String b;
    public final String c;
    public final LinkedHashMap d;

    public l5(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = new LinkedHashMap();
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof l5)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((l5)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((l5)object0).b) ? Intrinsics.areEqual(this.c, ((l5)object0).c) : false;
    }

    @Override  // androidx.compose.material3.DatePickerFormatter
    public final String formatDate(Long long0, Locale locale0, boolean z) {
        if(long0 == null) {
            return null;
        }
        long v = (long)long0;
        return z ? CalendarModel_androidKt.formatWithSkeleton(v, this.c, locale0, this.d) : CalendarModel_androidKt.formatWithSkeleton(v, this.b, locale0, this.d);
    }

    @Override  // androidx.compose.material3.DatePickerFormatter
    public final String formatMonthYear(Long long0, Locale locale0) {
        return long0 == null ? null : CalendarModel_androidKt.formatWithSkeleton(((long)long0), this.a, locale0, this.d);
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + q.c(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }
}

