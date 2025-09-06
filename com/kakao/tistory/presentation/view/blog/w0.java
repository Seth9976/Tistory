package com.kakao.tistory.presentation.view.blog;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class w0 implements OnContextAvailableListener {
    public final Hilt_BlogFollowActivity a;

    public w0(Hilt_BlogFollowActivity hilt_BlogFollowActivity0) {
        this.a = hilt_BlogFollowActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

