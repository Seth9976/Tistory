package kf;

import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

public final class g extends Lambda implements Function1 {
    public static final g A;
    public static final g B;
    public static final g C;
    public final int w;
    public static final g x;
    public static final g y;
    public static final g z;

    static {
        g.x = new g(1, 0);
        g.y = new g(1, 1);
        g.z = new g(1, 2);
        g.A = new g(1, 3);
        g.B = new g(1, 4);
        g.C = new g(1, 5);
    }

    public g(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Sequence)object0), "it");
                return ((Sequence)object0).iterator();
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((Iterable)object0), "it");
                return ((Iterable)object0).iterator();
            }
            case 2: 
            case 3: {
                return object0;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((IndexedValue)object0), "it");
                return ((IndexedValue)object0).getValue();
            }
            default: {
                return object0 == null;
            }
        }
    }
}

