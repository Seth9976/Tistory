package com.kakao.tistory.presentation.blog;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class k implements OnContextAvailableListener {
    public final Hilt_BlogActivity a;

    public k(Hilt_BlogActivity hilt_BlogActivity0) {
        this.a = hilt_BlogActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

