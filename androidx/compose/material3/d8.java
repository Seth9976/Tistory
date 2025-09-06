package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d8 extends Lambda implements Function2 {
    public final DateRangePickerState w;

    public d8(DateRangePickerState dateRangePickerState0) {
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
            ComposerKt.traceEventStart(-1490010652, v, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:123)");
        }
        Modifier modifier0 = PaddingKt.padding(Modifier.Companion, DatePickerKt.getDatePickerModeTogglePadding());
        DateRangePickerState dateRangePickerState0 = this.w;
        int v1 = dateRangePickerState0.getDisplayMode-jFl-4v0();
        boolean z = ((Composer)object0).changed(dateRangePickerState0);
        c8 c80 = ((Composer)object0).rememberedValue();
        if(z || c80 == Composer.Companion.getEmpty()) {
            c80 = new c8(dateRangePickerState0, 0);
            ((Composer)object0).updateRememberedValue(c80);
        }
        DatePickerKt.DisplayModeToggleButton-tER2X8s(modifier0, v1, c80, ((Composer)object0), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

