package wc;

import e.p;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

public final class b implements Function1 {
    public final int a;
    public final p b;
    public final ArrayList c;

    public b(p p0, ArrayList arrayList0, int v) {
        this.a = v;
        this.b = p0;
        this.c = arrayList0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.a) {
            case 0: {
                return this.b.d(this.c, ((Continuation)object0));
            }
            case 1: {
                return this.b.a(this.c, ((Continuation)object0));
            }
            case 2: {
                return this.b.e(this.c, ((Continuation)object0));
            }
            default: {
                return this.b.b(this.c, ((Continuation)object0));
            }
        }
    }
}

