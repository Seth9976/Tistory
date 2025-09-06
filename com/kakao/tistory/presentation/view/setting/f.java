package com.kakao.tistory.presentation.view.setting;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class f implements OnContextAvailableListener {
    public final Hilt_SettingPushActivity a;

    public f(Hilt_SettingPushActivity hilt_SettingPushActivity0) {
        this.a = hilt_SettingPushActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

