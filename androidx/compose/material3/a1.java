package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.FloatRef;

public final class a1 extends ContinuationImpl {
    public Object o;
    public AnimationSpec p;
    public FloatRef q;
    public Object r;
    public int s;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.s |= 0x80000000;
        return AppBarKt.access$settleAppBar(null, 0.0f, null, null, this);
    }
}

