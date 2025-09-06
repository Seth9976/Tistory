package com.kakao.tistory.presentation.view.setting.notice;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class c implements OnContextAvailableListener {
    public final Hilt_SettingNoticeListActivity a;

    public c(Hilt_SettingNoticeListActivity hilt_SettingNoticeListActivity0) {
        this.a = hilt_SettingNoticeListActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

