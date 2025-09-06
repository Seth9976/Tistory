package com.kakao.tistory.presentation.view.setting;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class d implements OnContextAvailableListener {
    public final Hilt_SettingDefaultBlogActivity a;

    public d(Hilt_SettingDefaultBlogActivity hilt_SettingDefaultBlogActivity0) {
        this.a = hilt_SettingDefaultBlogActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

