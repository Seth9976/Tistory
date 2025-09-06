package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s5 extends Lambda implements Function2 {
    public final DatePickerState w;

    public s5(DatePickerState datePickerState0) {
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
            ComposerKt.traceEventStart(0x76266147, v, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:198)");
        }
        Modifier modifier0 = PaddingKt.padding(Modifier.Companion, DatePickerKt.getDatePickerModeTogglePadding());
        DatePickerState datePickerState0 = this.w;
        int v1 = datePickerState0.getDisplayMode-jFl-4v0();
        boolean z = ((Composer)object0).changed(datePickerState0);
        r5 r50 = ((Composer)object0).rememberedValue();
        if(z || r50 == Composer.Companion.getEmpty()) {
            r50 = new r5(datePickerState0, 0);
            ((Composer)object0).updateRememberedValue(r50);
        }
        DatePickerKt.DisplayModeToggleButton-tER2X8s(modifier0, v1, r50, ((Composer)object0), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

