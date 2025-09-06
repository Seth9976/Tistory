package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class f8 extends Lambda implements Function3 {
    public final Function1 A;
    public final CalendarModel B;
    public final IntRange C;
    public final DatePickerFormatter D;
    public final SelectableDates E;
    public final DatePickerColors F;
    public final Long w;
    public final Long x;
    public final long y;
    public final Function2 z;

    public f8(Long long0, Long long1, long v, Function2 function20, Function1 function10, CalendarModel calendarModel0, IntRange intRange0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0) {
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
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((DisplayMode)object0).unbox-impl();
        int v1 = ((Number)object2).intValue();
        if((v1 & 6) == 0) {
            v1 |= (((Composer)object1).changed(v) ? 4 : 2);
        }
        if((v1 & 19) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1026642619, v1, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:673)");
        }
        if(DisplayMode.equals-impl0(v, 0)) {
            ((Composer)object1).startReplaceGroup(0x907625AF);
            DateRangePickerKt.access$DateRangePickerContent(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object1), 0);
        }
        else if(DisplayMode.equals-impl0(v, 1)) {
            ((Composer)object1).startReplaceGroup(0x907678A8);
            DateRangeInputKt.DateRangeInputContent(this.w, this.x, this.z, this.B, this.C, this.D, this.E, this.F, ((Composer)object1), 0);
        }
        else {
            ((Composer)object1).startReplaceGroup(2120210493);
        }
        ((Composer)object1).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

