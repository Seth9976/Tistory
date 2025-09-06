package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public final class t1 implements Runnable {
    public final int a;
    public final ForwardingListener b;

    public t1(ForwardingListener forwardingListener0, int v) {
        this.a = v;
        this.b = forwardingListener0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            ForwardingListener forwardingListener0 = this.b;
            forwardingListener0.a();
            View view0 = forwardingListener0.d;
            if(view0.isEnabled() && !view0.isLongClickable() && forwardingListener0.onForwardingStarted()) {
                view0.getParent().requestDisallowInterceptTouchEvent(true);
                long v = SystemClock.uptimeMillis();
                MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
                view0.onTouchEvent(motionEvent0);
                motionEvent0.recycle();
                forwardingListener0.g = true;
            }
            return;
        }
        ViewParent viewParent0 = this.b.d.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(true);
        }
    }
}

