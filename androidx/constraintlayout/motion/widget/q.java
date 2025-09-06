package androidx.constraintlayout.motion.widget;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class q implements View.OnTouchListener {
    public final int a;

    public q(int v) {
        this.a = v;
        super();
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return this.a != 0;
    }
}

