package androidx.compose.material3;

import a2.b;
import androidx.annotation.IntRange;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import ce.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001A\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\t\u00A2\u0006\u0004\b\u000B\u0010\fJA\u0010\u0015\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\r2\'\u0010\u0014\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000F\u00A2\u0006\u0002\b\u0013H\u0096@\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001A\u00020\u00072\u0006\u0010\u0017\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001E\u001A\u00020\u00072\u0006\u0010\u001A\u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010#\u001A\u00020\u00072\u0006\u0010 \u001A\u00020\u001FH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R*\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R0\u00109\u001A\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u0001028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b3\u00104\u001A\u0004\b5\u00106\"\u0004\b7\u00108R\u001A\u0010?\u001A\u00020:8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>R\"\u0010G\u001A\u00020@8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010B\u001A\u0004\bC\u0010D\"\u0004\bE\u0010FR+\u0010N\u001A\u00020\u00022\u0006\u0010H\u001A\u00020\u00028@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bI\u0010J\u001A\u0004\bK\u0010L\"\u0004\bM\u0010\u0019R+\u0010R\u001A\u00020\u00022\u0006\u0010H\u001A\u00020\u00028@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bO\u0010J\u001A\u0004\bP\u0010L\"\u0004\bQ\u0010\u0019R+\u0010W\u001A\u00020@2\u0006\u0010H\u001A\u00020@8@@BX\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bS\u0010T\u001A\u0004\bU\u0010D\"\u0004\bV\u0010FR \u0010Z\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bX\u0010)\u001A\u0004\bY\u0010+R$\u0010\u0003\u001A\u00020\u00022\u0006\u0010[\u001A\u00020\u00028F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b\\\u0010L\"\u0004\b]\u0010\u0019R\u0014\u0010_\u001A\u00020\u00028@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b^\u0010L\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006`"}, d2 = {"Landroidx/compose/material3/SliderState;", "Landroidx/compose/foundation/gestures/DraggableState;", "", "value", "", "steps", "Lkotlin/Function0;", "", "onValueChangeFinished", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "<init>", "(FILkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;)V", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)V", "newTrackHeight", "newTotalWidth", "updateDimensions$material3_release", "(FI)V", "updateDimensions", "Landroidx/compose/ui/geometry/Offset;", "pos", "onPress-k-4lQ0M$material3_release", "(J)V", "onPress", "a", "I", "getSteps", "()I", "b", "Lkotlin/jvm/functions/Function0;", "getOnValueChangeFinished", "()Lkotlin/jvm/functions/Function0;", "setOnValueChangeFinished", "(Lkotlin/jvm/functions/Function0;)V", "c", "Lkotlin/ranges/ClosedFloatingPointRange;", "getValueRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "Lkotlin/Function1;", "e", "Lkotlin/jvm/functions/Function1;", "getOnValueChange$material3_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$material3_release", "(Lkotlin/jvm/functions/Function1;)V", "onValueChange", "", "f", "[F", "getTickFractions$material3_release", "()[F", "tickFractions", "", "h", "Z", "isRtl$material3_release", "()Z", "setRtl$material3_release", "(Z)V", "isRtl", "<set-?>", "i", "Landroidx/compose/runtime/MutableFloatState;", "getTrackHeight$material3_release", "()F", "setTrackHeight$material3_release", "trackHeight", "j", "getThumbWidth$material3_release", "setThumbWidth$material3_release", "thumbWidth", "k", "Landroidx/compose/runtime/MutableState;", "isDragging$material3_release", "setDragging", "isDragging", "l", "getGestureEndAction$material3_release", "gestureEndAction", "newVal", "getValue", "setValue", "getCoercedValueAsFraction$material3_release", "coercedValueAsFraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2263:1\n76#2:2264\n109#2,2:2265\n76#2:2271\n109#2,2:2272\n76#2:2274\n109#2,2:2275\n76#2:2280\n109#2,2:2281\n76#2:2283\n109#2,2:2284\n1#3:2267\n75#4:2268\n108#4,2:2269\n81#5:2277\n107#5,2:2278\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n*L\n1948#1:2264\n1948#1:2265,2\n1998#1:2271\n1998#1:2272,2\n1999#1:2274\n1999#1:2275,2\n2029#1:2280\n2029#1:2281,2\n2030#1:2283\n2030#1:2284,2\n1996#1:2268\n1996#1:2269,2\n2009#1:2277\n2009#1:2278,2\n*E\n"})
public final class SliderState implements DraggableState {
    public static final int $stable = 8;
    public final int a;
    public Function0 b;
    public final ClosedFloatingPointRange c;
    public final MutableFloatState d;
    public Function1 e;
    public final float[] f;
    public final MutableIntState g;
    public boolean h;
    public final MutableFloatState i;
    public final MutableFloatState j;
    public final MutableState k;
    public final b l;
    public final MutableFloatState m;
    public final MutableFloatState n;
    public final androidx.compose.material3.SliderState.dragScope.1 o;
    public final MutatorMutex p;

    public SliderState() {
        this(0.0f, 0, null, null, 15, null);
    }

