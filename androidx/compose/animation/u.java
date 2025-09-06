package androidx.compose.animation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function0 {
    public final SharedContentState w;

    public u(SharedContentState sharedTransitionScope$SharedContentState0) {
        this.w = sharedTransitionScope$SharedContentState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.w.isMatchFound());
    }
}

