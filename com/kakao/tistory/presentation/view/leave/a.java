package com.kakao.tistory.presentation.view.leave;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class a implements OnContextAvailableListener {
    public final Hilt_LeaveActivity a;

    public a(Hilt_LeaveActivity hilt_LeaveActivity0) {
        this.a = hilt_LeaveActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

