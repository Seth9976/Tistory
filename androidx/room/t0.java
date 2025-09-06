package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

public final class t0 implements Runnable {
    public final int a;
    public final MultiInstanceInvalidationClient b;

    public t0(MultiInstanceInvalidationClient multiInstanceInvalidationClient0, int v) {
        this.a = v;
        this.b = multiInstanceInvalidationClient0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(this.b, "this$0");
            Observer invalidationTracker$Observer0 = this.b.getObserver();
            this.b.b.removeObserver(invalidationTracker$Observer0);
            return;
        }
        MultiInstanceInvalidationClient multiInstanceInvalidationClient0 = this.b;
        Intrinsics.checkNotNullParameter(multiInstanceInvalidationClient0, "this$0");
        IMultiInstanceInvalidationService iMultiInstanceInvalidationService0 = multiInstanceInvalidationClient0.f;
        if(iMultiInstanceInvalidationService0 != null) {
            try {
                multiInstanceInvalidationClient0.e = iMultiInstanceInvalidationService0.registerCallback(multiInstanceInvalidationClient0.g, multiInstanceInvalidationClient0.a);
                Observer invalidationTracker$Observer1 = multiInstanceInvalidationClient0.getObserver();
                multiInstanceInvalidationClient0.b.addObserver(invalidationTracker$Observer1);
            }
            catch(RemoteException remoteException0) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", remoteException0);
            }
        }
    }
}

