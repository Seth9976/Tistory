package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class rp extends Lambda implements Function3 {
    public final TimePickerColors w;
    public final AnalogTimePickerState x;
    public final boolean y;

    public rp(TimePickerColors timePickerColors0, AnalogTimePickerState analogTimePickerState0, boolean z) {
        this.w = timePickerColors0;
        this.x = analogTimePickerState0;
        this.y = z;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1022006568, v, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1522)");
        }
        TimePickerKt.access$CircularLayout-uFdPcIQ(SemanticsModifierKt.semantics$default(SizeKt.size-3ABfNKs(Modifier.Companion, 0.0f), false, a5.Z, 1, null), 101.0f, ComposableLambdaKt.rememberComposableLambda(0xECE87D10, true, new qp(this.w, ((IntList)object0), this.x, this.y), ((Composer)object1), 54), ((Composer)object1), 0x1B0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

