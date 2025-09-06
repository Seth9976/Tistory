package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;
import com.google.android.material.motion.MaterialBackHandler;

public final class a0 implements OnBackInvokedCallback {
    public final int a;
    public final Object b;

    public a0(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch(this.a) {
            case 0: {
                ((i0)this.b).v();
                return;
            }
            case 1: {
                ((Runnable)this.b).run();
                return;
            }
            default: {
                ((MaterialBackHandler)this.b).handleBackInvoked();
            }
        }
    }
}

