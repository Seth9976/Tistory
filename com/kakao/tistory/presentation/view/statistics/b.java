package com.kakao.tistory.presentation.view.statistics;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class b implements OnContextAvailableListener {
    public final Hilt_StatisticsActivity a;

    public b(Hilt_StatisticsActivity hilt_StatisticsActivity0) {
        this.a = hilt_StatisticsActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

