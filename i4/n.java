package i4;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.core.view.r;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffectImpl.1.1.invoke..inlined.onDispose.1;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class n extends Lambda implements Function1 {
    public final LifecycleOwner w;
    public final LifecycleStartStopEffectScope x;
    public final Function1 y;

    public n(LifecycleOwner lifecycleOwner0, LifecycleStartStopEffectScope lifecycleStartStopEffectScope0, Function1 function10) {
        this.w = lifecycleOwner0;
        this.x = lifecycleStartStopEffectScope0;
        this.y = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        r r0 = new r(this.x, ref$ObjectRef0, this.y, 2);
        this.w.getLifecycle().addObserver(r0);
        return new LifecycleEffectKt.LifecycleStartEffectImpl.1.1.invoke..inlined.onDispose.1(this.w, r0, ref$ObjectRef0);
    }
}

