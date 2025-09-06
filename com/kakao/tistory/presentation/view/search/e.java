package com.kakao.tistory.presentation.view.search;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class e implements OnContextAvailableListener {
    public final Hilt_SearchActivity a;

    public e(Hilt_SearchActivity hilt_SearchActivity0) {
        this.a = hilt_SearchActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

