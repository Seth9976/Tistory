package t;

import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class a0 extends ContinuationImpl {
    public AnimationState o;
    public Animation p;
    public Function1 q;
    public ObjectRef r;
    public Object s;
    public int t;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.t |= 0x80000000;
        return SuspendAnimationKt.animate(null, null, 0L, null, this);
    }
}

