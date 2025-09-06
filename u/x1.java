package u;

import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class x1 extends ContinuationImpl {
    public b2 o;
    public Enter p;
    public Object q;
    public final b2 r;
    public int s;

    public x1(b2 b20, ContinuationImpl continuationImpl0) {
        this.r = b20;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return b2.b(this.r, this);
    }
}

