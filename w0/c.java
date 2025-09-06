package w0;

import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.3.1.invoke..inlined.onDispose.1;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.platform.t1;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final LifecycleOwner w;
    public final Function1 x;
    public final Function0 y;

    public c(LifecycleOwner lifecycleOwner0, Function1 function10, Function0 function00) {
        this.w = lifecycleOwner0;
        this.x = function10;
        this.y = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        t1 t10 = new t1(this.x, 5);
        this.w.getLifecycle().addObserver(t10);
        return new AccessibilityServiceStateProvider_androidKt.ObserveState.3.1.invoke..inlined.onDispose.1(this.y, this.w, t10);
    }
}

