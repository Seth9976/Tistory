package com.kakao.tistory.presentation;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class h implements OnContextAvailableListener {
    public final Hilt_TistoryMainActivity a;

    public h(Hilt_TistoryMainActivity hilt_TistoryMainActivity0) {
        this.a = hilt_TistoryMainActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

