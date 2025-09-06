package p0;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.material.SliderColors;
import androidx.compose.material.SliderKt;
import androidx.compose.material3.xd;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import ce.e;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;
import kotlin.text.q;
import kotlinx.coroutines.CoroutineScope;

public final class y7 extends Lambda implements Function3 {
    public final List A;
    public final SliderColors B;
    public final State C;
    public final Function0 D;
    public final ClosedFloatingPointRange w;
    public final float x;
    public final MutableInteractionSource y;
    public final boolean z;

    public y7(ClosedFloatingPointRange closedFloatingPointRange0, float f, MutableInteractionSource mutableInteractionSource0, boolean z, List list0, SliderColors sliderColors0, State state0, Function0 function00) {
        this.w = closedFloatingPointRange0;
        this.x = f;
        this.y = mutableInteractionSource0;
        this.z = z;
        this.A = list0;
        this.B = sliderColors0;
        this.C = state0;
        this.D = function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        float f2;
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (composer0.changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2085116814, v, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:179)");
        }
        boolean z = composer0.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        float f = (float)Constraints.getMaxWidth-impl(((BoxWithConstraintsScope)object0).getConstraints-msEJaDk());
        FloatRef ref$FloatRef0 = new FloatRef();
        FloatRef ref$FloatRef1 = new FloatRef();
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        ref$FloatRef0.element = Math.max(f - density0.toPx-0680j_4(10.0f), 0.0f);
        ref$FloatRef1.element = Math.min(density0.toPx-0680j_4(10.0f), ref$FloatRef0.element);
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = q.h(0x2E20B340, composer0, 0xE2A708A4);
        Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer0), composer0);
        }
        composer0.endReplaceableGroup();
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xE2A708A4);
        MutableFloatState mutableFloatState0 = composer0.rememberedValue();
        ClosedFloatingPointRange closedFloatingPointRange0 = this.w;
        float f1 = this.x;
        if(mutableFloatState0 == composer$Companion0.getEmpty()) {
            mutableFloatState0 = PrimitiveSnapshotStateKt.mutableFloatStateOf(SliderKt.access$scale(((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue(), f1, ref$FloatRef1.element, ref$FloatRef0.element));
            composer0.updateRememberedValue(mutableFloatState0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xE2A708A4);
        MutableFloatState mutableFloatState1 = composer0.rememberedValue();
        if(mutableFloatState1 == composer$Companion0.getEmpty()) {
            mutableFloatState1 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            composer0.updateRememberedValue(mutableFloatState1);
        }
        composer0.endReplaceableGroup();
        Float float0 = ref$FloatRef1.element;
        Float float1 = ref$FloatRef0.element;
        composer0.startReplaceableGroup(0x607FB4C4);
        boolean z1 = composer0.changed(float0);
        boolean z2 = composer0.changed(float1);
        boolean z3 = composer0.changed(closedFloatingPointRange0);
        j7 j70 = composer0.rememberedValue();
        if((z1 | z2 | z3) != 0 || j70 == composer$Companion0.getEmpty()) {
            f2 = f1;
            j7 j71 = new j7(new v7(mutableFloatState0, mutableFloatState1, ref$FloatRef1, ref$FloatRef0, this.C, closedFloatingPointRange0));
            composer0.updateRememberedValue(j71);
            j70 = j71;
        }
        else {
            f2 = f1;
        }
        composer0.endReplaceableGroup();
        SliderKt.access$CorrectValueSideEffect(new u7(closedFloatingPointRange0, ref$FloatRef1, ref$FloatRef0), closedFloatingPointRange0, e.rangeTo(ref$FloatRef1.element, ref$FloatRef0.element), mutableFloatState0, this.x, composer0, 0xC00);
        State state0 = SnapshotStateKt.rememberUpdatedState(new x7(mutableFloatState0, this.A, ref$FloatRef1, ref$FloatRef0, coroutineScope0, j70, this.D), composer0, 0);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SliderKt.access$sliderTapModifier(modifier$Companion0, j70, this.y, f, z, mutableFloatState0, state0, mutableFloatState1, this.z);
        Orientation orientation0 = Orientation.Horizontal;
        boolean z4 = ((Boolean)j70.b.getValue()).booleanValue();
        composer0.startReplaceableGroup(0x10797E9);
        boolean z5 = composer0.changed(state0);
        xd xd0 = composer0.rememberedValue();
        if(z5 || xd0 == composer$Companion0.getEmpty()) {
            xd0 = new xd(1, state0, null);
            composer0.updateRememberedValue(xd0);
        }
        composer0.endReplaceableGroup();
        Modifier modifier1 = DraggableKt.draggable$default(modifier$Companion0, j70, orientation0, this.z, this.y, z4, null, xd0, z, 0x20, null);
        float f3 = c.coerceIn(f2, ((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue());
        float f4 = SliderKt.access$calcFraction(((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue(), f3);
        float f5 = ref$FloatRef0.element - ref$FloatRef1.element;
        Modifier modifier2 = modifier0.then(modifier1);
        SliderKt.access$SliderImpl(this.z, f4, this.A, this.B, f5, this.y, modifier2, composer0, 0x200);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

