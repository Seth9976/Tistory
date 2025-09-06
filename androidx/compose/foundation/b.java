package androidx.compose.foundation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import u.q2;

public final class b extends Lambda implements Function0 {
    public final q2 w;

    public b(q2 q20) {
        this.w = q20;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q2 q20 = this.w;
        if(q20.r.getIntValue() > q20.s.getIntValue() && (!MarqueeAnimationMode.equals-impl0(((MarqueeAnimationMode)q20.w.getValue()).unbox-impl(), 1) || ((Boolean)q20.t.getValue()).booleanValue())) {
            int v = q20.r.getIntValue();
            return (float)(q20.c() + v);
        }
        return null;
    }
}

