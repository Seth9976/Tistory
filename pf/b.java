package pf;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue;

public final class b extends Lambda implements Function2 {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public final int w;
    public static final b x;
    public static final b y;
    public static final b z;

    static {
        b.x = new b(2, 0);
        b.y = new b(2, 1);
        b.z = new b(2, 2);
        b.A = new b(2, 3);
        b.B = new b(2, 4);
        b.C = new b(2, 5);
        b.D = new b(2, 6);
        b.E = new b(2, 7);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((LinkedValue)object1), "b");
                return Boolean.valueOf(Intrinsics.areEqual(object0, ((LinkedValue)object1).getValue()));
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((LinkedValue)object1), "b");
                return Boolean.valueOf(Intrinsics.areEqual(object0, ((LinkedValue)object1).getValue()));
            }
            case 2: {
                return Boolean.valueOf(Intrinsics.areEqual(object0, object1));
            }
            case 3: {
                return Boolean.valueOf(Intrinsics.areEqual(object0, object1));
            }
            case 4: {
                return Boolean.valueOf(Intrinsics.areEqual(object0, object1));
            }
            case 5: {
                return Boolean.valueOf(Intrinsics.areEqual(object0, object1));
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((LinkedValue)object1), "b");
                return Boolean.valueOf(Intrinsics.areEqual(object0, ((LinkedValue)object1).getValue()));
            }
            default: {
                Intrinsics.checkNotNullParameter(((LinkedValue)object1), "b");
                return Boolean.valueOf(Intrinsics.areEqual(object0, ((LinkedValue)object1).getValue()));
            }
        }
    }
}

