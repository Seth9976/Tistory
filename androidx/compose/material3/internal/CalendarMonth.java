package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u0013\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001A\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJB\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0007H\u00C6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0011H\u00D6\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b \u0010\u0016J\u001A\u0010#\u001A\u00020\"2\b\u0010!\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0016R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b(\u0010&\u001A\u0004\b)\u0010\u0016R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b*\u0010&\u001A\u0004\b+\u0010\u0016R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010&\u001A\u0004\b-\u0010\u0016R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\u001BR\u0017\u00103\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b1\u0010/\u001A\u0004\b2\u0010\u001B\u00A8\u00064"}, d2 = {"Landroidx/compose/material3/internal/CalendarMonth;", "", "", "year", "month", "numberOfDays", "daysFromStartOfWeekToFirstOfMonth", "", "startUtcTimeMillis", "<init>", "(IIIIJ)V", "Lkotlin/ranges/IntRange;", "years", "indexIn", "(Lkotlin/ranges/IntRange;)I", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "", "skeleton", "format", "(Landroidx/compose/material3/internal/CalendarModel;Ljava/lang/String;)Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "component5", "()J", "copy", "(IIIIJ)Landroidx/compose/material3/internal/CalendarMonth;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getYear", "b", "getMonth", "c", "getNumberOfDays", "d", "getDaysFromStartOfWeekToFirstOfMonth", "e", "J", "getStartUtcTimeMillis", "f", "getEndUtcTimeMillis", "endUtcTimeMillis", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CalendarMonth {
    public static final int $stable;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;

    public CalendarMonth(int v, int v1, int v2, int v3, long v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = ((long)v2) * 86400000L + v4 - 1L;
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public final long component5() {
        return this.e;
    }

    @NotNull
    public final CalendarMonth copy(int v, int v1, int v2, int v3, long v4) {
        return new CalendarMonth(v, v1, v2, v3, v4);
    }

    public static CalendarMonth copy$default(CalendarMonth calendarMonth0, int v, int v1, int v2, int v3, long v4, int v5, Object object0) {
        if((v5 & 1) != 0) {
            v = calendarMonth0.a;
        }
        if((v5 & 2) != 0) {
            v1 = calendarMonth0.b;
        }
        if((v5 & 4) != 0) {
            v2 = calendarMonth0.c;
        }
        if((v5 & 8) != 0) {
            v3 = calendarMonth0.d;
        }
        if((v5 & 16) != 0) {
            v4 = calendarMonth0.e;
        }
        return calendarMonth0.copy(v, v1, v2, v3, v4);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CalendarMonth)) {
            return false;
        }
        if(this.a != ((CalendarMonth)object0).a) {
            return false;
        }
        if(this.b != ((CalendarMonth)object0).b) {
            return false;
        }
        if(this.c != ((CalendarMonth)object0).c) {
            return false;
        }
        return this.d == ((CalendarMonth)object0).d ? this.e == ((CalendarMonth)object0).e : false;
    }

    @NotNull
    public final String format(@NotNull CalendarModel calendarModel0, @NotNull String s) {
        return calendarModel0.formatWithSkeleton(this, s, calendarModel0.getLocale());
    }

    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.d;
    }

    public final long getEndUtcTimeMillis() {
        return this.f;
    }

    public final int getMonth() {
        return this.b;
    }

    public final int getNumberOfDays() {
        return this.c;
    }

    public final long getStartUtcTimeMillis() {
        return this.e;
    }

    public final int getYear() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(this.e) + a.c(this.d, a.c(this.c, a.c(this.b, this.a * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    public final int indexIn(@NotNull IntRange intRange0) {
        return (this.a - intRange0.getFirst()) * 12 + this.b - 1;
    }

    @Override
    @NotNull
    public String toString() {
        return "CalendarMonth(year=" + this.a + ", month=" + this.b + ", numberOfDays=" + this.c + ", daysFromStartOfWeekToFirstOfMonth=" + this.d + ", startUtcTimeMillis=" + this.e + ')';
    }
}

