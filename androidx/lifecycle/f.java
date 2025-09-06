package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class f implements Runnable {
    public final int a;
    public final ComputableLiveData b;

    public f(ComputableLiveData computableLiveData0, int v) {
        this.a = v;
        this.b = computableLiveData0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            ComputableLiveData computableLiveData0 = this.b;
            Intrinsics.checkNotNullParameter(computableLiveData0, "this$0");
            boolean z = computableLiveData0.getLiveData().hasActiveObservers();
            if(computableLiveData0.c.compareAndSet(false, true) && z) {
                computableLiveData0.a.execute(computableLiveData0.refreshRunnable);
            }
            return;
        }
        ComputableLiveData computableLiveData1 = this.b;
        Intrinsics.checkNotNullParameter(computableLiveData1, "this$0");
        do {
            AtomicBoolean atomicBoolean0 = computableLiveData1.d;
            int v = 0;
            boolean z1 = atomicBoolean0.compareAndSet(false, true);
            AtomicBoolean atomicBoolean1 = computableLiveData1.c;
            if(z1) {
                Object object0 = null;
                int v1 = 0;
                try {
                    while(atomicBoolean1.compareAndSet(true, false)) {
                        object0 = computableLiveData1.compute();
                        v1 = 1;
                    }
                    if(v1 != 0) {
                        computableLiveData1.getLiveData().postValue(object0);
                    }
                }
                finally {
                    atomicBoolean0.set(false);
                }
                v = v1;
            }
        }
        while(v != 0 && atomicBoolean1.get());
    }
}

