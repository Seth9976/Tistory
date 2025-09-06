package s;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.SharedTransitionScopeImpl;
import androidx.compose.animation.SharedTransitionScopeKt.SharedTransitionScope.1.3.1.invoke..inlined.onDispose.1;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j1 extends Lambda implements Function1 {
    public final int w;
    public final SharedTransitionScopeImpl x;

    public j1(SharedTransitionScopeImpl sharedTransitionScopeImpl0, int v) {
        this.w = v;
        this.x = sharedTransitionScopeImpl0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                SharedTransitionScope sharedTransitionScope0 = (SharedTransitionScope)object0;
                SharedTransitionScopeImpl.access$updateTransitionActiveness(this.x);
                return Unit.INSTANCE;
            }
            case 1: {
                ((ContentDrawScope)object0).drawContent();
                this.x.drawInOverlay$animation_release(((ContentDrawScope)object0));
                return Unit.INSTANCE;
            }
            default: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                return new SharedTransitionScopeKt.SharedTransitionScope.1.3.1.invoke..inlined.onDispose.1(this.x);
            }
        }
    }
}

