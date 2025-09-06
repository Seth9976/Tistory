package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class i7 extends Lambda implements Function2 {
    public final CalendarModel A;
    public final IntRange B;
    public final DatePickerColors C;
    public final int D;
    public final Modifier w;
    public final long x;
    public final Function1 y;
    public final SelectableDates z;

    public i7(Modifier modifier0, long v, Function1 function10, SelectableDates selectableDates0, CalendarModel calendarModel0, IntRange intRange0, DatePickerColors datePickerColors0, int v1) {
        this.w = modifier0;
        this.x = v;
        this.y = function10;
        this.z = selectableDates0;
        this.A = calendarModel0;
        this.B = intRange0;
        this.C = datePickerColors0;
        this.D = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DatePickerKt.access$YearPicker(this.w, this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)));
        return Unit.INSTANCE;
    }
}

