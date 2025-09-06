package com.kakao.tistory.presentation.view.setting;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class c implements OnContextAvailableListener {
    public final Hilt_SettingAppInfoActivity a;

    public c(Hilt_SettingAppInfoActivity hilt_SettingAppInfoActivity0) {
        this.a = hilt_SettingAppInfoActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

