package com.kakao.tistory.presentation.view.statistics;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class a implements OnContextAvailableListener {
    public final Hilt_RefererEtcListActivity a;

    public a(Hilt_RefererEtcListActivity hilt_RefererEtcListActivity0) {
        this.a = hilt_RefererEtcListActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

