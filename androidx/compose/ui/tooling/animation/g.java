package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0.e;

public final class g extends Lambda implements Function1 {
    public final InfiniteTransitionSearchInfo w;
    public final PreviewAnimationClock x;

    public g(InfiniteTransitionSearchInfo animationSearch$InfiniteTransitionSearchInfo0, PreviewAnimationClock previewAnimationClock0) {
        this.w = animationSearch$InfiniteTransitionSearchInfo0;
        this.x = previewAnimationClock0;
        super(1);
    }

    public final void a(Object object0) {
        InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation0 = InfiniteTransitionComposeAnimation.Companion.parse$ui_tooling_release(this.w);
        if(infiniteTransitionComposeAnimation0 != null) {
            this.x.getInfiniteTransitionClocks$ui_tooling_release().put(infiniteTransitionComposeAnimation0, new InfiniteTransitionClock(infiniteTransitionComposeAnimation0, new e(this.x, 7)));
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a(object0);
        return Unit.INSTANCE;
    }
}

