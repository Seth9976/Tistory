package i4;

import androidx.activity.e;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt.LifecycleEventEffect.1.1.invoke..inlined.onDispose.1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final LifecycleOwner w;
    public final Event x;
    public final State y;

    public f(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0, State state0) {
        this.w = lifecycleOwner0;
        this.x = lifecycle$Event0;
        this.y = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        e e0 = new e(3, this.x, this.y);
        this.w.getLifecycle().addObserver(e0);
        return new LifecycleEffectKt.LifecycleEventEffect.1.1.invoke..inlined.onDispose.1(this.w, e0);
    }
}

