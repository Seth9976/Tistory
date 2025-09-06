package com.kakao.tistory.presentation.view.editor;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class g6 implements OnContextAvailableListener {
    public final Hilt_EditorActivity a;

    public g6(Hilt_EditorActivity hilt_EditorActivity0) {
        this.a = hilt_EditorActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

