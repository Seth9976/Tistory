package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class b6 extends Lambda implements Function2 {
    public final DatePickerFormatter A;
    public final SelectableDates B;
    public final DatePickerColors C;
    public final int D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final int w;
    public final Function1 x;
    public final long y;
    public final Long z;

    public b6(CalendarMonth calendarMonth0, Function1 function10, long v, Long long0, Long long1, SelectedRangeInfo selectedRangeInfo0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, int v1) {
        this.w = 1;
        this.E = calendarMonth0;
        this.x = function10;
        this.y = v;
        this.z = long0;
        this.F = long1;
        this.G = selectedRangeInfo0;
        this.A = datePickerFormatter0;
        this.B = selectableDates0;
        this.C = datePickerColors0;
        this.D = v1;
        super(2);
    }

    public b6(Long long0, long v, Function1 function10, Function1 function11, CalendarModel calendarModel0, IntRange intRange0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, int v1) {
        this.w = 0;
        this.z = long0;
        this.y = v;
        this.x = function10;
        this.E = function11;
        this.F = calendarModel0;
        this.G = intRange0;
        this.A = datePickerFormatter0;
        this.B = selectableDates0;
        this.C = datePickerColors0;
        this.D = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            DatePickerKt.Month(((CalendarMonth)this.E), this.x, this.y, this.z, ((Long)this.F), ((SelectedRangeInfo)this.G), this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        DatePickerKt.access$DatePickerContent(this.z, this.y, this.x, ((Function1)this.E), ((CalendarModel)this.F), ((IntRange)this.G), this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)));
        return Unit.INSTANCE;
    }
}

