package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class g8 extends Lambda implements Function2 {
    public final Function2 A;
    public final Function1 B;
    public final CalendarModel C;
    public final IntRange D;
    public final DatePickerFormatter E;
    public final SelectableDates F;
    public final DatePickerColors G;
    public final int H;
    public final int I;
    public final Long w;
    public final Long x;
    public final long y;
    public final int z;

    public g8(Long long0, Long long1, long v, int v1, Function2 function20, Function1 function10, CalendarModel calendarModel0, IntRange intRange0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, int v2, int v3) {
        this.w = long0;
        this.x = long1;
        this.y = v;
        this.z = v1;
        this.A = function20;
        this.B = function10;
        this.C = calendarModel0;
        this.D = intRange0;
        this.E = datePickerFormatter0;
        this.F = selectableDates0;
        this.G = datePickerColors0;
        this.H = v2;
        this.I = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DateRangePickerKt.access$SwitchableDateEntryContent-RN-2D1Q(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I));
        return Unit.INSTANCE;
    }
}

