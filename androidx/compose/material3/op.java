package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class op extends Lambda implements Function2 {
    public final AnalogTimePickerState w;
    public final boolean x;

    public op(AnalogTimePickerState analogTimePickerState0, boolean z) {
        this.w = analogTimePickerState0;
        this.x = z;
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
            ComposerKt.traceEventStart(0xF3C0DCA3, v, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
        }
        int v1 = TimePickerKt.l.getSize();
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = TimePickerKt.l.get(v2);
            Companion modifier$Companion0 = Modifier.Companion;
            boolean z = ((Composer)object0).changed(v2);
            v6 v60 = ((Composer)object0).rememberedValue();
            if(z || v60 == Composer.Companion.getEmpty()) {
                v60 = new v6(v2, 3);
                ((Composer)object0).updateRememberedValue(v60);
            }
            TimePickerKt.access$ClockText(SemanticsModifierKt.semantics$default(modifier$Companion0, false, v60, 1, null), this.w, v3, this.x, ((Composer)object0), 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

