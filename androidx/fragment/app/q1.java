package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition;

public final class q1 extends Transition.EpicenterCallback {
    public final int a;
    public final Rect b;

    public q1(int v, Rect rect0) {
        this.a = v;
        this.b = rect0;
        super();
    }

    @Override  // android.transition.Transition$EpicenterCallback
    public final Rect onGetEpicenter(Transition transition0) {
        if(this.a != 0) {
            return this.b != null && !this.b.isEmpty() ? this.b : null;
        }
        return this.b;
    }
}

