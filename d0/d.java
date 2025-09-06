package d0;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.ranges.c;

public final class d extends Lambda implements Function1 {
    public final ScrollScope A;
    public final BooleanRef B;
    public final boolean C;
    public final float D;
    public final IntRef E;
    public final int F;
    public final int G;
    public final ObjectRef H;
    public final LazyLayoutAnimateScrollScope w;
    public final int x;
    public final float y;
    public final FloatRef z;

    public d(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope0, int v, float f, FloatRef ref$FloatRef0, ScrollScope scrollScope0, BooleanRef ref$BooleanRef0, boolean z, float f1, IntRef ref$IntRef0, int v1, int v2, ObjectRef ref$ObjectRef0) {
        this.w = lazyLayoutAnimateScrollScope0;
        this.x = v;
        this.y = f;
        this.z = ref$FloatRef0;
        this.A = scrollScope0;
        this.B = ref$BooleanRef0;
        this.C = z;
        this.D = f1;
        this.E = ref$IntRef0;
        this.F = v1;
        this.G = v2;
        this.H = ref$ObjectRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope0 = this.w;
        int v = this.x;
        boolean z = LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope0, v);
        BooleanRef ref$BooleanRef0 = this.B;
        int v1 = this.G;
        boolean z1 = this.C;
        ScrollScope scrollScope0 = this.A;
        if(!z) {
            float f = this.y > 0.0f ? c.coerceAtMost(((Number)((AnimationScope)object0).getValue()).floatValue(), this.y) : c.coerceAtLeast(((Number)((AnimationScope)object0).getValue()).floatValue(), this.y);
            FloatRef ref$FloatRef0 = this.z;
            float f1 = f - ref$FloatRef0.element;
            float f2 = scrollScope0.scrollBy(f1);
            if(!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope0, v) && !f.a(z1, lazyLayoutAnimateScrollScope0, v, v1)) {
                if(f1 != f2) {
                    ((AnimationScope)object0).cancelAnimation();
                    ref$BooleanRef0.element = false;
                    return Unit.INSTANCE;
                }
                ref$FloatRef0.element += f1;
                float f3 = this.D;
                if(!z1) {
                    if(((Number)((AnimationScope)object0).getValue()).floatValue() < -f3) {
                        ((AnimationScope)object0).cancelAnimation();
                    }
                }
                else if(((Number)((AnimationScope)object0).getValue()).floatValue() > f3) {
                    ((AnimationScope)object0).cancelAnimation();
                }
                int v2 = this.F;
                IntRef ref$IntRef0 = this.E;
                if(!z1) {
                    if(ref$IntRef0.element >= 2 && lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex() - v > v2) {
                        lazyLayoutAnimateScrollScope0.snapToItem(scrollScope0, v2 + v, 0);
                    }
                }
                else if(ref$IntRef0.element >= 2 && v - lazyLayoutAnimateScrollScope0.getLastVisibleItemIndex() > v2) {
                    lazyLayoutAnimateScrollScope0.snapToItem(scrollScope0, v - v2, 0);
                }
            }
        }
        if(f.a(z1, lazyLayoutAnimateScrollScope0, v, v1)) {
            lazyLayoutAnimateScrollScope0.snapToItem(scrollScope0, v, v1);
            ref$BooleanRef0.element = false;
            ((AnimationScope)object0).cancelAnimation();
            return Unit.INSTANCE;
        }
        if(LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope0, v)) {
            throw new d0.c(zd.c.roundToInt(lazyLayoutAnimateScrollScope0.calculateDistanceTo(v)), ((AnimationState)this.H.element));
        }
        return Unit.INSTANCE;
    }
}

