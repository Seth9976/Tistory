package p0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.material.SliderColors;
import androidx.compose.material.SliderKt;
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

public final class s7 extends Lambda implements Function3 {
    public final MutableInteractionSource A;
    public final boolean B;
    public final int C;
    public final Function0 D;
    public final List E;
    public final SliderColors F;
    public final ClosedFloatingPointRange w;
    public final ClosedFloatingPointRange x;
    public final State y;
    public final MutableInteractionSource z;

    public s7(ClosedFloatingPointRange closedFloatingPointRange0, ClosedFloatingPointRange closedFloatingPointRange1, State state0, MutableInteractionSource mutableInteractionSource0, MutableInteractionSource mutableInteractionSource1, boolean z, int v, Function0 function00, List list0, SliderColors sliderColors0) {
        this.w = closedFloatingPointRange0;
        this.x = closedFloatingPointRange1;
        this.y = state0;
        this.z = mutableInteractionSource0;
        this.A = mutableInteractionSource1;
        this.B = z;
        this.C = v;
        this.D = function00;
        this.E = list0;
        this.F = sliderColors0;
        super(3);
    }

    public static final float a(ClosedFloatingPointRange closedFloatingPointRange0, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1, float f) {
        return SliderKt.access$scale(((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue(), f, ref$FloatRef0.element, ref$FloatRef1.element);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
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
            ComposerKt.traceEventStart(0x26E5BB63, v, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:318)");
        }
        boolean z = composer0.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        float f = (float)Constraints.getMaxWidth-impl(((BoxWithConstraintsScope)object0).getConstraints-msEJaDk());
        FloatRef ref$FloatRef0 = new FloatRef();
        FloatRef ref$FloatRef1 = new FloatRef();
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        ref$FloatRef0.element = f - density0.toPx-0680j_4(10.0f);
        ref$FloatRef1.element = density0.toPx-0680j_4(10.0f);
        composer0.startReplaceableGroup(0xE2A708A4);
        MutableFloatState mutableFloatState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        ClosedFloatingPointRange closedFloatingPointRange0 = this.x;
        ClosedFloatingPointRange closedFloatingPointRange1 = this.w;
        if(mutableFloatState0 == composer$Companion0.getEmpty()) {
            mutableFloatState0 = PrimitiveSnapshotStateKt.mutableFloatStateOf(s7.a(closedFloatingPointRange1, ref$FloatRef1, ref$FloatRef0, ((Number)closedFloatingPointRange0.getStart()).floatValue()));
            composer0.updateRememberedValue(mutableFloatState0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xE2A708A4);
        MutableFloatState mutableFloatState1 = composer0.rememberedValue();
        if(mutableFloatState1 == composer$Companion0.getEmpty()) {
            mutableFloatState1 = PrimitiveSnapshotStateKt.mutableFloatStateOf(s7.a(closedFloatingPointRange1, ref$FloatRef1, ref$FloatRef0, ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue()));
            composer0.updateRememberedValue(mutableFloatState1);
        }
        composer0.endReplaceableGroup();
        l7 l70 = new l7(closedFloatingPointRange1, ref$FloatRef1, ref$FloatRef0);
        ClosedFloatingPointRange closedFloatingPointRange2 = e.rangeTo(ref$FloatRef1.element, ref$FloatRef0.element);
        float f1 = ((Number)closedFloatingPointRange0.getStart()).floatValue();
        SliderKt.access$CorrectValueSideEffect(l70, this.w, closedFloatingPointRange2, mutableFloatState0, f1, composer0, 0xC00);
        m7 m70 = new m7(closedFloatingPointRange1, ref$FloatRef1, ref$FloatRef0);
        ClosedFloatingPointRange closedFloatingPointRange3 = e.rangeTo(ref$FloatRef1.element, ref$FloatRef0.element);
        float f2 = ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue();
        SliderKt.access$CorrectValueSideEffect(m70, this.w, closedFloatingPointRange3, mutableFloatState1, f2, composer0, 0xC00);
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = q.h(0x2E20B340, composer0, 0xE2A708A4);
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer0), composer0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        State state0 = SnapshotStateKt.rememberUpdatedState(new q7(mutableFloatState0, mutableFloatState1, this.E, ref$FloatRef1, ref$FloatRef0, this.D, compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), this.y, this.w), composer0, 0);
        composer0.startReplaceableGroup(17280602);
        boolean z1 = composer0.changed(mutableFloatState0);
        boolean z2 = composer0.changed(mutableFloatState1);
        boolean z3 = composer0.changed(closedFloatingPointRange1);
        boolean z4 = composer0.changed(ref$FloatRef1.element);
        boolean z5 = composer0.changed(ref$FloatRef0.element);
        boolean z6 = composer0.changed(closedFloatingPointRange0);
        State state1 = this.y;
        boolean z7 = composer0.changed(state1);
        r7 r70 = composer0.rememberedValue();
        if((z1 | z2 | z3 | z4 | z5 | z6 | z7) != 0 || r70 == composer$Companion0.getEmpty()) {
            r70 = new r7(mutableFloatState0, mutableFloatState1, this.x, ref$FloatRef1, ref$FloatRef0, this.y, this.w);
            composer0.updateRememberedValue(r70);
        }
        composer0.endReplaceableGroup();
        State state2 = SnapshotStateKt.rememberUpdatedState(r70, composer0, 0);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SliderKt.access$rangeSliderPressDragModifier(modifier$Companion0, this.z, this.A, mutableFloatState0, mutableFloatState1, this.B, z, f, this.w, state0, state2);
        float f3 = c.coerceIn(((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange1.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue());
        float f4 = c.coerceIn(((Number)closedFloatingPointRange0.getEndInclusive()).floatValue(), ((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange1.getEndInclusive()).floatValue());
        float f5 = SliderKt.access$calcFraction(((Number)closedFloatingPointRange1.getStart()).floatValue(), ((Number)closedFloatingPointRange1.getEndInclusive()).floatValue(), f3);
        float f6 = SliderKt.access$calcFraction(((Number)closedFloatingPointRange1.getStart()).floatValue(), ((Number)closedFloatingPointRange1.getEndInclusive()).floatValue(), f4);
        int v1 = (int)(((float)Math.floor(((float)this.C) * f6)));
        int v2 = (int)(((float)Math.floor((1.0f - f5) * ((float)this.C))));
        composer0.startReplaceableGroup(0x107B5AE);
        boolean z8 = composer0.changed(state1);
        boolean z9 = composer0.changed(f4);
        n7 n70 = composer0.rememberedValue();
        if(z8 || z9 || n70 == composer$Companion0.getEmpty()) {
            n70 = new n7(state1, f4, 1);
            composer0.updateRememberedValue(n70);
        }
        composer0.endReplaceableGroup();
        ClosedFloatingPointRange closedFloatingPointRange4 = e.rangeTo(((Number)closedFloatingPointRange1.getStart()).floatValue(), f4);
        Modifier modifier1 = SliderKt.c(modifier$Companion0, f3, this.B, n70, this.D, closedFloatingPointRange4, v1);
        composer0.startReplaceableGroup(0x107B6D0);
        boolean z10 = composer0.changed(state1);
        boolean z11 = composer0.changed(f3);
        n7 n71 = composer0.rememberedValue();
        if(z10 || z11 || n71 == composer$Companion0.getEmpty()) {
            n71 = new n7(state1, f3, 0);
            composer0.updateRememberedValue(n71);
        }
        composer0.endReplaceableGroup();
        ClosedFloatingPointRange closedFloatingPointRange5 = e.rangeTo(f3, ((Number)closedFloatingPointRange1.getEndInclusive()).floatValue());
        Modifier modifier2 = SliderKt.c(modifier$Companion0, f4, this.B, n71, this.D, closedFloatingPointRange5, v2);
        SliderKt.access$RangeSliderImpl(this.B, f5, f6, this.E, this.F, ref$FloatRef0.element - ref$FloatRef1.element, this.z, this.A, modifier0, modifier1, modifier2, composer0, 0xD81000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

