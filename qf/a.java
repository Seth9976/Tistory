package qf;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue;

public final class a extends Lambda implements Function2 {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(2, 0);
        a.y = new a(2, 1);
        a.z = new a(2, 2);
        a.A = new a(2, 3);
        a.B = new a(2, 4);
        a.C = new a(2, 5);
        a.D = new a(2, 6);
        a.E = new a(2, 7);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((LinkedValue)object0), "a");
                Intrinsics.checkNotNullParameter(((LinkedValue)object1), "b");
                return Boolean.valueOf(Intrinsics.areEqual(((LinkedValue)object0).getValue(), ((LinkedValue)object1).getValue()));
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((LinkedValue)object0), "a");
                Intrinsics.checkNotNullParameter(((LinkedValue)object1), "b");
                return Boolean.valueOf(Intrinsics.areEqual(((LinkedValue)object0).getValue(), ((LinkedValue)object1).getValue()));
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((LinkedValue)object0), "a");
                return Boolean.valueOf(Intrinsics.areEqual(((LinkedValue)object0).getValue(), object1));
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((LinkedValue)object0), "a");
                return Boolean.valueOf(Intrinsics.areEqual(((LinkedValue)object0).getValue(), object1));
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((LinkedValue)object0), "a");
                Intrinsics.checkNotNullParameter(((LinkedValue)object1), "b");
                return Boolean.valueOf(Intrinsics.areEqual(((LinkedValue)object0).getValue(), ((LinkedValue)object1).getValue()));
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((LinkedValue)object0), "a");
                Intrinsics.checkNotNullParameter(((LinkedValue)object1), "b");
                return Boolean.valueOf(Intrinsics.areEqual(((LinkedValue)object0).getValue(), ((LinkedValue)object1).getValue()));
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((LinkedValue)object0), "a");
                return Boolean.valueOf(Intrinsics.areEqual(((LinkedValue)object0).getValue(), object1));
            }
            default: {
                Intrinsics.checkNotNullParameter(((LinkedValue)object0), "a");
                return Boolean.valueOf(Intrinsics.areEqual(((LinkedValue)object0).getValue(), object1));
            }
        }
    }
}

