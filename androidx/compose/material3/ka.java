package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class ka extends ContinuationImpl {
    public ma o;
    public Interaction p;
    public Object q;
    public final ma r;
    public int s;

    public ka(ma ma0, ContinuationImpl continuationImpl0) {
        this.r = ma0;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.a(null, this);
    }
}

