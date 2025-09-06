package j2;

import android.view.Choreographer.FrameCallback;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Dispatchers;

public final class k implements Choreographer.FrameCallback {
    public final int a;
    public final Object b;

    public k(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                ((Runnable)object0).run();
                return;
            }
            case 1: {
                ((Runnable)object0).run();
                return;
            }
            default: {
                ((CancellableContinuation)object0).resumeUndispatched(Dispatchers.getMain(), v);
            }
        }
    }
}

