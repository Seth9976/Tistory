package jd;

import io.reactivex.functions.Function3;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;

public final class f implements Function3 {
    public final int a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public static final f g;
    public static final f h;
    public static final f i;

    static {
        f.b = new f(0);
        f.c = new f(1);
        f.d = new f(2);
        f.e = new f(3);
        f.f = new f(4);
        f.g = new f(5);
        f.h = new f(6);
        f.i = new f(7);
    }

    public f(int v) {
        this.a = v;
        super();
    }

    @Override  // io.reactivex.functions.Function3
    public final Object apply(Object object0, Object object1, Object object2) {
        switch(this.a) {
            case 0: {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                return new Triple(object0, object1, object2);
            }
            case 1: {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                return new Triple(object0, object1, object2);
            }
            case 2: {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "t1");
                Intrinsics.checkParameterIsNotNull(object2, "t2");
                return new Triple(object0, object1, object2);
            }
            case 3: {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                return new Triple(object0, object1, object2);
            }
            case 4: {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                return new Triple(object0, object1, object2);
            }
            case 5: {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                return new Triple(object0, object1, object2);
            }
            case 6: {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "t1");
                Intrinsics.checkParameterIsNotNull(object2, "t2");
                return new Triple(object0, object1, object2);
            }
            default: {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                return new Triple(object0, object1, object2);
            }
        }
    }
}

