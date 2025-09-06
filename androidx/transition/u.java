package androidx.transition;

import android.graphics.Rect;

public final class u extends EpicenterCallback {
    public final Rect a;

    public u(Rect rect0) {
        this.a = rect0;
        super();
    }

    @Override  // androidx.transition.Transition$EpicenterCallback
    public final Rect onGetEpicenter(Transition transition0) {
        return this.a == null || this.a.isEmpty() ? null : this.a;
    }
}

