package y0;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RememberObserver;
import kotlin.jvm.functions.Function1;

public final class k implements RememberObserver {
    public final Function1 a;
    public DisposableEffectResult b;

    public k(Function1 function10) {
        this.a = function10;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        DisposableEffectResult disposableEffectResult0 = this.b;
        if(disposableEffectResult0 != null) {
            disposableEffectResult0.dispose();
        }
        this.b = null;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        DisposableEffectScope disposableEffectScope0 = EffectsKt.a;
        this.b = (DisposableEffectResult)this.a.invoke(disposableEffectScope0);
    }
}

