package com.kakao.tistory.presentation.view.exception;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class a implements OnContextAvailableListener {
    public final Hilt_TistoryGuideActivity a;

    public a(Hilt_TistoryGuideActivity hilt_TistoryGuideActivity0) {
        this.a = hilt_TistoryGuideActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

