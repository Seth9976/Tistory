package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class f1 implements Runnable {
    public final int a;
    public final RoomTrackingLiveData b;

    public f1(RoomTrackingLiveData roomTrackingLiveData0, int v) {
        this.a = v;
        this.b = roomTrackingLiveData0;
        super();
    }

    @Override
    public final void run() {
        boolean z2;
        if(this.a != 0) {
            RoomTrackingLiveData roomTrackingLiveData0 = this.b;
            Intrinsics.checkNotNullParameter(roomTrackingLiveData0, "this$0");
            boolean z = roomTrackingLiveData0.hasActiveObservers();
            if(roomTrackingLiveData0.t.compareAndSet(false, true) && z) {
                roomTrackingLiveData0.getQueryExecutor().execute(roomTrackingLiveData0.w);
            }
            return;
        }
        RoomTrackingLiveData roomTrackingLiveData1 = this.b;
        Intrinsics.checkNotNullParameter(roomTrackingLiveData1, "this$0");
        if(roomTrackingLiveData1.v.compareAndSet(false, true)) {
            roomTrackingLiveData1.o.getInvalidationTracker().addWeakObserver(roomTrackingLiveData1.s);
        }
        do {
            AtomicBoolean atomicBoolean0 = roomTrackingLiveData1.u;
            boolean z1 = atomicBoolean0.compareAndSet(false, true);
            AtomicBoolean atomicBoolean1 = roomTrackingLiveData1.t;
            if(z1) {
                Object object0 = null;
                z2 = false;
                try {
                    while(atomicBoolean1.compareAndSet(true, false)) {
                        try {
                            object0 = roomTrackingLiveData1.r.call();
                            z2 = true;
                        }
                        catch(Exception exception0) {
                            throw new RuntimeException("Exception while computing database live data.", exception0);
                        }
                    }
                    if(z2) {
                        roomTrackingLiveData1.postValue(object0);
                    }
                }
                finally {
                    atomicBoolean0.set(false);
                }
            }
            else {
                z2 = false;
            }
        }
        while(z2 && atomicBoolean1.get());
    }
}

