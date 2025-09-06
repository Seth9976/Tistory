package com.kakao.tistory.presentation.view.entry;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class j1 implements OnContextAvailableListener {
    public final Hilt_EntryViewActivity a;

    public j1(Hilt_EntryViewActivity hilt_EntryViewActivity0) {
        this.a = hilt_EntryViewActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

