package com.kakao.tistory.presentation.view.toppost;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class c implements OnContextAvailableListener {
    public final Hilt_TopPostListActivity a;

    public c(Hilt_TopPostListActivity hilt_TopPostListActivity0) {
        this.a = hilt_TopPostListActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

