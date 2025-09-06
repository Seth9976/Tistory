package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class pp extends Lambda implements Function2 {
    public final IntList w;
    public final AnalogTimePickerState x;
    public final boolean y;

    public pp(IntList intList0, AnalogTimePickerState analogTimePickerState0, boolean z) {
        this.w = intList0;
        this.x = analogTimePickerState0;
        this.y = z;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        AnalogTimePickerState analogTimePickerState0;
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1992872400, v, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
        }
        ((Composer)object0).startReplaceGroup(0x5C360FD6);
        IntList intList0 = this.w;
        int v1 = intList0.getSize();
        for(int v2 = 0; true; ++v2) {
            analogTimePickerState0 = this.x;
            if(v2 >= v1) {
                break;
            }
            int v3 = !analogTimePickerState0.is24hour() || TimePickerSelectionMode.equals-impl0(analogTimePickerState0.getSelection-yecRtBI(), 1) ? intList0.get(v2) : intList0.get(v2) % 12;
            Companion modifier$Companion0 = Modifier.Companion;
            boolean z = ((Composer)object0).changed(v2);
            v6 v60 = ((Composer)object0).rememberedValue();
            if(z || v60 == Composer.Companion.getEmpty()) {
                v60 = new v6(v2, 2);
                ((Composer)object0).updateRememberedValue(v60);
            }
            TimePickerKt.access$ClockText(SemanticsModifierKt.semantics$default(modifier$Companion0, false, v60, 1, null), analogTimePickerState0, v3, this.y, ((Composer)object0), 0);
        }
        ((Composer)object0).endReplaceGroup();
        if(TimePickerSelectionMode.equals-impl0(analogTimePickerState0.getSelection-yecRtBI(), 0) && analogTimePickerState0.is24hour()) {
            TimePickerKt.access$CircularLayout-uFdPcIQ(BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, ac.b), 0.0f), 0L, RoundedCornerShapeKt.getCircleShape()), 69.0f, ComposableLambdaKt.rememberComposableLambda(0xF3C0DCA3, true, new op(analogTimePickerState0, this.y), ((Composer)object0), 54), ((Composer)object0), 0x1B0, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

