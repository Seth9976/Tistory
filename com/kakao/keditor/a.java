package com.kakao.keditor;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;

public final class a implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final KeditorView a;

    public a(KeditorView keditorView0) {
        this.a = keditorView0;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view0, View view1) {
        KeditorView.q(this.a, view0, view1);
    }
}

