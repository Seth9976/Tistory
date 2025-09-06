package androidx.transition;

import android.graphics.Rect;

public final class o extends EpicenterCallback {
    public final Rect a;

    public o(Rect rect0) {
        this.a = rect0;
        super();
    }

    @Override  // androidx.transition.Transition$EpicenterCallback
    public final Rect onGetEpicenter(Transition transition0) {
        return this.a;
    }
}

