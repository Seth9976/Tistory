package com.kakao.tistory.presentation.view.setting;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class e implements OnContextAvailableListener {
    public final Hilt_SettingListActivity a;

    public e(Hilt_SettingListActivity hilt_SettingListActivity0) {
        this.a = hilt_SettingListActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

