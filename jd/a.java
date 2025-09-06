package jd;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class a implements Function {
    public final int a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final a p;
    public static final a q;
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;

    static {
        a.b = new a(0);
        a.c = new a(1);
        a.d = new a(2);
        a.e = new a(3);
        a.f = new a(4);
        a.g = new a(5);
        a.h = new a(6);
        a.i = new a(7);
        a.j = new a(8);
        a.k = new a(9);
        a.l = new a(10);
        a.m = new a(11);
        a.n = new a(12);
        a.o = new a(13);
        a.p = new a(14);
        a.q = new a(15);
        a.r = new a(16);
        a.s = new a(17);
        a.t = new a(18);
        a.u = new a(19);
        a.v = new a(20);
        a.w = new a(21);
    }

    public a(int v) {
        this.a = v;
        super();
    }

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        switch(this.a) {
            case 0: {
                Intrinsics.checkParameterIsNotNull(((Completable)object0), "it");
                return (Completable)object0;
            }
            case 1: {
                Intrinsics.checkParameterIsNotNull(((Completable)object0), "it");
                return (Completable)object0;
            }
            case 2: {
                Intrinsics.checkParameterIsNotNull(((Flowable)object0), "it");
                return (Flowable)object0;
            }
            case 3: {
                Intrinsics.checkParameterIsNotNull(((Flowable)object0), "it");
                return (Flowable)object0;
            }
            case 4: {
                Intrinsics.checkParameterIsNotNull(((Flowable)object0), "it");
                return (Flowable)object0;
            }
            case 5: {
                Intrinsics.checkParameterIsNotNull(((Pair)object0), "it");
                return ((Pair)object0).getFirst();
            }
            case 6: {
                Intrinsics.checkParameterIsNotNull(((Pair)object0), "it");
                return ((Pair)object0).getSecond();
            }
            case 7: {
                Intrinsics.checkParameterIsNotNull(((Pair)object0), "it");
                return ((Pair)object0).getFirst();
            }
            case 8: {
                Intrinsics.checkParameterIsNotNull(((Pair)object0), "it");
                return ((Pair)object0).getSecond();
            }
            case 9: {
                Intrinsics.checkParameterIsNotNull(((Maybe)object0), "it");
                return (Maybe)object0;
            }
            case 10: {
                Intrinsics.checkParameterIsNotNull(((Maybe)object0), "it");
                return (Maybe)object0;
            }
            case 11: {
                Intrinsics.checkParameterIsNotNull(((Observable)object0), "it");
                return (Observable)object0;
            }
            case 12: {
                Intrinsics.checkParameterIsNotNull(((Iterable)object0), "it");
                return (Iterable)object0;
            }
            case 13: {
                Intrinsics.checkParameterIsNotNull(((Iterable)object0), "it");
                return (Iterable)object0;
            }
            case 14: {
                Intrinsics.checkParameterIsNotNull(((Observable)object0), "it");
                return (Observable)object0;
            }
            case 15: {
                Intrinsics.checkParameterIsNotNull(((Observable)object0), "it");
                return (Observable)object0;
            }
            case 16: {
                Intrinsics.checkParameterIsNotNull(((Pair)object0), "it");
                return ((Pair)object0).getFirst();
            }
            case 17: {
                Intrinsics.checkParameterIsNotNull(((Pair)object0), "it");
                return ((Pair)object0).getSecond();
            }
            case 18: {
                Intrinsics.checkParameterIsNotNull(((Pair)object0), "it");
                return ((Pair)object0).getFirst();
            }
            case 19: {
                Intrinsics.checkParameterIsNotNull(((Pair)object0), "it");
                return ((Pair)object0).getSecond();
            }
            case 20: {
                Intrinsics.checkParameterIsNotNull(((Single)object0), "it");
                return (Single)object0;
            }
            default: {
                Intrinsics.checkParameterIsNotNull(((Single)object0), "it");
                return (Single)object0;
            }
        }
    }
}

