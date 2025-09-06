package sf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;

public final class k {
    public final Object a;
    public final CancelHandler b;
    public final Function1 c;
    public final Object d;
    public final Throwable e;

    public k(Object object0, CancelHandler cancelHandler0, Function1 function10, Object object1, Throwable throwable0) {
        this.a = object0;
        this.b = cancelHandler0;
        this.c = function10;
        this.d = object1;
        this.e = throwable0;
    }

    public k(Object object0, CancelHandler cancelHandler0, Function1 function10, Object object1, Throwable throwable0, int v) {
        this(object0, ((v & 2) == 0 ? cancelHandler0 : null), ((v & 4) == 0 ? function10 : null), ((v & 8) == 0 ? object1 : null), ((v & 16) == 0 ? throwable0 : null));
    }

    public static k a(k k0, CancelHandler cancelHandler0, Throwable throwable0, int v) {
        Object object0 = k0.a;
        if((v & 2) != 0) {
            cancelHandler0 = k0.b;
        }
        Function1 function10 = k0.c;
        Object object1 = k0.d;
        if((v & 16) != 0) {
            throwable0 = k0.e;
        }
        k0.getClass();
        return new k(object0, cancelHandler0, function10, object1, throwable0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((k)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((k)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((k)object0).c)) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((k)object0).d) ? Intrinsics.areEqual(this.e, ((k)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        Throwable throwable0 = this.e;
        if(throwable0 != null) {
            v = throwable0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }
}

