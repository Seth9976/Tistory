package p0;

import androidx.compose.runtime.State;
import ce.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n7 extends Lambda implements Function1 {
    public final int w;
    public final State x;
    public final float y;

    public n7(State state0, float f, int v) {
        this.w = v;
        this.x = state0;
        this.y = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ((Function1)this.x.getValue()).invoke(e.rangeTo(((Number)object0).floatValue(), this.y));
            return Unit.INSTANCE;
        }
        ((Function1)this.x.getValue()).invoke(e.rangeTo(this.y, ((Number)object0).floatValue()));
        return Unit.INSTANCE;
    }
}

