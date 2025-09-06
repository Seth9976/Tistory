package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class o0 extends Lambda implements Function1 {
    public final int w;
    public final TopAppBarScrollBehavior x;

    public o0(TopAppBarScrollBehavior topAppBarScrollBehavior0, int v) {
        this.w = v;
        this.x = topAppBarScrollBehavior0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            TopAppBarState topAppBarState0 = this.x.getState();
            topAppBarState0.setHeightOffset(topAppBarState0.getHeightOffset() + ((Number)object0).floatValue());
            return Unit.INSTANCE;
        }
        TopAppBarState topAppBarState1 = this.x.getState();
        topAppBarState1.setHeightOffset(topAppBarState1.getHeightOffset() + ((Number)object0).floatValue());
        return Unit.INSTANCE;
    }
}

