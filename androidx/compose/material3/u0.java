package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class u0 extends Lambda implements Function0 {
    public final TopAppBarScrollBehavior w;
    public final FloatRef x;
    public final FloatRef y;

    public u0(TopAppBarScrollBehavior topAppBarScrollBehavior0, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1) {
        this.w = topAppBarScrollBehavior0;
        this.x = ref$FloatRef0;
        this.y = ref$FloatRef1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Float float0;
        TopAppBarState topAppBarState0 = null;
        TopAppBarScrollBehavior topAppBarScrollBehavior0 = this.w;
        if(topAppBarScrollBehavior0 == null) {
            float0 = null;
        }
        else {
            TopAppBarState topAppBarState1 = topAppBarScrollBehavior0.getState();
            float0 = topAppBarState1 == null ? null : topAppBarState1.getHeightOffsetLimit();
        }
        FloatRef ref$FloatRef0 = this.x;
        FloatRef ref$FloatRef1 = this.y;
        if(!Intrinsics.areEqual(float0, ref$FloatRef0.element - ref$FloatRef1.element)) {
            if(topAppBarScrollBehavior0 != null) {
                topAppBarState0 = topAppBarScrollBehavior0.getState();
            }
            if(topAppBarState0 != null) {
                topAppBarState0.setHeightOffsetLimit(ref$FloatRef0.element - ref$FloatRef1.element);
            }
        }
        return Unit.INSTANCE;
    }
}

