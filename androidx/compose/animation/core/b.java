package androidx.compose.animation.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final Object w;
    public final TransitionAnimationState x;
    public final Object y;
    public final InfiniteRepeatableSpec z;

    public b(Object object0, TransitionAnimationState infiniteTransition$TransitionAnimationState0, Object object1, InfiniteRepeatableSpec infiniteRepeatableSpec0) {
        this.w = object0;
        this.x = infiniteTransition$TransitionAnimationState0;
        this.y = object1;
        this.z = infiniteRepeatableSpec0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TransitionAnimationState infiniteTransition$TransitionAnimationState0 = this.x;
        Object object0 = this.w;
        boolean z = Intrinsics.areEqual(object0, infiniteTransition$TransitionAnimationState0.getInitialValue$animation_core_release());
        Object object1 = this.y;
        if(!z || !Intrinsics.areEqual(object1, infiniteTransition$TransitionAnimationState0.getTargetValue$animation_core_release())) {
            infiniteTransition$TransitionAnimationState0.updateValues$animation_core_release(object0, object1, this.z);
        }
        return Unit.INSTANCE;
    }
}

