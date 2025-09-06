package androidx.room;

import io.reactivex.Maybe;
import io.reactivex.functions.Function;

public final class j1 implements Function {
    public final int a;
    public final Maybe b;

    public j1(Maybe maybe0, int v) {
        this.a = v;
        this.b = maybe0;
        super();
    }

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        return this.b;
    }
}

