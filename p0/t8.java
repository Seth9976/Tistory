package p0;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.room.a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.text.q;

public final class t8 extends Lambda implements Function3 {
    public final boolean A;
    public final MutableState B;
    public final State C;
    public final State D;
    public final boolean w;
    public final DraggableState x;
    public final MutableInteractionSource y;
    public final float z;

    public t8(DraggableState draggableState0, MutableInteractionSource mutableInteractionSource0, float f, boolean z, State state0, State state1, MutableState mutableState0, boolean z1) {
        this.w = z;
        this.x = draggableState0;
        this.y = mutableInteractionSource0;
        this.z = f;
        this.A = z1;
        this.B = mutableState0;
        this.C = state0;
        this.D = state1;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier0 = (Modifier)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceableGroup(0x73F1D65A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x73F1D65A, v, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:910)");
        }
        if(this.w) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = q.h(0x2E20B340, ((Composer)object1), 0xE2A708A4);
            if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, ((Composer)object1)), ((Composer)object1));
            }
            ((Composer)object1).endReplaceableGroup();
            ((Composer)object1).endReplaceableGroup();
            s8 s80 = new s8(this.A, this.z, this.B, this.C, compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), this.x, this.D, null);
            modifier0 = SuspendingPointerInputFilterKt.pointerInput(modifier0, new Object[]{this.x, this.y, this.z, Boolean.valueOf(this.A)}, s80);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceableGroup();
        return modifier0;
    }
}

