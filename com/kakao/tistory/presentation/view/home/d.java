package com.kakao.tistory.presentation.view.home;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class d implements OnContextAvailableListener {
    public final Hilt_RefererKeywordListActivity a;

    public d(Hilt_RefererKeywordListActivity hilt_RefererKeywordListActivity0) {
        this.a = hilt_RefererKeywordListActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

