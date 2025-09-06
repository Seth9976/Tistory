package com.kakao.tistory.presentation.view.comment.entry;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class b implements OnContextAvailableListener {
    public final Hilt_PostPinCommentActivity a;

    public b(Hilt_PostPinCommentActivity hilt_PostPinCommentActivity0) {
        this.a = hilt_PostPinCommentActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

