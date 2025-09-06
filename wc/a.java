package wc;

import e.p;
import e.q;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

public final class a implements Function1 {
    public final int a;
    public final p b;
    public final Object c;

    public a(p p0, Object object0, int v) {
        this.a = v;
        this.b = p0;
        this.c = object0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return this.a == 0 ? this.b.b(((q)this.c), ((Continuation)object0)) : this.b.c(((List)this.c), ((Continuation)object0));
    }
}

