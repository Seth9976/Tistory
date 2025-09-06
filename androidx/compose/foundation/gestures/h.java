package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final BringIntoViewRequestPriorityQueue w;
    public final Request x;

    public h(BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue0, Request contentInViewNode$Request0) {
        this.w = bringIntoViewRequestPriorityQueue0;
        this.x = contentInViewNode$Request0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        this.w.a.remove(this.x);
        return Unit.INSTANCE;
    }
}

