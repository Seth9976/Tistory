package com.kakao.tistory.presentation.view.signup;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class b implements OnContextAvailableListener {
    public final Hilt_SignUpActivity a;

    public b(Hilt_SignUpActivity hilt_SignUpActivity0) {
        this.a = hilt_SignUpActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

