package xf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public abstract class k0 {
    public static final j0 a;
    public static final i0 b;

    static {
        k0.a = j0.x;
        k0.b = i0.w;
    }

    public static final k a(Flow flow0, Function1 function10, Function2 function20) {
        if(!(flow0 instanceof k) || ((k)flow0).b != function10 || ((k)flow0).c != function20) {
            flow0 = new k(flow0, function10, function20);
        }
        return (k)flow0;
    }
}

