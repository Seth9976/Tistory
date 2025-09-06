package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class x6 extends Lambda implements Function4 {
    public final CalendarModel A;
    public final IntRange B;
    public final DatePickerFormatter C;
    public final SelectableDates D;
    public final DatePickerColors E;
    public final Long w;
    public final long x;
    public final Function1 y;
    public final Function1 z;

    public x6(Long long0, long v, Function1 function10, Function1 function11, CalendarModel calendarModel0, IntRange intRange0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0) {
        this.w = long0;
        this.x = v;
        this.y = function10;
        this.z = function11;
        this.A = calendarModel0;
        this.B = intRange0;
        this.C = datePickerFormatter0;
        this.D = selectableDates0;
        this.E = datePickerColors0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        AnimatedContentScope animatedContentScope0 = (AnimatedContentScope)object0;
        int v = ((DisplayMode)object1).unbox-impl();
        int v1 = ((Number)object3).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE49854CB, v1, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1446)");
        }
        if(DisplayMode.equals-impl0(v, 0)) {
            ((Composer)object2).startReplaceGroup(0x9088297B);
            DatePickerKt.access$DatePickerContent(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object2), 0);
        }
        else if(DisplayMode.equals-impl0(v, 1)) {
            ((Composer)object2).startReplaceGroup(0x908871F4);
            DateInputKt.DateInputContent(this.w, this.y, this.A, this.B, this.C, this.D, this.E, ((Composer)object2), 0);
        }
        else {
            ((Composer)object2).startReplaceGroup(0x808BCD1D);
        }
        ((Composer)object2).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