    public SliderState(float f, @IntRange(from = 0L) int v, @Nullable Function0 function00, @NotNull ClosedFloatingPointRange closedFloatingPointRange0) {
        this.a = v;
        this.b = function00;
        this.c = closedFloatingPointRange0;
        this.d = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.f = SliderKt.access$stepsToTickFractions(v);
        this.g = SnapshotIntStateKt.mutableIntStateOf(0);
        this.i = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.j = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.k = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.l = new b(this, 10);
        this.m = PrimitiveSnapshotStateKt.mutableFloatStateOf(SliderKt.access$scale(((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue(), f, 0.0f, 0.0f));
        this.n = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.o = (float f) -> {
            float f1 = Math.max(((float)this.g.getIntValue()) - this.getThumbWidth$material3_release() / 2.0f, 0.0f);
            float f2 = Math.min(this.getThumbWidth$material3_release() / 2.0f, f1);
            float f3 = this.m.getFloatValue();
            float f4 = this.n.getFloatValue();
            this.m.setFloatValue(f4 + (f3 + f));
            this.n.setFloatValue(0.0f);
            float f5 = SliderKt.access$scale(f2, f1, SliderKt.access$snapValueToTick(this.m.getFloatValue(), this.f, f2, f1), ((Number)this.c.getStart()).floatValue(), ((Number)this.c.getEndInclusive()).floatValue());
            if(f5 != this.getValue()) {
                Function1 function10 = this.e;
                if(function10 != null) {
                    function10.invoke(f5);
                    return;
                }
                this.setValue(f5);
            }
        };
        this.p = new MutatorMutex();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"androidx/compose/material3/SliderState$dragScope$1", "Landroidx/compose/foundation/gestures/DragScope;", "dragBy", "", "pixels", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.material3.SliderState.dragScope.1 implements DragScope {
            public final SliderState a;

            public androidx.compose.material3.SliderState.dragScope.1(SliderState sliderState0) {
                this.a = sliderState0;
            }

            @Override  // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f) {
                this.a.dispatchRawDelta(f);
            }
        }

    }

    public SliderState(float f, int v, Function0 function00, ClosedFloatingPointRange closedFloatingPointRange0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            function00 = null;
        }
        if((v1 & 8) != 0) {
            closedFloatingPointRange0 = e.rangeTo(0.0f, 1.0f);
        }
        this(f, v, function00, closedFloatingPointRange0);
    }

    public static final void access$setDragging(SliderState sliderState0, boolean z) {
        sliderState0.k.setValue(Boolean.valueOf(z));
    }

    // 检测为 Lambda 实现
    @Override  // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) [...]

    @Override  // androidx.compose.foundation.gestures.DraggableState
    @Nullable
    public Object drag(@NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new rl(this, mutatePriority0, function20, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final float getCoercedValueAsFraction$material3_release() {
        return SliderKt.access$calcFraction(((Number)this.c.getStart()).floatValue(), ((Number)this.c.getEndInclusive()).floatValue(), c.coerceIn(this.getValue(), ((Number)this.c.getStart()).floatValue(), ((Number)this.c.getEndInclusive()).floatValue()));
    }

    @NotNull
    public final Function0 getGestureEndAction$material3_release() {
        return this.l;
    }

    @Nullable
    public final Function1 getOnValueChange$material3_release() {
        return this.e;
    }

    @Nullable
    public final Function0 getOnValueChangeFinished() {
        return this.b;
    }

    public final int getSteps() {
        return this.a;
    }

    public final float getThumbWidth$material3_release() {
        return this.j.getFloatValue();
    }

    @NotNull
    public final float[] getTickFractions$material3_release() {
        return this.f;
    }

    public final float getTrackHeight$material3_release() {
        return this.i.getFloatValue();
    }

    public final float getValue() {
        return this.d.getFloatValue();
    }

    @NotNull
    public final ClosedFloatingPointRange getValueRange() {
        return this.c;
    }

    public final boolean isDragging$material3_release() {
        return ((Boolean)this.k.getValue()).booleanValue();
    }

    public final boolean isRtl$material3_release() {
        return this.h;
    }

    public final void onPress-k-4lQ0M$material3_release(long v) {
        float f = this.h ? ((float)this.g.getIntValue()) - Offset.getX-impl(v) : Offset.getX-impl(v);
        float f1 = this.m.getFloatValue();
        this.n.setFloatValue(f - f1);
    }

    public final void setOnValueChange$material3_release(@Nullable Function1 function10) {
        this.e = function10;
    }

    public final void setOnValueChangeFinished(@Nullable Function0 function00) {
        this.b = function00;
    }

    public final void setRtl$material3_release(boolean z) {
        this.h = z;
    }

    public final void setThumbWidth$material3_release(float f) {
        this.j.setFloatValue(f);
    }

    public final void setTrackHeight$material3_release(float f) {
        this.i.setFloatValue(f);
    }

    public final void setValue(float f) {
        float f1 = c.coerceIn(f, ((Number)this.c.getStart()).floatValue(), ((Number)this.c.getEndInclusive()).floatValue());
        float f2 = ((Number)this.c.getStart()).floatValue();
        float f3 = ((Number)this.c.getEndInclusive()).floatValue();
        float f4 = SliderKt.access$snapValueToTick(f1, this.f, f2, f3);
        this.d.setFloatValue(f4);
    }

    public final void updateDimensions$material3_release(float f, int v) {
        this.setTrackHeight$material3_release(f);
        this.g.setIntValue(v);
    }
}

