package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a8 extends Lambda implements Function2 {
    public final DateRangePickerState w;

    public a8(DateRangePickerState dateRangePickerState0) {
        this.w = dateRangePickerState0;
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
            ComposerKt.traceEventStart(0xF655902A, v, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:97)");
        }
        int v1 = this.w.getDisplayMode-jFl-4v0();
        Modifier modifier0 = PaddingKt.padding(Modifier.Companion, DateRangePickerKt.b);
        DateRangePickerDefaults.INSTANCE.DateRangePickerTitle-hOD91z4(v1, modifier0, ((Composer)object0), 0x1B0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

