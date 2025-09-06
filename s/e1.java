package s;

import androidx.compose.animation.SharedBoundsNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e1 extends Lambda implements Function0 {
    public final int w;
    public final SharedBoundsNode x;

    public e1(SharedBoundsNode sharedBoundsNode0, int v) {
        this.w = v;
        this.x = sharedBoundsNode0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return SharedBoundsNode.access$requireLookaheadLayoutCoordinates(this.x);
    }
}

