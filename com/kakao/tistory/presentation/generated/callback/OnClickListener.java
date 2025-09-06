package com.kakao.tistory.presentation.generated.callback;

import android.view.View.OnClickListener;
import android.view.View;

public final class OnClickListener implements View.OnClickListener {
    public interface Listener {
        void _internalCallbackOnClick(int arg1, View arg2);
    }

    public final Listener a;
    public final int b;

    public OnClickListener(Listener onClickListener$Listener0, int v) {
        this.a = onClickListener$Listener0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a._internalCallbackOnClick(this.b, view0);
    }
}

