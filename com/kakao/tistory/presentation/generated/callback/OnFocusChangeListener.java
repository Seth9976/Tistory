package com.kakao.tistory.presentation.generated.callback;

import android.view.View.OnFocusChangeListener;
import android.view.View;

public final class OnFocusChangeListener implements View.OnFocusChangeListener {
    public interface Listener {
        void _internalCallbackOnFocusChange(int arg1, View arg2, boolean arg3);
    }

    public final Listener a;
    public final int b;

    public OnFocusChangeListener(Listener onFocusChangeListener$Listener0, int v) {
        this.a = onFocusChangeListener$Listener0;
        this.b = v;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public void onFocusChange(View view0, boolean z) {
        this.a._internalCallbackOnFocusChange(this.b, view0, z);
    }
}

