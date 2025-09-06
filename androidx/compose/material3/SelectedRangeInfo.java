package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0012\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000E\u0010\u000B\u001A\u0004\b\u000F\u0010\rR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001A\u0004\b\u0015\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo;", "", "Landroidx/compose/ui/unit/IntOffset;", "gridStartCoordinates", "gridEndCoordinates", "", "firstIsSelectionStart", "lastIsSelectionEnd", "<init>", "(JJZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "getGridStartCoordinates-nOcc-ac", "()J", "b", "getGridEndCoordinates-nOcc-ac", "c", "Z", "getFirstIsSelectionStart", "()Z", "d", "getLastIsSelectionEnd", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SelectedRangeInfo {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\'\u0010\b\u001A\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo$Companion;", "", "Landroidx/compose/material3/internal/CalendarMonth;", "month", "Landroidx/compose/material3/internal/CalendarDate;", "startDate", "endDate", "Landroidx/compose/material3/SelectedRangeInfo;", "calculateRangeInfo", "(Landroidx/compose/material3/internal/CalendarMonth;Landroidx/compose/material3/internal/CalendarDate;Landroidx/compose/material3/internal/CalendarDate;)Landroidx/compose/material3/SelectedRangeInfo;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final SelectedRangeInfo calculateRangeInfo(@NotNull CalendarMonth calendarMonth0, @NotNull CalendarDate calendarDate0, @NotNull CalendarDate calendarDate1) {
            int v1;
            if(calendarDate0.getUtcTimeMillis() <= calendarMonth0.getEndUtcTimeMillis() && calendarDate1.getUtcTimeMillis() >= calendarMonth0.getStartUtcTimeMillis()) {
                boolean z = Long.compare(calendarDate0.getUtcTimeMillis(), calendarMonth0.getStartUtcTimeMillis()) >= 0;
                int v = z ? calendarDate0.getDayOfMonth() + calendarMonth0.getDaysFromStartOfWeekToFirstOfMonth() - 1 : calendarMonth0.getDaysFromStartOfWeekToFirstOfMonth();
                if(calendarDate1.getUtcTimeMillis() <= calendarMonth0.getEndUtcTimeMillis()) {
                    v1 = calendarDate1.getDayOfMonth() + calendarMonth0.getDaysFromStartOfWeekToFirstOfMonth() - 1;
                    return new SelectedRangeInfo(IntOffsetKt.IntOffset(v % 7, v / 7), IntOffsetKt.IntOffset(v1 % 7, v1 / 7), z, true, null);
                }
                v1 = calendarMonth0.getNumberOfDays() + calendarMonth0.getDaysFromStartOfWeekToFirstOfMonth() - 1;
                return new SelectedRangeInfo(IntOffsetKt.IntOffset(v % 7, v / 7), IntOffsetKt.IntOffset(v1 % 7, v1 / 7), z, false, null);
            }
            return null;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;

    static {
        SelectedRangeInfo.Companion = new Companion(null);
    }

    public SelectedRangeInfo(long v, long v1, boolean z, boolean z1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = z;
        this.d = z1;
    }

    public final boolean getFirstIsSelectionStart() {
        return this.c;
    }

    public final long getGridEndCoordinates-nOcc-ac() {
        return this.b;
    }

    public final long getGridStartCoordinates-nOcc-ac() {
        return this.a;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.d;
    }
}

