package rf;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.implementations.persistentOrderedSet.Links;

public final class a extends Lambda implements Function2 {
    public static final a A;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(2, 0);
        a.y = new a(2, 1);
        a.z = new a(2, 2);
        a.A = new a(2, 3);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Links)object0), "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(((Links)object1), "<anonymous parameter 1>");
                return true;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((Links)object0), "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(((Links)object1), "<anonymous parameter 1>");
                return true;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((Links)object0), "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(((Links)object1), "<anonymous parameter 1>");
                return true;
            }
            default: {
                Intrinsics.checkNotNullParameter(((Links)object0), "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(((Links)object1), "<anonymous parameter 1>");
                return true;
            }
        }
    }
}

