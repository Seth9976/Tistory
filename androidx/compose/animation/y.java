package androidx.compose.animation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function1 {
    public final boolean w;

    public y(boolean z) {
        this.w = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Unit unit0 = (Unit)object0;
        return Boolean.valueOf(this.w);
    }
}

