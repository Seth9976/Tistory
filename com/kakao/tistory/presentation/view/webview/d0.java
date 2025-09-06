package com.kakao.tistory.presentation.view.webview;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class d0 implements OnContextAvailableListener {
    public final Hilt_CommonWebViewActivity a;

    public d0(Hilt_CommonWebViewActivity hilt_CommonWebViewActivity0) {
        this.a = hilt_CommonWebViewActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

