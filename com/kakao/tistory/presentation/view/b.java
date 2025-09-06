package com.kakao.tistory.presentation.view;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class b implements OnContextAvailableListener {
    public final Hilt_SplashActivity a;

    public b(Hilt_SplashActivity hilt_SplashActivity0) {
        this.a = hilt_SplashActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

