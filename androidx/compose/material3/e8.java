package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class e8 extends Lambda implements Function2 {
    public final Function1 A;
    public final CalendarModel B;
    public final IntRange C;
    public final DatePickerFormatter D;
    public final SelectableDates E;
    public final DatePickerColors F;
    public final int G;
    public final Long w;
    public final Long x;
    public final long y;
    public final Function2 z;

    public e8(Long long0, Long long1, long v, Function2 function20, Function1 function10, CalendarModel calendarModel0, IntRange intRange0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, int v1) {
        this.w = long0;
        this.x = long1;
        this.y = v;
        this.z = function20;
        this.A = function10;
        this.B = calendarModel0;
        this.C = intRange0;
        this.D = datePickerFormatter0;
        this.E = selectableDates0;
        this.F = datePickerColors0;
        this.G = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DateRangePickerKt.access$DateRangePickerContent(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)));
        return Unit.INSTANCE;
    }
}

