package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class y6 extends Lambda implements Function2 {
    public final Function1 A;
    public final CalendarModel B;
    public final IntRange C;
    public final DatePickerFormatter D;
    public final SelectableDates E;
    public final DatePickerColors F;
    public final int G;
    public final Long w;
    public final long x;
    public final int y;
    public final Function1 z;

    public y6(Long long0, long v, int v1, Function1 function10, Function1 function11, CalendarModel calendarModel0, IntRange intRange0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, int v2) {
        this.w = long0;
        this.x = v;
        this.y = v1;
        this.z = function10;
        this.A = function11;
        this.B = calendarModel0;
        this.C = intRange0;
        this.D = datePickerFormatter0;
        this.E = selectableDates0;
        this.F = datePickerColors0;
        this.G = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DatePickerKt.access$SwitchableDateEntryContent-d7iavvg(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)));
        return Unit.INSTANCE;
    }
}

