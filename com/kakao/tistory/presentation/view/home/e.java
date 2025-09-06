package com.kakao.tistory.presentation.view.home;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class e implements OnContextAvailableListener {
    public final Hilt_RefererLogListActivity a;

    public e(Hilt_RefererLogListActivity hilt_RefererLogListActivity0) {
        this.a = hilt_RefererLogListActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

