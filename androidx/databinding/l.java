package androidx.databinding;

import android.view.Choreographer.FrameCallback;

public final class l implements Choreographer.FrameCallback {
    public final ViewDataBinding a;

    public l(ViewDataBinding viewDataBinding0) {
        this.a = viewDataBinding0;
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        this.a.mRebindRunnable.run();
    }
}

