package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p5 extends Lambda implements Function2 {
    public final DatePickerState w;

    public p5(DatePickerState datePickerState0) {
        this.w = datePickerState0;
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
            ComposerKt.traceEventStart(0xA64B8BC1, v, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:173)");
        }
        int v1 = this.w.getDisplayMode-jFl-4v0();
        Modifier modifier0 = PaddingKt.padding(Modifier.Companion, DatePickerKt.e);
        DatePickerDefaults.INSTANCE.DatePickerTitle-hOD91z4(v1, modifier0, ((Composer)object0), 0x1B0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

