package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\r\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000B\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001D\u0010\u0014J\u001A\u0010 \u001A\u00020\u001F2\b\u0010\n\u001A\u0004\u0018\u00010\u001EHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0014R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001A\u0004\b&\u0010\u0014R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\'\u0010#\u001A\u0004\b(\u0010\u0014R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u0018¨\u0006,"}, d2 = {"Landroidx/compose/material3/internal/CalendarDate;", "", "", "year", "month", "dayOfMonth", "", "utcTimeMillis", "<init>", "(IIIJ)V", "other", "compareTo", "(Landroidx/compose/material3/internal/CalendarDate;)I", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "", "skeleton", "format", "(Landroidx/compose/material3/internal/CalendarModel;Ljava/lang/String;)Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "()J", "copy", "(IIIJ)Landroidx/compose/material3/internal/CalendarDate;", "toString", "()Ljava/lang/String;", "hashCode", "", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getYear", "b", "getMonth", "c", "getDayOfMonth", "d", "J", "getUtcTimeMillis", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CalendarDate implements Comparable {
    public static final int $stable;
    public final int a;
    public final int b;
    public final int c;
    public final long d;

    public CalendarDate(int v, int v1, int v2, long v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public int compareTo(@NotNull CalendarDate calendarDate0) {
        return Intrinsics.compare(this.d, calendarDate0.d);
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((CalendarDate)object0));
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

    public final long component4() {
        return this.d;
    }

    @NotNull
    public final CalendarDate copy(int v, int v1, int v2, long v3) {
        return new CalendarDate(v, v1, v2, v3);
    }

    public static CalendarDate copy$default(CalendarDate calendarDate0, int v, int v1, int v2, long v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = calendarDate0.a;
        }
        if((v4 & 2) != 0) {
            v1 = calendarDate0.b;
        }
        if((v4 & 4) != 0) {
            v2 = calendarDate0.c;
        }
        if((v4 & 8) != 0) {
            v3 = calendarDate0.d;
        }
        return calendarDate0.copy(v, v1, v2, v3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CalendarDate)) {
            return false;
        }
        if(this.a != ((CalendarDate)object0).a) {
            return false;
        }
        if(this.b != ((CalendarDate)object0).b) {
            return false;
        }
        return this.c == ((CalendarDate)object0).c ? this.d == ((CalendarDate)object0).d : false;
    }

    @NotNull
    public final String format(@NotNull CalendarModel calendarModel0, @NotNull String s) {
        return calendarModel0.formatWithSkeleton(this, s, calendarModel0.getLocale());
    }

    public final int getDayOfMonth() {
        return this.c;
    }

    public final int getMonth() {
        return this.b;
    }

    public final long getUtcTimeMillis() {
        return this.d;
    }

    public final int getYear() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(this.d) + a.c(this.c, a.c(this.b, this.a * 0x1F, 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "CalendarDate(year=" + this.a + ", month=" + this.b + ", dayOfMonth=" + this.c + ", utcTimeMillis=" + this.d + ')';
    }
}

