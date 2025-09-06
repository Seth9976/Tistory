package com.kakao.tistory.presentation.view.setting.secretLab;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class b implements OnContextAvailableListener {
    public final Hilt_SecretLabActivity a;

    public b(Hilt_SecretLabActivity hilt_SecretLabActivity0) {
        this.a = hilt_SecretLabActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

