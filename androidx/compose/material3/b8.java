package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b8 extends Lambda implements Function2 {
    public final DateRangePickerState w;
    public final DatePickerFormatter x;

    public b8(DateRangePickerState dateRangePickerState0, DatePickerFormatter datePickerFormatter0) {
        this.w = dateRangePickerState0;
        this.x = datePickerFormatter0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF4F4DC54, v, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:103)");
        }
        Long long0 = this.w.getSelectedStartDateMillis();
        Long long1 = this.w.getSelectedEndDateMillis();
        int v1 = this.w.getDisplayMode-jFl-4v0();
        Modifier modifier0 = PaddingKt.padding(Modifier.Companion, DateRangePickerKt.c);
        DateRangePickerDefaults.INSTANCE.DateRangePickerHeadline-v84Udv0(long0, long1, v1, this.x, modifier0, ((Composer)object0), 0x36000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

