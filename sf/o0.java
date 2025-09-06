package sf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;

public final class o0 implements Function1 {
    @Volatile
    private volatile int _state;
    public final Job a;
    public final Thread b;
    public DisposableHandle c;
    public static final AtomicIntegerFieldUpdater d;

    static {
        o0.d = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_state");
    }

    public o0(Job job0) {
        this.a = job0;
        this.b = Thread.currentThread();
    }

    public final void a() {
        while(true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = o0.d;
            int v = atomicIntegerFieldUpdater0.get(this);
            switch(v) {
                case 0: {
                    if(atomicIntegerFieldUpdater0.compareAndSet(this, 0, 1)) {
                        DisposableHandle disposableHandle0 = this.c;
                        if(disposableHandle0 != null) {
                            disposableHandle0.dispose();
                        }
                        return;
                    }
                    if(false) {
                        Thread.interrupted();
                        return;
                    }
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    Thread.interrupted();
                    return;
                }
                default: {
                    o0.b(v);
                    throw null;
                }
            }
        }
    }

    public static void b(int v) {
        throw new IllegalStateException(("Illegal state " + v).toString());
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        while(true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = o0.d;
            int v = atomicIntegerFieldUpdater0.get(this);
            if(v != 0) {
                if(v == 1 || v == 2 || v == 3) {
                    break;
                }
                o0.b(v);
                throw null;
            }
            if(atomicIntegerFieldUpdater0.compareAndSet(this, 0, 2)) {
                this.b.interrupt();
                atomicIntegerFieldUpdater0.set(this, 3);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}

