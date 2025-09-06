package p0;

import androidx.compose.foundation.interaction.Interaction;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class l4 extends ContinuationImpl {
    public n4 o;
    public Interaction p;
    public Object q;
    public final n4 r;
    public int s;

    public l4(n4 n40, ContinuationImpl continuationImpl0) {
        this.r = n40;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.a(null, this);
    }
}

