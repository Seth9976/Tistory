package sf;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.NodeList;
import org.jetbrains.annotations.Nullable;

public final class z implements Incomplete {
    @Volatile
    @Nullable
    private volatile Object _exceptionsHolder;
    @Volatile
    private volatile int _isCompleting;
    @Volatile
    @Nullable
    private volatile Object _rootCause;
    public final NodeList a;
    public static final AtomicIntegerFieldUpdater b;
    public static final AtomicReferenceFieldUpdater c;
    public static final AtomicReferenceFieldUpdater d;

    static {
        z.b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_isCompleting");
        z.c = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "_rootCause");
        z.d = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "_exceptionsHolder");
    }

    public z(NodeList nodeList0, Throwable throwable0) {
        this.a = nodeList0;
        this._isCompleting = 0;
        this._rootCause = throwable0;
    }

    public final void a(Throwable throwable0) {
        Throwable throwable1 = this.b();
        if(throwable1 == null) {
            z.c.set(this, throwable0);
            return;
        }
        if(throwable0 == throwable1) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = z.d;
        Object object0 = atomicReferenceFieldUpdater0.get(this);
        if(object0 == null) {
            atomicReferenceFieldUpdater0.set(this, throwable0);
            return;
        }
        if(object0 instanceof Throwable) {
            if(throwable0 == object0) {
                return;
            }
            ArrayList arrayList0 = new ArrayList(4);
            arrayList0.add(object0);
            arrayList0.add(throwable0);
            atomicReferenceFieldUpdater0.set(this, arrayList0);
            return;
        }
        if(!(object0 instanceof ArrayList)) {
            throw new IllegalStateException(("State is " + object0).toString());
        }
        ((ArrayList)object0).add(throwable0);
    }

    public final Throwable b() {
        return (Throwable)z.c.get(this);
    }

    public final boolean c() {
        return this.b() != null;
    }

    public final boolean d() {
        return z.b.get(this) != 0;
    }

    public final ArrayList e(Throwable throwable0) {
        ArrayList arrayList0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = z.d;
        Object object0 = atomicReferenceFieldUpdater0.get(this);
        if(object0 == null) {
            arrayList0 = new ArrayList(4);
        }
        else if(object0 instanceof Throwable) {
            ArrayList arrayList1 = new ArrayList(4);
            arrayList1.add(object0);
            arrayList0 = arrayList1;
        }
        else if(object0 instanceof ArrayList) {
            arrayList0 = (ArrayList)object0;
        }
        else {
            throw new IllegalStateException(("State is " + object0).toString());
        }
        Throwable throwable1 = this.b();
        if(throwable1 != null) {
            arrayList0.add(0, throwable1);
        }
        if(throwable0 != null && !Intrinsics.areEqual(throwable0, throwable1)) {
            arrayList0.add(throwable0);
        }
        atomicReferenceFieldUpdater0.set(this, JobSupportKt.d);
        return arrayList0;
    }

    @Override  // kotlinx.coroutines.Incomplete
    public final NodeList getList() {
        return this.a;
    }

    @Override  // kotlinx.coroutines.Incomplete
    public final boolean isActive() {
        return this.b() == null;
    }

    @Override
    public final String toString() {
        return "Finishing[cancelling=" + this.c() + ", completing=" + this.d() + ", rootCause=" + this.b() + ", exceptions=" + z.d.get(this) + ", list=" + this.a + ']';
    }
}

