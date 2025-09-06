package com.kakao.tistory.presentation.view.login;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class c implements OnContextAvailableListener {
    public final Hilt_KakaoLoginActivity a;

    public c(Hilt_KakaoLoginActivity hilt_KakaoLoginActivity0) {
        this.a = hilt_KakaoLoginActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

