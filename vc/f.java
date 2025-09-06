package vc;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.platform.h;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import dev.chrisbanes.snapper.SnapperLayoutItemInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class f extends Lambda implements Function1 {
    public final boolean A;
    public final int B;
    public final FloatRef w;
    public final ScrollScope x;
    public final FloatRef y;
    public final SnapperFlingBehavior z;

    public f(FloatRef ref$FloatRef0, ScrollScope scrollScope0, FloatRef ref$FloatRef1, SnapperFlingBehavior snapperFlingBehavior0, boolean z, int v) {
        this.w = ref$FloatRef0;
        this.x = scrollScope0;
        this.y = ref$FloatRef1;
        this.z = snapperFlingBehavior0;
        this.A = z;
        this.B = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((AnimationScope)object0), "$this$animateDecay");
        float f = ((Number)((AnimationScope)object0).getValue()).floatValue() - this.w.element;
        ScrollScope scrollScope0 = this.x;
        float f1 = scrollScope0.scrollBy(f);
        this.w.element = ((Number)((AnimationScope)object0).getValue()).floatValue();
        this.y.element = ((Number)((AnimationScope)object0).getVelocity()).floatValue();
        if(Math.abs(f - f1) > 0.5f) {
            ((AnimationScope)object0).cancelAnimation();
        }
        SnapperFlingBehavior snapperFlingBehavior0 = this.z;
        SnapperLayoutItemInfo snapperLayoutItemInfo0 = snapperFlingBehavior0.a.getCurrentItem();
        if(snapperLayoutItemInfo0 == null) {
            ((AnimationScope)object0).cancelAnimation();
            return Unit.INSTANCE;
        }
        boolean z = ((AnimationScope)object0).isRunning();
        int v = this.B;
        if(z && this.A) {
            if(((Number)((AnimationScope)object0).getVelocity()).floatValue() > 0.0f && snapperLayoutItemInfo0.getIndex() == v - 1) {
                ((AnimationScope)object0).cancelAnimation();
            }
            else if(((Number)((AnimationScope)object0).getVelocity()).floatValue() < 0.0f && snapperLayoutItemInfo0.getIndex() == v) {
                ((AnimationScope)object0).cancelAnimation();
            }
        }
        if(((AnimationScope)object0).isRunning() && SnapperFlingBehavior.access$performSnapBackIfNeeded(snapperFlingBehavior0, ((AnimationScope)object0), snapperLayoutItemInfo0, v, new h(scrollScope0, 11))) {
            ((AnimationScope)object0).cancelAnimation();
        }
        return Unit.INSTANCE;
    }
}

