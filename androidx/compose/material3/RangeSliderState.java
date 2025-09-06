package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import ce.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b;\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001A\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00020\n\u00A2\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u0013\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0016\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR*\u0010\t\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R0\u0010-\u001A\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b\u0018\u00010%8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001A\u00103\u001A\u00020.8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u00102R+\u0010;\u001A\u00020\u00022\u0006\u00104\u001A\u00020\u00028@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\b5\u00106\u001A\u0004\b7\u00108\"\u0004\b9\u0010:R+\u0010?\u001A\u00020\u00022\u0006\u00104\u001A\u00020\u00028@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\b<\u00106\u001A\u0004\b=\u00108\"\u0004\b>\u0010:R+\u0010C\u001A\u00020\u00022\u0006\u00104\u001A\u00020\u00028@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\b@\u00106\u001A\u0004\bA\u00108\"\u0004\bB\u0010:R+\u0010I\u001A\u00020\u00052\u0006\u00104\u001A\u00020\u00058@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bD\u0010E\u001A\u0004\bF\u0010\u001A\"\u0004\bG\u0010HR+\u0010M\u001A\u00020\u00022\u0006\u00104\u001A\u00020\u00028@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bJ\u00106\u001A\u0004\bK\u00108\"\u0004\bL\u0010:R+\u0010Q\u001A\u00020\u00022\u0006\u00104\u001A\u00020\u00028@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bN\u00106\u001A\u0004\bO\u00108\"\u0004\bP\u0010:R+\u0010X\u001A\u00020\u000E2\u0006\u00104\u001A\u00020\u000E8@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bR\u0010S\u001A\u0004\bT\u0010U\"\u0004\bV\u0010WR&\u0010[\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\b0%8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bY\u0010(\u001A\u0004\bZ\u0010*R$\u0010\u0003\u001A\u00020\u00022\u0006\u0010\\\u001A\u00020\u00028F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b]\u00108\"\u0004\b^\u0010:R$\u0010\u0004\u001A\u00020\u00022\u0006\u0010\\\u001A\u00020\u00028F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b_\u00108\"\u0004\b`\u0010:R\u0014\u0010b\u001A\u00020\u00028@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\ba\u00108R\u0014\u0010d\u001A\u00020\u00028@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bc\u00108R\u0014\u0010f\u001A\u00020\u00058@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\be\u0010\u001AR\u0014\u0010h\u001A\u00020\u00058@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bg\u0010\u001A\u00A8\u0006i"}, d2 = {"Landroidx/compose/material3/RangeSliderState;", "", "", "activeRangeStart", "activeRangeEnd", "", "steps", "Lkotlin/Function0;", "", "onValueChangeFinished", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "<init>", "(FFILkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;)V", "", "isStart", "offset", "onDrag$material3_release", "(ZF)V", "onDrag", "updateMinMaxPx$material3_release", "()V", "updateMinMaxPx", "a", "I", "getSteps", "()I", "b", "Lkotlin/jvm/functions/Function0;", "getOnValueChangeFinished", "()Lkotlin/jvm/functions/Function0;", "setOnValueChangeFinished", "(Lkotlin/jvm/functions/Function0;)V", "c", "Lkotlin/ranges/ClosedFloatingPointRange;", "getValueRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "Lkotlin/Function1;", "Landroidx/compose/material3/SliderRange;", "f", "Lkotlin/jvm/functions/Function1;", "getOnValueChange$material3_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$material3_release", "(Lkotlin/jvm/functions/Function1;)V", "onValueChange", "", "g", "[F", "getTickFractions$material3_release", "()[F", "tickFractions", "<set-?>", "h", "Landroidx/compose/runtime/MutableFloatState;", "getTrackHeight$material3_release", "()F", "setTrackHeight$material3_release", "(F)V", "trackHeight", "i", "getStartThumbWidth$material3_release", "setStartThumbWidth$material3_release", "startThumbWidth", "j", "getEndThumbWidth$material3_release", "setEndThumbWidth$material3_release", "endThumbWidth", "k", "Landroidx/compose/runtime/MutableIntState;", "getTotalWidth$material3_release", "setTotalWidth$material3_release", "(I)V", "totalWidth", "l", "getRawOffsetStart$material3_release", "setRawOffsetStart$material3_release", "rawOffsetStart", "m", "getRawOffsetEnd$material3_release", "setRawOffsetEnd$material3_release", "rawOffsetEnd", "n", "Landroidx/compose/runtime/MutableState;", "isRtl$material3_release", "()Z", "setRtl$material3_release", "(Z)V", "isRtl", "o", "getGestureEndAction$material3_release", "gestureEndAction", "newVal", "getActiveRangeStart", "setActiveRangeStart", "getActiveRangeEnd", "setActiveRangeEnd", "getCoercedActiveRangeStartAsFraction$material3_release", "coercedActiveRangeStartAsFraction", "getCoercedActiveRangeEndAsFraction$material3_release", "coercedActiveRangeEndAsFraction", "getStartSteps$material3_release", "startSteps", "getEndSteps$material3_release", "endSteps", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2263:1\n76#2:2264\n109#2,2:2265\n76#2:2267\n109#2,2:2268\n76#2:2270\n109#2,2:2271\n76#2:2273\n109#2,2:2274\n76#2:2276\n109#2,2:2277\n76#2:2282\n109#2,2:2283\n76#2:2285\n109#2,2:2286\n76#2:2291\n109#2,2:2292\n76#2:2294\n109#2,2:2295\n75#3:2279\n108#3,2:2280\n81#4:2288\n107#4,2:2289\n1#5:2297\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n*L\n2069#1:2264\n2069#1:2265,2\n2070#1:2267\n2070#1:2268,2\n2106#1:2270\n2106#1:2271,2\n2107#1:2273\n2107#1:2274,2\n2108#1:2276\n2108#1:2277,2\n2110#1:2282\n2110#1:2283,2\n2111#1:2285\n2111#1:2286,2\n2117#1:2291\n2117#1:2292,2\n2118#1:2294\n2118#1:2295,2\n2109#1:2279\n2109#1:2280,2\n2113#1:2288\n2113#1:2289,2\n*E\n"})
public final class RangeSliderState {
    public static final int $stable = 8;
    public final int a;
    public Function0 b;
    public final ClosedFloatingPointRange c;
    public final MutableFloatState d;
    public final MutableFloatState e;
    public Function1 f;
    public final float[] g;
    public final MutableFloatState h;
    public final MutableFloatState i;
    public final MutableFloatState j;
    public final MutableIntState k;
    public final MutableFloatState l;
    public final MutableFloatState m;
    public final MutableState n;
    public final hi o;
    public final MutableFloatState p;
    public final MutableFloatState q;

    public RangeSliderState() {
        this(0.0f, 0.0f, 0, null, null, 0x1F, null);
    }

    public RangeSliderState(float f, float f1, @IntRange(from = 0L) int v, @Nullable Function0 function00, @NotNull ClosedFloatingPointRange closedFloatingPointRange0) {
        this.a = v;
        this.b = function00;
        this.c = closedFloatingPointRange0;
        this.d = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.e = PrimitiveSnapshotStateKt.mutableFloatStateOf(f1);
        this.g = SliderKt.access$stepsToTickFractions(v);
        this.h = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.i = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.j = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.k = SnapshotIntStateKt.mutableIntStateOf(0);
        this.l = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.m = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.n = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.o = new hi(this, 0);
        this.p = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.q = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public RangeSliderState(float f, float f1, int v, Function0 function00, ClosedFloatingPointRange closedFloatingPointRange0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            function00 = null;
        }
        if((v1 & 16) != 0) {
            closedFloatingPointRange0 = e.rangeTo(0.0f, 1.0f);
        }
        this(((v1 & 1) == 0 ? f : 0.0f), ((v1 & 2) == 0 ? f1 : 1.0f), v, function00, closedFloatingPointRange0);
    }

    public final float a(float f, float f1, float f2) {
        return SliderKt.access$scale(((Number)this.c.getStart()).floatValue(), ((Number)this.c.getEndInclusive()).floatValue(), f2, f, f1);
    }

    public final float getActiveRangeEnd() {
        return this.e.getFloatValue();
    }

    public final float getActiveRangeStart() {
        return this.d.getFloatValue();
    }

    public final float getCoercedActiveRangeEndAsFraction$material3_release() {
        return SliderKt.access$calcFraction(((Number)this.c.getStart()).floatValue(), ((Number)this.c.getEndInclusive()).floatValue(), this.getActiveRangeEnd());
    }

    public final float getCoercedActiveRangeStartAsFraction$material3_release() {
        return SliderKt.access$calcFraction(((Number)this.c.getStart()).floatValue(), ((Number)this.c.getEndInclusive()).floatValue(), this.getActiveRangeStart());
    }

    public final int getEndSteps$material3_release() {
        return (int)(((float)Math.floor((1.0f - this.getCoercedActiveRangeStartAsFraction$material3_release()) * ((float)this.a))));
    }

    public final float getEndThumbWidth$material3_release() {
        return this.j.getFloatValue();
    }

    @NotNull
    public final Function1 getGestureEndAction$material3_release() {
        return this.o;
    }

    @Nullable
    public final Function1 getOnValueChange$material3_release() {
        return this.f;
    }

    @Nullable
    public final Function0 getOnValueChangeFinished() {
        return this.b;
    }

    public final float getRawOffsetEnd$material3_release() {
        return this.m.getFloatValue();
    }

    public final float getRawOffsetStart$material3_release() {
        return this.l.getFloatValue();
    }

    public final int getStartSteps$material3_release() {
        return (int)(((float)Math.floor(this.getCoercedActiveRangeEndAsFraction$material3_release() * ((float)this.a))));
    }

    public final float getStartThumbWidth$material3_release() {
        return this.i.getFloatValue();
    }

    public final int getSteps() {
        return this.a;
    }

    @NotNull
    public final float[] getTickFractions$material3_release() {
        return this.g;
    }

    public final int getTotalWidth$material3_release() {
        return this.k.getIntValue();
    }

    public final float getTrackHeight$material3_release() {
        return this.h.getFloatValue();
    }

    @NotNull
    public final ClosedFloatingPointRange getValueRange() {
        return this.c;
    }

    public final boolean isRtl$material3_release() {
        return ((Boolean)this.n.getValue()).booleanValue();
    }

    public final void onDrag$material3_release(boolean z, float f) {
        long v;
        float[] arr_f = this.g;
        MutableFloatState mutableFloatState0 = this.p;
        MutableFloatState mutableFloatState1 = this.q;
        if(z) {
            this.setRawOffsetStart$material3_release(this.getRawOffsetStart$material3_release() + f);
            this.setRawOffsetEnd$material3_release(this.a(mutableFloatState1.getFloatValue(), mutableFloatState0.getFloatValue(), this.getActiveRangeEnd()));
            float f1 = this.getRawOffsetEnd$material3_release();
            v = SliderKt.SliderRange(SliderKt.access$snapValueToTick(c.coerceIn(this.getRawOffsetStart$material3_release(), mutableFloatState1.getFloatValue(), f1), arr_f, mutableFloatState1.getFloatValue(), mutableFloatState0.getFloatValue()), f1);
        }
        else {
            this.setRawOffsetEnd$material3_release(this.getRawOffsetEnd$material3_release() + f);
            this.setRawOffsetStart$material3_release(this.a(mutableFloatState1.getFloatValue(), mutableFloatState0.getFloatValue(), this.getActiveRangeStart()));
            float f2 = this.getRawOffsetStart$material3_release();
            v = SliderKt.SliderRange(f2, SliderKt.access$snapValueToTick(c.coerceIn(this.getRawOffsetEnd$material3_release(), f2, mutableFloatState0.getFloatValue()), arr_f, mutableFloatState1.getFloatValue(), mutableFloatState0.getFloatValue()));
        }
        long v1 = SliderKt.access$scale-ziovWd0(mutableFloatState1.getFloatValue(), mutableFloatState0.getFloatValue(), v, ((Number)this.c.getStart()).floatValue(), ((Number)this.c.getEndInclusive()).floatValue());
        if(!SliderRange.equals-impl0(v1, SliderKt.SliderRange(this.getActiveRangeStart(), this.getActiveRangeEnd()))) {
            Function1 function10 = this.f;
            if(function10 != null) {
                function10.invoke(SliderRange.box-impl(v1));
                return;
            }
            this.setActiveRangeStart(SliderRange.getStart-impl(v1));
            this.setActiveRangeEnd(SliderRange.getEndInclusive-impl(v1));
        }
    }

    public final void setActiveRangeEnd(float f) {
        float f1 = c.coerceIn(f, this.getActiveRangeStart(), ((Number)this.c.getEndInclusive()).floatValue());
        float f2 = ((Number)this.c.getStart()).floatValue();
        float f3 = ((Number)this.c.getEndInclusive()).floatValue();
        float f4 = SliderKt.access$snapValueToTick(f1, this.g, f2, f3);
        this.e.setFloatValue(f4);
    }

    public final void setActiveRangeStart(float f) {
        float f1 = c.coerceIn(f, ((Number)this.c.getStart()).floatValue(), this.getActiveRangeEnd());
        float f2 = ((Number)this.c.getStart()).floatValue();
        float f3 = ((Number)this.c.getEndInclusive()).floatValue();
        float f4 = SliderKt.access$snapValueToTick(f1, this.g, f2, f3);
        this.d.setFloatValue(f4);
    }

    public final void setEndThumbWidth$material3_release(float f) {
        this.j.setFloatValue(f);
    }

    public final void setOnValueChange$material3_release(@Nullable Function1 function10) {
        this.f = function10;
    }

    public final void setOnValueChangeFinished(@Nullable Function0 function00) {
        this.b = function00;
    }

    public final void setRawOffsetEnd$material3_release(float f) {
        this.m.setFloatValue(f);
    }

    public final void setRawOffsetStart$material3_release(float f) {
        this.l.setFloatValue(f);
    }

    public final void setRtl$material3_release(boolean z) {
        this.n.setValue(Boolean.valueOf(z));
    }

    public final void setStartThumbWidth$material3_release(float f) {
        this.i.setFloatValue(f);
    }

    public final void setTotalWidth$material3_release(int v) {
        this.k.setIntValue(v);
    }

    public final void setTrackHeight$material3_release(float f) {
        this.h.setFloatValue(f);
    }

    public final void updateMinMaxPx$material3_release() {
        float f = Math.max(((float)this.getTotalWidth$material3_release()) - this.getEndThumbWidth$material3_release() / 2.0f, 0.0f);
        float f1 = Math.min(this.getStartThumbWidth$material3_release() / 2.0f, f);
        MutableFloatState mutableFloatState0 = this.q;
        int v = Float.compare(mutableFloatState0.getFloatValue(), f1);
        MutableFloatState mutableFloatState1 = this.p;
        if(v != 0 || mutableFloatState1.getFloatValue() != f) {
            mutableFloatState0.setFloatValue(f1);
            mutableFloatState1.setFloatValue(f);
            this.setRawOffsetStart$material3_release(this.a(mutableFloatState0.getFloatValue(), mutableFloatState1.getFloatValue(), this.getActiveRangeStart()));
            this.setRawOffsetEnd$material3_release(this.a(mutableFloatState0.getFloatValue(), mutableFloatState1.getFloatValue(), this.getActiveRangeEnd()));
        }
    }
}

