package com.kakao.tistory.presentation.view.login;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class d implements OnContextAvailableListener {
    public final Hilt_TistroyLoginActivity a;

    public d(Hilt_TistroyLoginActivity hilt_TistroyLoginActivity0) {
        this.a = hilt_TistroyLoginActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

