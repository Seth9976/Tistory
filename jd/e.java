package jd;

import io.reactivex.functions.BiFunction;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

public final class e implements BiFunction {
    public final int a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    public static final e k;
    public static final e l;
    public static final e m;

    static {
        e.b = new e(0);
        e.c = new e(1);
        e.d = new e(2);
        e.e = new e(3);
        e.f = new e(4);
        e.g = new e(5);
        e.h = new e(6);
        e.i = new e(7);
        e.j = new e(8);
        e.k = new e(9);
        e.l = new e(10);
        e.m = new e(11);
    }

    public e(int v) {
        this.a = v;
        super();
    }

    @Override  // io.reactivex.functions.BiFunction
    public final Object apply(Object object0, Object object1) {
        switch(this.a) {
            case 0: {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                return TuplesKt.to(object0, object1);
            }
            case 1: {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                return TuplesKt.to(object0, object1);
            }
            case 2: {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "u");
                return new Pair(object0, object1);
            }
            case 3: {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "u");
                return new Pair(object0, object1);
            }
            case 4: {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "u");
                return new Pair(object0, object1);
            }
            case 5: {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "u");
                return new Pair(object0, object1);
            }
            case 6: {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                return TuplesKt.to(object0, object1);
            }
            case 7: {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                return TuplesKt.to(object0, object1);
            }
            case 8: {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "u");
                return new Pair(object0, object1);
            }
            case 9: {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "u");
                return new Pair(object0, object1);
            }
            case 10: {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "u");
                return new Pair(object0, object1);
            }
            default: {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "u");
                return new Pair(object0, object1);
            }
        }
    }
}

