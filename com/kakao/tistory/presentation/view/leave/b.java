package com.kakao.tistory.presentation.view.leave;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class b implements OnContextAvailableListener {
    public final Hilt_LeaveCompleteActivity a;

    public b(Hilt_LeaveCompleteActivity hilt_LeaveCompleteActivity0) {
        this.a = hilt_LeaveCompleteActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

